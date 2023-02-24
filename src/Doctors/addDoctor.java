package Doctors;

import Admins.doctorManagement;
import Main.Connector;
import Main.Hospital;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


/**
 *
 * @author Raheez
 */
public class addDoctor extends javax.swing.JFrame {

    Connection connection = null;
    PreparedStatement prp = null;
    ResultSet rs = null;

    public addDoctor() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDateTime now = LocalDateTime.now();  
        String date=dtf.format(now);

        initComponents();
           jLabel12.setText(date);
        ImageIcon ic = new ImageIcon(getClass().getResource("/Images/hospital.png"));
        this.setIconImage(ic.getImage());
        
        String sql = "select count,date,id,name,age,gender,blood,dept,phone,email,status,address,username from doctor";
        connection = Connector.ConnectDb();
        int a = 0;
        
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
        
        dIdField.setText("RS"+a+"HMSZ");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        dIdField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        dNameField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        dAgeField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Gender = new javax.swing.JLabel();
        dPhoneField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        dAddressField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        dGenderField = new javax.swing.JComboBox<>();
        dStatusField = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        dBloodField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        dEmailField = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        dUserField = new javax.swing.JTextField();
        dPassField = new javax.swing.JPasswordField();
        dDeptField = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add new Doctor");
        setPreferredSize(new java.awt.Dimension(1400, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(1260, 583));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("Joining Date");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, -1, -1));

        dIdField.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        dIdField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dIdFieldActionPerformed(evt);
            }
        });
        jPanel2.add(dIdField, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 191, -1));

        jLabel2.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("Id");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 98, -1));

        dNameField.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        dNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dNameFieldActionPerformed(evt);
            }
        });
        jPanel2.add(dNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 191, -1));

        jLabel3.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setText("Name");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 98, -1));

        jLabel4.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 153));
        jLabel4.setText("Age");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 98, -1));

        dAgeField.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        dAgeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dAgeFieldActionPerformed(evt);
            }
        });
        jPanel2.add(dAgeField, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 191, -1));

        jLabel5.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 153));
        jLabel5.setText("Gender");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 98, -1));

        Gender.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        Gender.setForeground(new java.awt.Color(0, 153, 153));
        Gender.setText("Department");
        jPanel2.add(Gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 135, -1));

        dPhoneField.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        dPhoneField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dPhoneFieldActionPerformed(evt);
            }
        });
        jPanel2.add(dPhoneField, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 80, 188, -1));

        jLabel7.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 153));
        jLabel7.setText("Phone Number");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 80, 135, -1));

        jLabel8.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 153));
        jLabel8.setText("Maritial Status");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 140, 160, -1));

        dAddressField.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        dAddressField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dAddressFieldActionPerformed(evt);
            }
        });
        jPanel2.add(dAddressField, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 170, 188, -1));

        jLabel9.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 153));
        jLabel9.setText("Address");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 170, 140, -1));

        dGenderField.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        dGenderField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Item", "Male", "Female" }));
        dGenderField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dGenderFieldActionPerformed(evt);
            }
        });
        jPanel2.add(dGenderField, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 191, 25));

        dStatusField.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        dStatusField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Item", "Single", "Married", "Divorced" }));
        dStatusField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dStatusFieldActionPerformed(evt);
            }
        });
        jPanel2.add(dStatusField, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 140, 188, 25));

        jLabel6.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 153));
        jLabel6.setText("Blood group");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 130, -1));

        dBloodField.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        dBloodField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dBloodFieldActionPerformed(evt);
            }
        });
        jPanel2.add(dBloodField, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 191, -1));

        jLabel10.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 153, 153));
        jLabel10.setText("Email");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 110, 137, -1));

        dEmailField.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        dEmailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dEmailFieldActionPerformed(evt);
            }
        });
        jPanel2.add(dEmailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 110, 188, -1));

        jLabel15.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 153, 153));
        jLabel15.setText("Password");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 230, -1, -1));

        jLabel11.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 153, 153));
        jLabel11.setText("Username");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 200, 110, -1));

        dUserField.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        dUserField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dUserFieldActionPerformed(evt);
            }
        });
        jPanel2.add(dUserField, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 200, 190, -1));

        dPassField.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jPanel2.add(dPassField, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 230, 190, -1));

        dDeptField.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        dDeptField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Department", "Medecine", "Dental", "Gynaecology", "Nutrition", "Neurology", "Cardiology", "Haematology", "Microbiology" }));
        jPanel2.add(dDeptField, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 191, -1));

        jButton2.setBackground(new java.awt.Color(104, 185, 132));
        jButton2.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 350, 310, 30));

        jButton1.setBackground(new java.awt.Color(255, 0, 51));
        jButton1.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("adD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 390, 310, 30));

        jButton3.setBackground(new java.awt.Color(255, 0, 0));
        jButton3.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("BACK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, -1, -1));

        jButton4.setBackground(new java.awt.Color(255, 0, 0));
        jButton4.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Home");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 350, -1, -1));

        jLabel12.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
        jLabel12.setText("jLabel12");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, -1, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 8, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 1000, 520));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/new1.jpg"))); // NOI18N
        jLabel13.setText("jLabel13");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void dIdFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dIdFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dIdFieldActionPerformed

    private void dNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dNameFieldActionPerformed

    private void dAgeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dAgeFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dAgeFieldActionPerformed

    private void dPhoneFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dPhoneFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dPhoneFieldActionPerformed

    private void dAddressFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dAddressFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dAddressFieldActionPerformed

    private void dGenderFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dGenderFieldActionPerformed

    }//GEN-LAST:event_dGenderFieldActionPerformed

    private void dStatusFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dStatusFieldActionPerformed

    }//GEN-LAST:event_dStatusFieldActionPerformed

    private void dBloodFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dBloodFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dBloodFieldActionPerformed

    private void dEmailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dEmailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dEmailFieldActionPerformed

    private void dUserFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dUserFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dUserFieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                connection = Connector.ConnectDb();
        if (connection != null) {
            String date = jLabel12.getText();
            String id = dIdField.getText();
            String name = dNameField.getText();
            int age = Integer.parseInt(dAgeField.getText());
            String gender = (String) dGenderField.getSelectedItem();
            String blood = dBloodField.getText();
            String dept = (String) dDeptField.getSelectedItem();
            String phone = dPhoneField.getText();
            String email = dEmailField.getText();
            String status = (String) dStatusField.getSelectedItem();
            String address = dAddressField.getText();
            String user = dUserField.getText();
            String pass = String.valueOf(dPassField.getPassword());
            String sql = "insert into doctor(date,id,name,age,gender,blood,dept,phone,email,status,address,username,password) values (?,?,?,?,?,?,?,?,?,?,?,?,?)";
            try {
                prp = connection.prepareStatement(sql);
                prp.setString(1, date);
                prp.setString(2, id);
                prp.setString(3, name);
                prp.setInt(4, age);
                prp.setString(5, gender);
                prp.setString(6, blood);
                prp.setString(7, dept);
                prp.setString(8, phone);
                prp.setString(9, email);
                prp.setString(10, status);
                prp.setString(11, address);
                prp.setString(12, user);
                prp.setString(13, pass);
                prp.execute();
                JOptionPane.showMessageDialog(null, "Data Saved");
                int a = 0;
        
        if(connection != null){
            sql = "select count from doctor";
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
        
        dIdField.setText("RS"+a+"HMSZ");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       String sql = "select count,date,id,name,age,gender,blood,dept,phone,email,status,address,username from doctor";
        connection = Connector.ConnectDb();
        int a = 0;
        
        if(connection != null){
            
            try{
                prp = connection.prepareStatement(sql);      
                rs= prp.executeQuery();
                while(rs.next()){
                    a = rs.getInt("count");
                }
            
            }
            catch(SQLException e){
                System.out.println("error");
            }
        }
        

        dIdField.setText("RS"+ a +"HMSZ");
        dNameField.setText("");
        dAgeField.setText("");
        dDeptField.setSelectedIndex(0);
        dPhoneField.setText("");
        dAddressField.setText("");
        dGenderField.setSelectedIndex(0);
        dStatusField.setSelectedIndex(0);
        dUserField.setText("");
        dPassField.setText("");
        dEmailField.setText("");
        dBloodField.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        doctorManagement pActivity = new doctorManagement();
        pActivity.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Hospital hospital = new Hospital();
        hospital.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new addDoctor().setVisible(true);
            
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Gender;
    private javax.swing.JTextField dAddressField;
    private javax.swing.JTextField dAgeField;
    private javax.swing.JTextField dBloodField;
    private javax.swing.JComboBox<String> dDeptField;
    private javax.swing.JTextField dEmailField;
    private javax.swing.JComboBox<String> dGenderField;
    private javax.swing.JTextField dIdField;
    private javax.swing.JTextField dNameField;
    private javax.swing.JPasswordField dPassField;
    private javax.swing.JTextField dPhoneField;
    private javax.swing.JComboBox<String> dStatusField;
    private javax.swing.JTextField dUserField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
