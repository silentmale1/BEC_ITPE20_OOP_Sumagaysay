/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author asus
 */
public class Conversion extends javax.swing.JFrame {

     
    /**
     * 
     * Creates new form Conversion
     */
    private static int fromUnit, toUnit;
    public Conversion() {
        initComponents();
        jTextField2.setEditable(false); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Volume Conversion");
        setBackground(new java.awt.Color(102, 102, 102));
        setResizable(false);

        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Liters", "UK Gallons", "Cubic Centimetres", "Cubic Meters", "Cubic Inches", "Mililiters", "Cubic Feet", " " }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jComboBox2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Liters", "UK Gallons", "Cubic Centimetres", "Cubic Meters", "Cubic Inches", "Mililiters", "Cubic Feet" }));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("To");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("From");

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(51, 0, 51));
        jTextField3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(255, 255, 255));
        jTextField3.setText("Volume Converter");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Convert");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(189, 189, 189))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(176, 176, 176)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
       
      
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        
    }//GEN-LAST:event_jTextField2ActionPerformed
@SuppressWarnings("static-access")
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        String from = jComboBox1.getSelectedItem().toString();
        String to = jComboBox2.getSelectedItem().toString();
        switch (from) {
            case "Liters":
                this.fromUnit = 1;
                break;
            case "UK Gallons":
                this.fromUnit = 2;
                break;
            case "Cubic Centimetres":
                this.fromUnit = 3;
                break;
            case "Cubic Meters":
                this.fromUnit = 4;
                break;
            case "Cubic Inches":
                this.fromUnit = 5;
                break;
            case "Mililiters":
                this.fromUnit = 6;
                break;
            case "Cubic Feet":
                this.fromUnit = 7;
                break;
            default:
                throw new AssertionError();
        }
        switch (to) {
            case "Liters":
                this.toUnit = 1;
                break;
            case "UK Gallons":
                this.toUnit = 2;
                break;
            case "Cubic Centimetres":
                this.toUnit = 3;
                break;
            case "Cubic Meters":
                this.toUnit = 4;
                break;
            case "Cubic Inches":
                this.toUnit = 5;
                break;
            case "Mililiters":
                this.toUnit = 6;
                break;
            case "Cubic Feet":
                this.toUnit = 7;
                break;
            default:
                throw new AssertionError();
        }
        try {
            if (!jTextField1.getText().isBlank()) {
                double speed = Double.parseDouble(jTextField1.getText());
                jTextField1.setText(jTextField1.getText().trim());
                double convertedVolume = convertVolume(speed, this.fromUnit, this.toUnit);
                jTextField2.setText(String.valueOf(convertedVolume));
            }
        } catch (NumberFormatException e) {
            jTextField2.setText("Do not include special characters.");
        }
    
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed
       
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Conversion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Conversion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Conversion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Conversion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() ->{
            
                new Conversion().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables

private static double convertVolume(double speed, int fromUnit, int toUnit) {
        switch (fromUnit) {
            case 1 -> {
                // Meters per second
                return convertToLiters(speed, toUnit);
            }
            case 2 -> {
                // Meters per hour
                return convertToUKGallons(speed, toUnit);
            }
            case 3 -> {
                // Kilometers per hour
                return convertToCubicCenti(speed, toUnit);
            }
            case 4 -> {
                // Inches per second
                return convertToCubicMeters(speed, toUnit);
            }
            case 5 -> {
                // Inches per hour
                return convertToCubicInches(speed, toUnit);
            }
            case 6 -> {
                // Feet per second
                return convertToMililiters(speed, toUnit);
            }
            case 7 -> {
                // Feet per hour
                return convertToCubicFeet(speed, toUnit);
            }
        
            default -> {
                System.out.println("Invalid input. Please enter a number from 1 to 10.");
                return 0.0;
            }
        }
    }

    private static double convertToLiters(double speed, int toUnit) {
        switch (toUnit) {
            case 1 -> {
                
                return speed;
            }
            case 2 -> {
                // Liter to UK Gallons
                return speed / 4.546;
            }
            case 3 -> {
                // Liter to Cubic Centimeters
                return speed * 1000.0;
            }
            case 4 -> {
                // Liter to Cubic Meters
                return speed / 1000.0;
            }
            case 5 -> {
                // Liter to Cubic Inches
                return speed * 61.02; // 1 inch per second = 141732 inches per hour
            }
            case 6 -> {
                // Liter to Mililiters
                return speed * 1000.0;
            }
            case 7 -> {
                // Liter to Cubic Feet
                return speed / 28.32; // 1 foot per second = 11811 feet per hour
            }
         
            default -> {
                System.out.println("Invalid input. Please enter a number from 1 to 10.");
                return 0.0;
            }
        }
    }

    private static double convertToUKGallons(double speed, int toUnit) {
        switch (toUnit) {
            case 1 -> {
                // UK Gallons to Liter
                return speed * 4.546;
            }
            case 2 -> {
                
                return speed;
            }
            case 3 -> {
                // UK Gallons to Cubic CentiMeters
                return speed * 4546.0;
            }
            case 4 -> {
                // UK Gallons to Cubic Meters
                return speed / 220.0;
            }
            case 5 -> {
                // UK Gallons to Cubic Inches
                return speed * 277.4;
            }
            case 6 -> {
                // UK Gallons to Mililiters
                return speed * 4546.0;
            }
            case 7 -> {
                // UK Gallons to Cubic Foot
                return speed / 6.229;
            }
        
            default -> {
                System.out.println("Invalid input. Please enter a number from 1 to 10.");
                return 0.0;
            }
        }
    }

    private static double convertToCubicCenti(double speed, int toUnit) {
        switch (toUnit) {
            case 1 -> {
                // Cubic Centimeters to Liter
                return speed / 1000.0;
            }
            case 2 -> {
                // Cubic Centimeters to UK Gallons
                return speed / 4546.0;
            }
            case 3 -> {
                
                return speed ;
            }
            case 4 -> {
                // Cubic Centimeters to Cubic Meters
                return speed / 1000000.0;
            }
            case 5 -> {
                // Cubic Centimeters to Cubic Inches
                return speed / 16.39;
            }
            case 6 -> {
                // Cubic Centimeters to Mililiters
                return speed * 1.0;
            }
            case 7 -> {
                // Cubic Centimeters to Cubic Feet
                return speed / 28320.0;
            }
        
            default -> {
                System.out.println("Invalid input. Please enter a number from 1 to 10.");
                return 0.0;
            }
        }
    }

    private static double convertToCubicMeters(double speed, int toUnit) {
        switch (toUnit) {
            case 1 -> {
                // Cubic Meters to Liters
                return speed * 1000.0;
            }
            case 2 -> {
                // Cubic Meters to UK Gallons
                return speed * 220.0;
            }
            case 3 -> {
                // Cubic Meters to Cubic Centimeters
                return speed * 1000000.0;
            }
            case 4 -> {
                // 
                return speed ;
            }
            case 5 -> {
                // Cubic Meters to Cubic Inches
                return speed * 61020;
            }
            case 6 -> {
                // Cubic Meters to Mililiters
                return speed * 1000000;
            }
            case 7 -> {
                // Cubic Meters to Cubic Feet
                return speed * 35.31;
            }
         
            default -> {
                System.out.println("Invalid input. Please enter a number from 1 to 10.");
                return 0.0;
            }
        }
    }

    private static double convertToCubicInches(double speed, int toUnit) {
        switch (toUnit) {
            case 1 -> {
                // Cubic Inches to Liters
                return speed / 61.02;
            }
            case 2 -> {
                // Cubic Inches to UK Gallons
                return speed / 277.4;
            }
            case 3 -> {
                // Cubic Inches to Cubic Centimeters
                return speed * 16.39;
            }
            case 4 -> {
                // Cubic Inches to Cubic Meters
                return speed / 61020;
            }
            case 5 -> {
                
                return speed ;
            }
            case 6 -> {
                // Cubic Inches to Mililiters
                return speed * 16.39;
            }
            case 7 -> {
                // Cubic Inches to Cubic Feet
                return speed / 1728.0;
            }
        
            default -> {
                System.out.println("Invalid input. Please enter a number from 1 to 10.");
                return 0.0;
            }
        }
    }

    private static double convertToMililiters(double speed, int toUnit) {
        switch (toUnit) {
            case 1 -> {
                // Mililiters to Liters
                return speed / 1000.0;
            }
            case 2 -> {
                // Mililiters to UK Gallons
                return speed / 4546.0;
            }
            case 3 -> {
                // Mililiters to Cubic Centimeters
                return speed * 1.0;
            }
            case 4 -> {
                // Mililiters to Cubic Meters
                return speed / 1000000;
            }
            case 5 -> {
                // Mililiters to Cubic Inches
                return speed / 16.39;
            }
            case 6 -> {
               
                return speed ;
            }
            case 7 -> {
                // Mililiters to Cubic Feet
                return speed / 28320.0;
            }
        
            default -> {
                System.out.println("Invalid input. Please enter a number from 1 to 10.");
                return 0.0;
            }
        }
    }
    private static double convertToCubicFeet(double speed, int toUnit) {
        switch (toUnit) {
            case 1 -> {
                // Cubic Feet to Liters
                return speed * 28.32;
            }
            case 2 -> {
                // Cubic Feet to UK Gallons
                return speed * 6.229;
            }
            case 3 -> {
                // Cubic Feet to Cubic Centimeters
                return speed * 28320.0;
            }
            case 4 -> {
                // Cubic Feet to Cubic Meters
                return speed / 35.31;
            }
            case 5 -> {
                // Cubic Feet to Cubic Inches
                return speed * 1728.0;
            }
            case 6 -> {
               // Cubic Feet to Mililiters
                return speed * 28320.0;
            }
            case 7 -> {
                
                return speed ;
            }
        
            default -> {
                System.out.println("Invalid input. Please enter a number from 1 to 10.");
                return 0.0;
            }
        }
    }
}

    
