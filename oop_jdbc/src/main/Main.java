package main;

import java.sql.*;
import java.util.Scanner;

public class Main {

    private static final String URL = "jdbc:mysql://localhost:3306/oop_jdbc";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Create");
            System.out.println("2. Read");
            System.out.println("3. Update");
            System.out.println("4. Delete");
            System.out.println("5. Exit");
            System.out.print("Select operation: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 ->
                    createRecord();
                case 2 ->
                    readRecords();
                case 3 ->
                    updateRecord();
                case 4 ->
                    deleteRecord();
                case 5 -> {
                    System.out.println("Exiting program.");
                    System.exit(0);
                }
                default ->
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static Connection connect() {
        try {
            return DriverManager.getConnection(URL);
        } catch (SQLException e) {

            System.out.println("Error connecting to the database: " + e.getMessage());
            throw new RuntimeException("Database connection error", e);
        }
    }

    private static void createRecord() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter firstname: ");
        String firstname = scanner.nextLine();

        System.out.print("Enter lastname: ");
        String lastname = scanner.nextLine();

        System.out.print("Enter address: ");
        String address = scanner.nextLine();

        String insertSQL = "INSERT INTO students (firstname, lastname, address) VALUES (?, ?, ?)";
        try (Connection connection = connect(); PreparedStatement statement = connection.prepareStatement(insertSQL)) {
            statement.setString(1, firstname);
            statement.setString(2, lastname);
            statement.setString(3, address);
            statement.executeUpdate();
            System.out.println("Record created successfully.");
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void readRecords() {
        String selectSQL = "SELECT * FROM students";
        try (Connection connection = connect(); PreparedStatement statement = connection.prepareStatement(selectSQL); ResultSet resultSet = statement.executeQuery()) {
            String line = "------------------------------------------------------";
            System.out.printf("%-5s%-15s%-15s%-15s%n", "ID", "Firstname", "Lastname", "Address");
            System.out.println(line);

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String firstname = resultSet.getString("firstname");
                String lastname = resultSet.getString("lastname");
                String address = resultSet.getString("address");
                System.out.printf("%-5d%-15s%-15s%-15s%n", id, firstname, lastname, address);
            }
            System.out.println(line);
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void updateRecord() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter ID where to update student: ");
        int id = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Enter new firstname: ");
        String firstname = scanner.nextLine();

        System.out.print("Enter new lastname: ");
        String lastname = scanner.nextLine();

        System.out.print("Enter new address: ");
        String address = scanner.nextLine();

        String updateSQL = "UPDATE students SET firstname=?, lastname=?, address=? WHERE id=?";
        try (Connection connection = connect(); PreparedStatement statement = connection.prepareStatement(updateSQL)) {

            statement.setString(1, firstname);
            statement.setString(2, lastname);
            statement.setString(3, address);
            statement.setInt(4, id);
            int affectedRows = statement.executeUpdate();

            if (affectedRows > 0) {
                System.out.println("Record updated successfully.");
            } else {
                System.out.println("No record found with ID: " + id);
            }

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void deleteRecord() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter record ID to delete: ");
        int id = scanner.nextInt();

        String deleteSQL = "DELETE FROM students WHERE id=?";
        try (Connection connection = connect(); PreparedStatement statement = connection.prepareStatement(deleteSQL)) {

            statement.setInt(1, id);
            int affectedRows = statement.executeUpdate();

            if (affectedRows > 0) {
                System.out.println("Record deleted successfully.");
            } else {
                System.out.println("No record found with ID: " + id);
            }

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
