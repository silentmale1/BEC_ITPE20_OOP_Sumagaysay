public class MathUtils {
    public static double calculateAverage(double[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return 0.0;
        }

        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }

        return sum / numbers.length;
    }

    public static void main(String[] args) {
        double[] values = { 12.5, 6.8, 9.0, 15.4, 7.2 };

        double average = MathUtils.calculateAverage(values);

        System.out.println("Average: " + average);
    }
}
