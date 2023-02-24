package Receptionists;

import Admins.ReceptionistManagement;
import Main.Hospital;
import Main.Connector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Raheez
 */
public class addReceptionist extends javax.swing.JFrame {
    Connection connection = null;
    PreparedStatement prp = null;
        String Date;
    public addReceptionist() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDateTime now = LocalDateTime.now();  
        String date=dtf.format(now);
        
        Date = date;
        initComponents();
        jLabel12.setText(date);
        ImageIcon ic = new ImageIcon(getClass().getResource("/Images/hospital.png"));
        this.setIconImage(ic.getImage());
        
                String sql = "select count from receptionist";
        connection = Connector.ConnectDb();
        int a = 0;
        ResultSet rs = null;

        if(connection != null){
            
            try{
                prp = connection.prepareStatement(sql);      
                rs= prp.executeQuery();
                while(rs.next()){
                    a = rs.getInt("count");
                }
                System.out.println(a);
            
            }
            catch(SQLException e){
                System.out.println("error");
            }
        }
        
        rIdField.setText("RS"+a+"HMSZR");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        rIdField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        rNameField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        rAgeField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        rBloodField = new javax.swing.JTextField();
        blood = new javax.swing.JLabel();
        rPhoneField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        rAddressField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        rEmailField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        rGenderField = new javax.swing.JComboBox<>();
        rStatusField = new javax.swing.JComboBox<>();
        rUserField = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        rPassField = new javax.swing.JPasswordField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add Receptionist !");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("Date");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 35, 80, -1));

