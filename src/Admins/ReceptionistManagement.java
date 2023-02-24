package Admins;

import Main.Hospital;
import Receptionists.addReceptionist;
import Receptionists.deleteReceptionist;
import Receptionists.searchReceptionist;
import Receptionists.updateReceptionist;
import Receptionists.viewReceptionist;
import javax.swing.ImageIcon;

/**
 *
 * @author Raheez
 */
public class ReceptionistManagement extends javax.swing.JFrame {

    public ReceptionistManagement() {
        initComponents();
        ImageIcon ic = new ImageIcon(getClass().getResource("/Images/hospital.png"));
        this.setIconImage(ic.getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        addReceptionbtn = new javax.swing.JLabel();
        addReceptionbtn2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        updateReceptionbtn = new javax.swing.JLabel();
        updateReceptionbtn2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        deleteReceptionbtn = new javax.swing.JLabel();
        deleteReceptionbtn2 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        viewReceptionbtn = new javax.swing.JLabel();
        viewReceptionbtn2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Receptionist Management !");
        setPreferredSize(new java.awt.Dimension(1400, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(784, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel11.setText("Welcome to Receptionist Management");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 42, -1, -1));

        jPanel5.setBackground(new java.awt.Color(104, 185, 132));
        jPanel5.setPreferredSize(new java.awt.Dimension(150, 100));

        addReceptionbtn.setFont(new java.awt.Font("Bodoni MT", 3, 25)); // NOI18N
        addReceptionbtn.setForeground(new java.awt.Color(255, 255, 255));
        addReceptionbtn.setText("Add New");
        addReceptionbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addReceptionbtnMouseClicked(evt);
            }
        });

        addReceptionbtn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/addpatient.png"))); // NOI18N
        addReceptionbtn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addReceptionbtn2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(addReceptionbtn2)
                .addGap(37, 37, 37)
                .addComponent(addReceptionbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addReceptionbtn2)
                .addGap(25, 25, 25))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(addReceptionbtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 310, 60));

        jPanel4.setBackground(new java.awt.Color(104, 185, 132));

        updateReceptionbtn.setFont(new java.awt.Font("Bodoni MT", 3, 25)); // NOI18N
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
                .addGap(41, 41, 41)
                .addComponent(updateReceptionbtn2)
                .addGap(33, 33, 33)
                .addComponent(updateReceptionbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(updateReceptionbtn2))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(updateReceptionbtn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, -1, -1));

        jPanel6.setBackground(new java.awt.Color(104, 185, 132));
        jPanel6.setPreferredSize(new java.awt.Dimension(150, 100));

        deleteReceptionbtn.setFont(new java.awt.Font("Bodoni MT", 3, 25)); // NOI18N
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

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(deleteReceptionbtn2)
                .addGap(35, 35, 35)
                .addComponent(deleteReceptionbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(deleteReceptionbtn)
                    .addComponent(deleteReceptionbtn2))
                .addContainerGap())
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 310, 60));

        jPanel8.setBackground(new java.awt.Color(104, 185, 132));
        jPanel8.setPreferredSize(new java.awt.Dimension(150, 100));

        viewReceptionbtn.setFont(new java.awt.Font("Bodoni MT", 3, 25)); // NOI18N
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
                .addGap(43, 43, 43)
                .addComponent(viewReceptionbtn2)
                .addGap(33, 33, 33)
                .addComponent(viewReceptionbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(117, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(viewReceptionbtn2)
                .addGap(9, 9, 9))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(viewReceptionbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 310, 63));

        jButton1.setBackground(new java.awt.Color(255, 0, 50));
        jButton1.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 455, 427, 35));

        jButton2.setBackground(new java.awt.Color(104, 185, 132));
        jButton2.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Home");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 496, 427, 34));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 730, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/new1.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addReceptionbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addReceptionbtnMouseClicked
        addReceptionist adr = new addReceptionist();
        adr.setVisible(true);
        dispose();
    }//GEN-LAST:event_addReceptionbtnMouseClicked

    private void addReceptionbtn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addReceptionbtn2MouseClicked
        addReceptionist adr = new addReceptionist();
        adr.setVisible(true);
        dispose();
    }//GEN-LAST:event_addReceptionbtn2MouseClicked

    private void updateReceptionbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateReceptionbtnMouseClicked
        updateReceptionist uReceptionist = new updateReceptionist();
        uReceptionist.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_updateReceptionbtnMouseClicked

    private void updateReceptionbtn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateReceptionbtn2MouseClicked
        updateReceptionist uReceptionist = new updateReceptionist();
        uReceptionist.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_updateReceptionbtn2MouseClicked

    private void deleteReceptionbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteReceptionbtnMouseClicked
        deleteReceptionist dReceptionist = new deleteReceptionist();
        dReceptionist.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_deleteReceptionbtnMouseClicked

    private void deleteReceptionbtn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteReceptionbtn2MouseClicked
        deleteReceptionist dReceptionist = new deleteReceptionist();
        dReceptionist.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_deleteReceptionbtn2MouseClicked

    private void viewReceptionbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewReceptionbtnMouseClicked
        viewReceptionist vReceptionist = new viewReceptionist();
        vReceptionist.setVisible(true);
        dispose();
    }//GEN-LAST:event_viewReceptionbtnMouseClicked

    private void viewReceptionbtn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewReceptionbtn2MouseClicked
        viewReceptionist vReceptionist = new viewReceptionist();
        vReceptionist.setVisible(true);
        dispose();
    }//GEN-LAST:event_viewReceptionbtn2MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        AdminActivity aActivity = new AdminActivity();
        aActivity.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            Hospital hospital = new Hospital();
            hospital.setVisible(true);
            dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new ReceptionistManagement().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addReceptionbtn;
    private javax.swing.JLabel addReceptionbtn2;
    private javax.swing.JLabel deleteReceptionbtn;
    private javax.swing.JLabel deleteReceptionbtn2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JLabel updateReceptionbtn;
    private javax.swing.JLabel updateReceptionbtn2;
    private javax.swing.JLabel viewReceptionbtn;
    private javax.swing.JLabel viewReceptionbtn2;
    // End of variables declaration//GEN-END:variables

}
