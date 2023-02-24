package Admins;

import Doctors.*;
import Main.Hospital;
import javax.swing.ImageIcon;

/**
 *
 * @author Raheez
 */
public class doctorManagement extends javax.swing.JFrame {

    public static String username;

    public doctorManagement() {
        initComponents();
        ImageIcon ic = new ImageIcon(getClass().getResource("/Images/hospital.png"));
        this.setIconImage(ic.getImage());
    }

    public void User(String Username) {

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        updateReceptionbtn = new javax.swing.JLabel();
        updateReceptionbtn2 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        deleteReceptionbtn = new javax.swing.JLabel();
        deleteReceptionbtn2 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        viewReceptionbtn = new javax.swing.JLabel();
        viewReceptionbtn2 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        searchReceptionbtn = new javax.swing.JLabel();
        searchReceptionbtn2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        addReceptionbtn1 = new javax.swing.JLabel();
        addReceptionbtn3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Doctor Management !");
        setPreferredSize(new java.awt.Dimension(1400, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(104, 185, 132));

        updateReceptionbtn.setFont(new java.awt.Font("Algerian", 1, 25)); // NOI18N
        updateReceptionbtn.setForeground(new java.awt.Color(255, 255, 255));
        updateReceptionbtn.setText("Update");
        updateReceptionbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateReceptionbtnMouseClicked(evt);
            }
        });

        updateReceptionbtn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/updatepatient.png"))); // NOI18N
        updateReceptionbtn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateReceptionbtn2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(updateReceptionbtn2)
                .addGap(41, 41, 41)
                .addComponent(updateReceptionbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(updateReceptionbtn)
                    .addComponent(updateReceptionbtn2))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(104, 185, 132));
        jPanel7.setPreferredSize(new java.awt.Dimension(150, 100));

        deleteReceptionbtn.setFont(new java.awt.Font("Algerian", 1, 25)); // NOI18N
        deleteReceptionbtn.setForeground(new java.awt.Color(255, 255, 255));
        deleteReceptionbtn.setText("Delete ");
        deleteReceptionbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteReceptionbtnMouseClicked(evt);
            }
        });

        deleteReceptionbtn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/deletepatient.png"))); // NOI18N
        deleteReceptionbtn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteReceptionbtn2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(deleteReceptionbtn2)
                .addGap(47, 47, 47)
                .addComponent(deleteReceptionbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(deleteReceptionbtn)
                    .addComponent(deleteReceptionbtn2))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(104, 185, 132));
        jPanel8.setPreferredSize(new java.awt.Dimension(150, 100));

        viewReceptionbtn.setBackground(new java.awt.Color(104, 185, 132));
        viewReceptionbtn.setFont(new java.awt.Font("Algerian", 1, 25)); // NOI18N
        viewReceptionbtn.setForeground(new java.awt.Color(255, 255, 255));
        viewReceptionbtn.setText("View ");
        viewReceptionbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewReceptionbtnMouseClicked(evt);
            }
        });

        viewReceptionbtn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/viewpatient.png"))); // NOI18N
        viewReceptionbtn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewReceptionbtn2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(viewReceptionbtn2)
                .addGap(42, 42, 42)
                .addComponent(viewReceptionbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(viewReceptionbtn)
                    .addComponent(viewReceptionbtn2))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(104, 185, 132));
        jPanel9.setPreferredSize(new java.awt.Dimension(150, 100));

        searchReceptionbtn.setFont(new java.awt.Font("Algerian", 1, 25)); // NOI18N
        searchReceptionbtn.setForeground(new java.awt.Color(255, 255, 255));
        searchReceptionbtn.setText("Search ");
        searchReceptionbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchReceptionbtnMouseClicked(evt);
            }
        });

        searchReceptionbtn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/searchpatient.png"))); // NOI18N
        searchReceptionbtn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchReceptionbtn2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(searchReceptionbtn2)
                .addGap(51, 51, 51)
                .addComponent(searchReceptionbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(searchReceptionbtn)
                    .addComponent(searchReceptionbtn2))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(104, 185, 132));
        jPanel6.setPreferredSize(new java.awt.Dimension(150, 100));

        addReceptionbtn1.setFont(new java.awt.Font("Algerian", 1, 25)); // NOI18N
        addReceptionbtn1.setForeground(new java.awt.Color(255, 255, 255));
        addReceptionbtn1.setText("Add New");
        addReceptionbtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addReceptionbtn1MouseClicked(evt);
            }
        });

        addReceptionbtn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/addpatient.png"))); // NOI18N
        addReceptionbtn3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addReceptionbtn3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(addReceptionbtn3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(addReceptionbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addReceptionbtn3)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(addReceptionbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jLabel11.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jLabel11.setText("Welcome to Doctor Portal");

        jButton5.setBackground(new java.awt.Color(255, 0, 50));
        jButton5.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Back");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(jLabel11)
                .addContainerGap(147, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(240, 240, 240))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(215, 215, 215))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 810, 580));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/new1.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void searchReceptionbtn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchReceptionbtn2MouseClicked
        searchDoctor sReceptionist = new searchDoctor();
        sReceptionist.setVisible(true);
        dispose();
    }//GEN-LAST:event_searchReceptionbtn2MouseClicked

    private void searchReceptionbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchReceptionbtnMouseClicked
        searchDoctor sReceptionist = new searchDoctor();
        sReceptionist.setVisible(true);
        dispose();
    }//GEN-LAST:event_searchReceptionbtnMouseClicked

    private void viewReceptionbtn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewReceptionbtn2MouseClicked
        viewDoctor vReceptionist = new viewDoctor();
        vReceptionist.setVisible(true);
        dispose();
    }//GEN-LAST:event_viewReceptionbtn2MouseClicked

    private void viewReceptionbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewReceptionbtnMouseClicked
        viewDoctor vReceptionist = new viewDoctor();
        vReceptionist.setVisible(true);
        dispose();
    }//GEN-LAST:event_viewReceptionbtnMouseClicked

    private void deleteReceptionbtn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteReceptionbtn2MouseClicked
        deleteDoctor dDoctor = new deleteDoctor();
        dDoctor.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_deleteReceptionbtn2MouseClicked

    private void updateReceptionbtn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateReceptionbtn2MouseClicked
        updateDoctor uReceptionist = new updateDoctor();
        uReceptionist.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_updateReceptionbtn2MouseClicked

    private void updateReceptionbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateReceptionbtnMouseClicked
        updateDoctor uReceptionist = new updateDoctor();
        uReceptionist.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_updateReceptionbtnMouseClicked

    private void addReceptionbtn3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addReceptionbtn3MouseClicked
        addDoctor aDoctor = new addDoctor();
        aDoctor.setVisible(true);
        dispose();
    }//GEN-LAST:event_addReceptionbtn3MouseClicked

    private void addReceptionbtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addReceptionbtn1MouseClicked
        addDoctor aDoctor = new addDoctor();
        aDoctor.setVisible(true);
        dispose();
    }//GEN-LAST:event_addReceptionbtn1MouseClicked

    private void deleteReceptionbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteReceptionbtnMouseClicked
        deleteDoctor dDoctor = new deleteDoctor();
        dDoctor.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_deleteReceptionbtnMouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        AdminActivity Admin = new AdminActivity();
        Admin.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new doctorManagement().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addReceptionbtn1;
    private javax.swing.JLabel addReceptionbtn3;
    private javax.swing.JLabel deleteReceptionbtn;
    private javax.swing.JLabel deleteReceptionbtn2;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel searchReceptionbtn;
    private javax.swing.JLabel searchReceptionbtn2;
    private javax.swing.JLabel updateReceptionbtn;
    private javax.swing.JLabel updateReceptionbtn2;
    private javax.swing.JLabel viewReceptionbtn;
    private javax.swing.JLabel viewReceptionbtn2;
    // End of variables declaration//GEN-END:variables
}