        rIdField.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        rIdField.setText("RS0HMSZR");
        rIdField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rIdFieldActionPerformed(evt);
            }
        });
        jPanel1.add(rIdField, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 95, 218, 22));

        jLabel2.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("Id");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 95, 80, -1));

        rNameField.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        rNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rNameFieldActionPerformed(evt);
            }
        });
        jPanel1.add(rNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 145, 218, 22));

        jLabel3.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setText("Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 145, 80, -1));

        jLabel4.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 153));
        jLabel4.setText("Age");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 203, 80, -1));

        rAgeField.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        rAgeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rAgeFieldActionPerformed(evt);
            }
        });
        jPanel1.add(rAgeField, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 203, 218, 22));

        jLabel5.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 153));
        jLabel5.setText("Gender");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 258, 80, -1));

        rBloodField.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        rBloodField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBloodFieldActionPerformed(evt);
            }
        });
        jPanel1.add(rBloodField, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 312, 218, 22));

        blood.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        blood.setForeground(new java.awt.Color(0, 153, 153));
        blood.setText("Blood Group");
        jPanel1.add(blood, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 312, 125, -1));

        rPhoneField.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        rPhoneField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rPhoneFieldActionPerformed(evt);
            }
        });
        jPanel1.add(rPhoneField, new org.netbeans.lib.awtextra.AbsoluteConstraints(796, 35, 200, 22));

        jLabel7.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 153));
        jLabel7.setText("Phone Number");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(612, 35, 135, -1));

        jLabel8.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 153));
        jLabel8.setText("Maritial Status");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(612, 188, -1, -1));

        rAddressField.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        rAddressField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rAddressFieldActionPerformed(evt);
            }
        });
        jPanel1.add(rAddressField, new org.netbeans.lib.awtextra.AbsoluteConstraints(796, 138, 200, 22));

        jLabel9.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 153));
        jLabel9.setText("Address");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(612, 145, 88, -1));

        rEmailField.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        rEmailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rEmailFieldActionPerformed(evt);
            }
        });
        jPanel1.add(rEmailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(796, 86, 200, 22));

        jLabel13.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 153, 153));
        jLabel13.setText("Email");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(612, 86, 104, -1));

        rGenderField.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        rGenderField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Item", "Male", "Female" }));
        rGenderField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rGenderFieldActionPerformed(evt);
            }
        });
        jPanel1.add(rGenderField, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 257, 218, 25));

        rStatusField.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        rStatusField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Item", "Single", "Married", "Divorced" }));
        rStatusField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rStatusFieldActionPerformed(evt);
            }
        });
        jPanel1.add(rStatusField, new org.netbeans.lib.awtextra.AbsoluteConstraints(796, 187, 200, 25));

        rUserField.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        rUserField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rUserFieldActionPerformed(evt);
            }
        });
        jPanel1.add(rUserField, new org.netbeans.lib.awtextra.AbsoluteConstraints(796, 241, 200, 22));

        jLabel17.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 153, 153));
        jLabel17.setText("Password");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(612, 289, 117, -1));

        jLabel20.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 153, 153));
        jLabel20.setText("Username");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(612, 241, 140, -1));

        rPassField.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        rPassField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rPassFieldActionPerformed(evt);
            }
        });
        jPanel1.add(rPassField, new org.netbeans.lib.awtextra.AbsoluteConstraints(796, 289, 200, -1));

        jButton3.setBackground(new java.awt.Color(255, 0, 0));
        jButton3.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("BACK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(369, 392, -1, 34));

        jButton4.setBackground(new java.awt.Color(255, 0, 0));
        jButton4.setFont(new java.awt.Font("Baskerville Old Face", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Home");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(796, 392, -1, 34));

        jButton1.setBackground(new java.awt.Color(104, 185, 132));
        jButton1.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(473, 392, 279, 34));

        jButton2.setBackground(new java.awt.Color(104, 185, 132));
        jButton2.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Add");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(473, 438, 279, 32));

        jLabel12.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
        jLabel12.setText("jLabel12");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/new1.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rIdFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rIdFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rIdFieldActionPerformed

    private void rNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rNameFieldActionPerformed

    private void rAgeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rAgeFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rAgeFieldActionPerformed

    private void rBloodFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBloodFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rBloodFieldActionPerformed

    private void rPhoneFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rPhoneFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rPhoneFieldActionPerformed

    private void rAddressFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rAddressFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rAddressFieldActionPerformed

    private void rEmailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rEmailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rEmailFieldActionPerformed

    private void rGenderFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rGenderFieldActionPerformed

    }//GEN-LAST:event_rGenderFieldActionPerformed

    private void rStatusFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rStatusFieldActionPerformed

    }//GEN-LAST:event_rStatusFieldActionPerformed

    private void rUserFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rUserFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rUserFieldActionPerformed

    private void rPassFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rPassFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rPassFieldActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        ReceptionistManagement pActivity = new ReceptionistManagement();
        pActivity.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Hospital hospital = new Hospital();
        hospital.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         String sql = "select count from receptionist";
        connection = Connector.ConnectDb();
        int a = 0;
        ResultSet rs = null;

        if(connection != null){
            
            try{
                prp = connection.prepareStatement(sql);       
                rs= prp.executeQuery();
                while(rs.next()){
                    a = rs.getInt("count");
                }
                System.out.println(a);
            
            }
            catch(SQLException e){
                System.out.println("error");
            }
        }
        
        rNameField.setText("");
        rIdField.setText("RS"+a+"HMSZR");
        rAgeField.setText("");
        rGenderField.setSelectedIndex(0);
        rBloodField.setText("");
        rPhoneField.setText("");
        rEmailField.setText("");
        rAddressField.setText("");
        rStatusField.setSelectedIndex(0);
        rUserField.setText("");
        rPassField.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         connection = Connector.ConnectDb();
        if (connection != null) {
            String id = rIdField.getText();
            String name = rNameField.getText();
            int age = Integer.parseInt(rAgeField.getText());
            String gender = (String) rGenderField.getSelectedItem();
            String rblood = rBloodField.getText();
            String email = rEmailField.getText();
            String phone = rPhoneField.getText();
            String address = rAddressField.getText();
            String status = (String) rStatusField.getSelectedItem();
            String user = rUserField.getText();
            String pass = String.valueOf(rPassField.getPassword());
            String sql = "insert into receptionist(joining,id,name,age,gender,blood,email,phone,address,status,username,password) values (?,?,?,?,?,?,?,?,?,?,?,?)";
            try {
                prp = connection.prepareStatement(sql);
                prp.setString(1, Date);
                prp.setString(2, id);
                prp.setString(3, name);
                prp.setInt(4, age);
                prp.setString(5, gender);
                prp.setString(6, rblood);
                prp.setString(7, email);
                prp.setString(8, phone);
                prp.setString(9, address);
                prp.setString(10, status);
                prp.setString(11, user);
                prp.setString(12, pass);
                prp.execute();
                JOptionPane.showMessageDialog(null, "Data Saved");
                int a = 0;
        ResultSet rs = null;

        if(connection != null){
             sql = "select count from receptionist";
            try{
                prp = connection.prepareStatement(sql);      
                rs= prp.executeQuery();
                while(rs.next()){
                    a = rs.getInt("count");
                }
                System.out.println(a);
            
            }
            catch(SQLException e){
                System.out.println("error");
            }
        }
        
        rIdField.setText("RS"+a+"HMSZR");
            } catch (SQLException e) {
                 JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new addReceptionist().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel blood;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField rAddressField;
    private javax.swing.JTextField rAgeField;
    private javax.swing.JTextField rBloodField;
    private javax.swing.JTextField rEmailField;
    private javax.swing.JComboBox<String> rGenderField;
    private javax.swing.JTextField rIdField;
    private javax.swing.JTextField rNameField;
    private javax.swing.JPasswordField rPassField;
    private javax.swing.JTextField rPhoneField;
    private javax.swing.JComboBox<String> rStatusField;
    private javax.swing.JTextField rUserField;
    // End of variables declaration//GEN-END:variables
}
