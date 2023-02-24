package Receptionists;

import Patient.*;
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
public class newPatient extends javax.swing.JFrame {

    Connection connection = null;
    PreparedStatement prp = null;
        String Date;

    

    public newPatient() {
         DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDateTime now = LocalDateTime.now();  
        String date=dtf.format(now);
        
        Date = date;
        initComponents();
        jLabel12.setText(date);
        ImageIcon ic = new ImageIcon(getClass().getResource("/Images/hospital.png"));
        this.setIconImage(ic.getImage());
        
        String sql = "select count from patient";
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
        
        pIdField.setText("RS"+a+"HMSZP");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pIdField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        pNameField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pAgeField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        pAddressField = new javax.swing.JTextField();
        Gender = new javax.swing.JLabel();
        pPhoneField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        pDiseaseField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        pGenderField = new javax.swing.JComboBox<>();
        pStatusField = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        addDctorbtn = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        clearPbtn = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add Patient");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("Date");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 144, 78, -1));

        pIdField.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        pIdField.setText("RS0HMSZP");
        pIdField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pIdFieldActionPerformed(evt);
            }
        });
        jPanel1.add(pIdField, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 198, 183, 22));

        jLabel2.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("Id");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 198, 84, -1));

        pNameField.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        pNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pNameFieldActionPerformed(evt);
            }
        });
        jPanel1.add(pNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 253, 183, 22));

        jLabel3.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setText("Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 253, 84, -1));

        jLabel4.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 153));
        jLabel4.setText("Age");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 307, 84, -1));

        pAgeField.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        pAgeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pAgeFieldActionPerformed(evt);
            }
        });
        jPanel1.add(pAgeField, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 307, 149, 22));

        jLabel5.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 153));
        jLabel5.setText("Gender");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 364, 78, -1));

        pAddressField.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        pAddressField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pAddressFieldActionPerformed(evt);
            }
        });
        jPanel1.add(pAddressField, new org.netbeans.lib.awtextra.AbsoluteConstraints(707, 144, 173, 22));

        Gender.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        Gender.setForeground(new java.awt.Color(0, 153, 153));
        Gender.setText("Address");
        jPanel1.add(Gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(534, 144, 135, -1));

        pPhoneField.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        pPhoneField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pPhoneFieldActionPerformed(evt);
            }
        });
        jPanel1.add(pPhoneField, new org.netbeans.lib.awtextra.AbsoluteConstraints(707, 198, 173, 22));

        jLabel7.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 153));
        jLabel7.setText("Phone Number");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(534, 198, -1, -1));

        jLabel8.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 153));
        jLabel8.setText("Maritial Status");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(534, 253, -1, -1));

        pDiseaseField.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        pDiseaseField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pDiseaseFieldActionPerformed(evt);
            }
        });
        jPanel1.add(pDiseaseField, new org.netbeans.lib.awtextra.AbsoluteConstraints(706, 307, 130, 22));

        jLabel9.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 153));
        jLabel9.setText("Disease Name");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(534, 307, 148, -1));

        pGenderField.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        pGenderField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Item", "Male", "Female" }));
        pGenderField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pGenderFieldActionPerformed(evt);
            }
        });
        jPanel1.add(pGenderField, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 363, 189, 25));

        pStatusField.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        pStatusField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Item", "Single", "Married", "Divorced" }));
        pStatusField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pStatusFieldActionPerformed(evt);
            }
        });
        jPanel1.add(pStatusField, new org.netbeans.lib.awtextra.AbsoluteConstraints(707, 252, 173, 25));

        jPanel6.setBackground(new java.awt.Color(104, 185, 132));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel6MouseClicked(evt);
            }
        });

        addDctorbtn.setFont(new java.awt.Font("Algerian", 0, 24)); // NOI18N
        addDctorbtn.setForeground(new java.awt.Color(255, 255, 255));
        addDctorbtn.setText("Add");
        addDctorbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addDctorbtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(addDctorbtn)
                .addContainerGap(93, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addDctorbtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(442, 483, -1, -1));

        jPanel7.setBackground(new java.awt.Color(102, 102, 102));
        jPanel7.setPreferredSize(new java.awt.Dimension(100, 100));
        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel7MouseClicked(evt);
            }
        });
        jPanel7.setLayout(null);

        clearPbtn.setFont(new java.awt.Font("Algerian", 0, 23)); // NOI18N
        clearPbtn.setForeground(new java.awt.Color(255, 255, 255));
        clearPbtn.setText("Clear");
        clearPbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearPbtnMouseClicked(evt);
            }
        });
        jPanel7.add(clearPbtn);
        clearPbtn.setBounds(70, 0, 90, 43);

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(442, 434, 221, 43));

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 483, 221, 42));

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Home");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(706, 483, 221, 42));

        jLabel12.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
        jLabel12.setText("jLabel12");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 1140, 740));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/new1.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pIdFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pIdFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pIdFieldActionPerformed

    private void pNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pNameFieldActionPerformed

    private void pAgeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pAgeFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pAgeFieldActionPerformed

    private void pAddressFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pAddressFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pAddressFieldActionPerformed

    private void pPhoneFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pPhoneFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pPhoneFieldActionPerformed

    private void pDiseaseFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pDiseaseFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pDiseaseFieldActionPerformed

    private void pGenderFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pGenderFieldActionPerformed

    }//GEN-LAST:event_pGenderFieldActionPerformed

    private void pStatusFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pStatusFieldActionPerformed

    }//GEN-LAST:event_pStatusFieldActionPerformed

    private void addDctorbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addDctorbtnMouseClicked
        connection = Connector.ConnectDb();
        if (connection != null) {
            String id = pIdField.getText();
            String name = pNameField.getText();
            int age = Integer.parseInt(pAgeField.getText());
            String gender = (String) pGenderField.getSelectedItem();
            String address = pAddressField.getText();
            String phone = pPhoneField.getText();
            String status = (String) pStatusField.getSelectedItem();
            String disease = pDiseaseField.getText();
            String sql = "insert into patient(date,id,name,age,gender,address,phone,status,disease) values (?,?,?,?,?,?,?,?,?)";
            try {
                prp = connection.prepareStatement(sql);
                prp.setString(1, Date);
                prp.setString(2, id);
                prp.setString(3, name);
                prp.setInt(4, age);
                prp.setString(5, gender);
                prp.setString(6, address);
                prp.setString(7, phone);
                prp.setString(8, status);
                prp.setString(9, disease);
                prp.execute();
                JOptionPane.showMessageDialog(null, "Data Saved");
                int a = 0;
        ResultSet rs = null;

        if(connection != null){
            sql = "select count from patient";
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
        
        pIdField.setText("RS"+a+"HMSZP");
            } catch (SQLException e) {
                 JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_addDctorbtnMouseClicked

    private void clearPbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearPbtnMouseClicked
        String sql = "select count from patient";
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
        
        pNameField.setText("");
        pAgeField.setText("");
        pIdField.setText("RS"+a+"HMSZP");
        pAddressField.setText("");
        pPhoneField.setText("+91");
        pDiseaseField.setText("");
        pGenderField.setSelectedIndex(0);
        pStatusField.setSelectedIndex(0);
    }//GEN-LAST:event_clearPbtnMouseClicked

    private void jPanel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseClicked
        String sql = "select count from patient";
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
        
        pNameField.setText("");
        pAgeField.setText("");
        pIdField.setText("RS"+a+"HMSZP");
        pAddressField.setText("");
        pPhoneField.setText("");
        pDiseaseField.setText("");
        pGenderField.setSelectedIndex(0);
        pStatusField.setSelectedIndex(0);
    }//GEN-LAST:event_jPanel7MouseClicked

    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseClicked

    }//GEN-LAST:event_jPanel6MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Hospital hospital = new Hospital();
        hospital.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ReceptionistActivity pActivity = new ReceptionistActivity();
        pActivity.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new newPatient().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Gender;
    private javax.swing.JLabel addDctorbtn;
    private javax.swing.JLabel clearPbtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTextField pAddressField;
    private javax.swing.JTextField pAgeField;
    private javax.swing.JTextField pDiseaseField;
    private javax.swing.JComboBox<String> pGenderField;
    private javax.swing.JTextField pIdField;
    private javax.swing.JTextField pNameField;
    private javax.swing.JTextField pPhoneField;
    private javax.swing.JComboBox<String> pStatusField;
    // End of variables declaration//GEN-END:variables
}
