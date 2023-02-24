package Main;

import javax.swing.ImageIcon;

/**
 *
 * @author raheez
 */
public class Hospital extends javax.swing.JFrame {

    public Hospital() {
        initComponents();
        ImageIcon ic = new ImageIcon(getClass().getResource("/Images/hospital.png"));
        this.setIconImage(ic.getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        RECEPTIONIST = new java.awt.Button();
        ADMIN = new java.awt.Button();
        DOCTOR = new java.awt.Button();
        jPanel7 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Welcome To Hospital Management System");
        setBackground(new java.awt.Color(191, 234, 245));
        setResizable(false);
        setSize(new java.awt.Dimension(1200, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RECEPTIONIST.setBackground(new java.awt.Color(104, 185, 132));
        RECEPTIONIST.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RECEPTIONIST.setFont(new java.awt.Font("Algerian", 3, 18)); // NOI18N
        RECEPTIONIST.setForeground(new java.awt.Color(255, 255, 255));
        RECEPTIONIST.setLabel("RECEPTIONIST\n");
        RECEPTIONIST.setPreferredSize(new java.awt.Dimension(200, 80));
        RECEPTIONIST.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RECEPTIONISTMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RECEPTIONISTMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RECEPTIONISTMouseExited(evt);
            }
        });
        RECEPTIONIST.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RECEPTIONISTActionPerformed(evt);
            }
        });
        jPanel2.add(RECEPTIONIST, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 385, 320, 70));

        ADMIN.setBackground(new java.awt.Color(104, 185, 132));
        ADMIN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ADMIN.setFont(new java.awt.Font("Baskerville Old Face", 3, 18)); // NOI18N
        ADMIN.setForeground(new java.awt.Color(255, 255, 255));
        ADMIN.setLabel("ADMIN");
        ADMIN.setPreferredSize(new java.awt.Dimension(200, 80));
        ADMIN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ADMINMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ADMINMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ADMINMouseExited(evt);
            }
        });
        ADMIN.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ADMINFocusGained(evt);
            }
        });
        ADMIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADMINActionPerformed(evt);
            }
        });
        jPanel2.add(ADMIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 188, 320, 70));

        DOCTOR.setBackground(new java.awt.Color(104, 185, 132));
        DOCTOR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DOCTOR.setFont(new java.awt.Font("Algerian", 3, 18)); // NOI18N
        DOCTOR.setForeground(new java.awt.Color(255, 255, 255));
        DOCTOR.setLabel("DOCTOR");
        DOCTOR.setMinimumSize(new java.awt.Dimension(200, 80));
        DOCTOR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DOCTORMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DOCTORMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DOCTORMouseExited(evt);
            }
        });
        jPanel2.add(DOCTOR, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 285, 320, 70));

        jPanel7.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel1.setFont(new java.awt.Font("Algerian", 1, 40)); // NOI18N
        jLabel1.setText("LOGIN AS");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 270, -1));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, 320, 70));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pngwing.com.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel6)
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(577, 0, -1, 660));

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 320, 70));

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 320, 70));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 1180, 660));

        jPanel1.setBackground(new java.awt.Color(61, 86, 86));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/new1.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 16, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1510, 860));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ADMINMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ADMINMouseClicked
        Admin ad = new Admin();
        ad.setVisible(true);
        dispose();
    }//GEN-LAST:event_ADMINMouseClicked

    private void ADMINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADMINActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ADMINActionPerformed

    private void DOCTORMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DOCTORMouseClicked
         Doctor doctor = new Doctor();
        doctor.setVisible(true);
        dispose();
    }//GEN-LAST:event_DOCTORMouseClicked

    private void RECEPTIONISTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RECEPTIONISTMouseClicked
       
        Receptionist receptionist = new Receptionist();
        receptionist.setVisible(true);
        dispose();
    }//GEN-LAST:event_RECEPTIONISTMouseClicked

    private void RECEPTIONISTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RECEPTIONISTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RECEPTIONISTActionPerformed

    private void ADMINFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ADMINFocusGained
         
    }//GEN-LAST:event_ADMINFocusGained

    private void ADMINMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ADMINMouseEntered
       ADMIN.setBackground(new java.awt.Color(200,92,142));
    }//GEN-LAST:event_ADMINMouseEntered

    private void ADMINMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ADMINMouseExited
        ADMIN.setBackground(new java.awt.Color(104, 185, 132));
    }//GEN-LAST:event_ADMINMouseExited

    private void DOCTORMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DOCTORMouseEntered
        DOCTOR.setBackground(new java.awt.Color(200,92,142));
    }//GEN-LAST:event_DOCTORMouseEntered

    private void DOCTORMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DOCTORMouseExited
        DOCTOR.setBackground(new java.awt.Color(104, 185, 132));
    }//GEN-LAST:event_DOCTORMouseExited

    private void RECEPTIONISTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RECEPTIONISTMouseEntered
        RECEPTIONIST.setBackground(new java.awt.Color(200,92,142));
    }//GEN-LAST:event_RECEPTIONISTMouseEntered

    private void RECEPTIONISTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RECEPTIONISTMouseExited
          RECEPTIONIST.setBackground(new java.awt.Color(104, 185, 132));
    }//GEN-LAST:event_RECEPTIONISTMouseExited

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Hospital().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button ADMIN;
    private java.awt.Button DOCTOR;
    private java.awt.Button RECEPTIONIST;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    // End of variables declaration//GEN-END:variables
}
