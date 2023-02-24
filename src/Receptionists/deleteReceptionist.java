package Receptionists;

import Admins.ReceptionistManagement;
import Main.Connector;
import Main.Hospital;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Raheez
 */
public class deleteReceptionist extends javax.swing.JFrame {

    Connection connection = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    DefaultTableModel defaultTableModel = new DefaultTableModel();

    public deleteReceptionist() {
        initComponents();
        ImageIcon ic = new ImageIcon(getClass().getResource("/Images/hospital.png"));
        this.setIconImage(ic.getImage());

        Object columns[] = {"Serial", "Joining Date", "Id", "Name", "Age", "Gender", "Blood Group", "Email", "Phone Number", "Address", "Status", "Username"};
        defaultTableModel.setColumnIdentifiers(columns);
        rDTable.setModel(defaultTableModel);
        loadData();
    }

    public void loadData() {
        connection = Connector.ConnectDb();
        String sql = "select count,joining,id,name,age,gender,blood,email,phone,address,status,username,password from receptionist";
        try {
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            Object columnData[] = new Object[12];
            while (rs.next()) {
                columnData[0] = rs.getInt("count");
                columnData[1] = rs.getString("joining");
                columnData[2] = rs.getString("id");
                columnData[3] = rs.getString("name");
                columnData[4] = rs.getInt("age");
                columnData[5] = rs.getString("gender");
                columnData[6] = rs.getString("blood");
                columnData[7] = rs.getString("email");
                columnData[8] = rs.getString("phone");
                columnData[9] = rs.getString("status");
                columnData[10] = rs.getString("username");
                columnData[11] = rs.getString("password");
                defaultTableModel.addRow(columnData);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        rDeleteField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        rDTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        rDeletebtn = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Delete Receptionist !");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setBackground(new java.awt.Color(255, 0, 51));
        jButton3.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 80, 90, 40));

        jLabel1.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("Name of Receptionist");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));

        rDeleteField.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        rDeleteField.setForeground(new java.awt.Color(0, 204, 204));
        rDeleteField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rDeleteFieldActionPerformed(evt);
            }
        });
        getContentPane().add(rDeleteField, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 80, 500, 40));

        rDTable.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        rDTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(rDTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 155, 1240, 434));

        jPanel1.setBackground(new java.awt.Color(130, 170, 227));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        rDeletebtn.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        rDeletebtn.setForeground(new java.awt.Color(255, 255, 255));
        rDeletebtn.setText("Delete");
        rDeletebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rDeletebtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(rDeletebtn)
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(rDeletebtn)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 80, -1, 40));

        jButton2.setBackground(new java.awt.Color(255, 0, 51));
        jButton2.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("back");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 275, 86, 39));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rDeleteFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rDeleteFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rDeleteFieldActionPerformed

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        connection = Connector.ConnectDb();
        String search = rDeleteField.getText();
        String sql = "Delete from receptionist where name ='" + search + "'";
        try {
            ps = connection.prepareStatement(sql);
            ps.execute();
            JOptionPane.showMessageDialog(null, "Patient " + search + " has been deleted");
            defaultTableModel.getDataVector().removeAllElements();
            defaultTableModel.fireTableDataChanged();
            loadData();
            connection.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "patient named " + search + " not found");
        }
    }//GEN-LAST:event_jPanel1MouseClicked

    private void rDeletebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rDeletebtnMouseClicked
        connection = Connector.ConnectDb();
        String search = rDeleteField.getText();
        String sql = "Delete from receptionist where name ='" + search + "'";
        try {
            ps = connection.prepareStatement(sql);
            ps.execute();
            JOptionPane.showMessageDialog(null, "Patient " + search + " has been deleted");
            defaultTableModel.getDataVector().removeAllElements();
            defaultTableModel.fireTableDataChanged();
            loadData();
            connection.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "patient named " + search + " not found");
        }
    }//GEN-LAST:event_rDeletebtnMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       ReceptionistManagement p = new ReceptionistManagement();
        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new deleteReceptionist().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable rDTable;
    private javax.swing.JTextField rDeleteField;
    private javax.swing.JLabel rDeletebtn;
    // End of variables declaration//GEN-END:variables

}
