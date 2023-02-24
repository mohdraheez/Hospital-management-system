package Main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import Receptionists.ReceptionistActivity;
import java.awt.HeadlessException;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Receptionist extends javax.swing.JFrame {

    PreparedStatement prp = null;
    ResultSet result = null;
    Connection connection = null;

    public Receptionist() {
        initComponents();
        ImageIcon ic = new ImageIcon(getClass().getResource("/Images/hospital.png"));
        this.setIconImage(ic.getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        aUserLabel = new javax.swing.JLabel();
        check = new javax.swing.JCheckBox();
        rPassField = new javax.swing.JPasswordField();
        rUserField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        dExitBtn = new javax.swing.JButton();
        aLoginBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Receptionist");
        setPreferredSize(new java.awt.Dimension(650, 543));
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 550));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        aUserLabel.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        aUserLabel.setText("Enter Username");
        jPanel3.add(aUserLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 210, 30));

        check.setFont(new java.awt.Font("Algerian", 2, 12)); // NOI18N
        check.setText("Show password");
        check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkActionPerformed(evt);
            }
        });
        jPanel3.add(check, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, -1, 20));

        rPassField.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        jPanel3.add(rPassField, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 390, 29));

        rUserField.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        rUserField.setForeground(new java.awt.Color(130, 0, 0));
        rUserField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rUserFieldActionPerformed(evt);
            }
        });
        jPanel3.add(rUserField, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 390, 29));

        jLabel5.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jLabel5.setText("Enter Password");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jLabel6.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel6.setText("Receptionist login");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));

        dExitBtn.setBackground(new java.awt.Color(255, 0, 50));
        dExitBtn.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        dExitBtn.setForeground(new java.awt.Color(255, 255, 255));
        dExitBtn.setText("Home");
        dExitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dExitBtnActionPerformed(evt);
            }
        });
        jPanel3.add(dExitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 390, 35));

        aLoginBtn.setBackground(new java.awt.Color(104, 185, 132));
        aLoginBtn.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        aLoginBtn.setForeground(new java.awt.Color(255, 255, 255));
        aLoginBtn.setText("Login");
        aLoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aLoginBtnActionPerformed(evt);
            }
        });
        jPanel3.add(aLoginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 390, 35));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 470, 320));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/loginImg.png"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(700, 543));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkActionPerformed
        if(check.isSelected()){
            rPassField.setEchoChar((char)0);
        }
        else{
            rPassField.setEchoChar('*');
        }
    }//GEN-LAST:event_checkActionPerformed

    private void rUserFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rUserFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rUserFieldActionPerformed

    private void dExitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dExitBtnActionPerformed
        Hospital hospital = new Hospital();
        hospital.setVisible(true);
        dispose();
    }//GEN-LAST:event_dExitBtnActionPerformed

    private void aLoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aLoginBtnActionPerformed
        connection = Connector.ConnectDb();
        String user = rUserField.getText();
        String pass = String.valueOf(rPassField.getPassword());

        try {
            String sql = "select username, password from receptionist where username='" + user + "'";
            prp = connection.prepareStatement(sql);
            result = prp.executeQuery();
            result.next();
            if (pass.equals(result.getString("password"))) {
                ReceptionistActivity recept = new ReceptionistActivity();
                recept.setVisible(true);
                JOptionPane.showMessageDialog(null, "Login Succesful", "Welcome " + user, JOptionPane.INFORMATION_MESSAGE);
                dispose();
                connection.close();
            } else {
                JOptionPane.showMessageDialog(null, "Login Failed", "Error", JOptionPane.WARNING_MESSAGE);
                //                JOptionPane.showMessageDialog(null, "User or Password wrong.");
            }

        } catch (HeadlessException | SQLException e) {
            //            JOptionPane.showMessageDialog(null, e);
            JOptionPane.showMessageDialog(null, "User or Password wrong."+e);
        }
    }//GEN-LAST:event_aLoginBtnActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Receptionist().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aLoginBtn;
    private javax.swing.JLabel aUserLabel;
    private javax.swing.JCheckBox check;
    private javax.swing.JButton dExitBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField rPassField;
    private javax.swing.JTextField rUserField;
    // End of variables declaration//GEN-END:variables
}
