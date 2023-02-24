package Doctors;

import Admins.doctorManagement;
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
public class viewDoctor extends javax.swing.JFrame {

    Connection connection = null;
    ResultSet rs = null;
    PreparedStatement ps = null;
    DefaultTableModel defaultTableModel = new DefaultTableModel();

    public viewDoctor() {
        initComponents();
        ImageIcon ic = new ImageIcon(getClass().getResource("/Images/hospital.png"));
        this.setIconImage(ic.getImage());

        Object columns[] = {"Serial", "Joining Date", "Id", "Name", "Age", "Gender", "Blood Group", "Department", "Phone Number", "Email Address", "Status", "Address", "Username", "Password"};
        defaultTableModel.setColumnIdentifiers(columns);
        rTable.setModel(defaultTableModel);

        loadData();
    }

    public void loadData() {
        connection = Connector.ConnectDb();
        String sql = "select count,date,id,name,age,gender,blood,dept,phone,email,status,address,username from doctor";
        try {
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            Object columnData[] = new Object[14];
            while (rs.next()) {
                columnData[0] = rs.getInt("count");
                columnData[1] = rs.getString("date");
                columnData[2] = rs.getString("id");
                columnData[3] = rs.getString("name");
                columnData[4] = rs.getInt("age");
                columnData[5] = rs.getString("gender");
                columnData[6] = rs.getString("blood");
                columnData[7] = rs.getString("dept");
                columnData[8] = rs.getString("phone");
                columnData[9] = rs.getString("email");
                columnData[10] = rs.getString("status");
                columnData[11] = rs.getString("address");
                columnData[12] = rs.getString("username");
                defaultTableModel.addRow(columnData);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        rTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        rPassBtn = new javax.swing.JToggleButton();
        jLabel12 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("View Doctors !");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(1260, 575));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rTable.setModel(new javax.swing.table.DefaultTableModel(
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
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(rTable);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 108, 1180, 400));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        rPassBtn.setBackground(new java.awt.Color(255, 0, 0));
        rPassBtn.setFont(new java.awt.Font("Algerian", 1, 12)); // NOI18N
        rPassBtn.setForeground(new java.awt.Color(255, 255, 255));
        rPassBtn.setText("Show Passwords");
        rPassBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rPassBtnActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jLabel12.setText("DOCTOR details");

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("home");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(389, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(30, 30, 30)
                .addComponent(rPassBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rPassBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 1180, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, -1, 564));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/new1.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rPassBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rPassBtnActionPerformed
        if (rPassBtn.isSelected()) {
            rPassBtn.setText("Hide Passwords");
            defaultTableModel.getDataVector().removeAllElements();
            defaultTableModel.fireTableDataChanged();
            connection = Connector.ConnectDb();
            String sql = "select count,date,id,name,age,gender,blood,dept,phone,email,status,address,username,password from doctor";
            try {
                ps = connection.prepareStatement(sql);
                rs = ps.executeQuery();
                Object columnData[] = new Object[15];
                while (rs.next()) {
                    columnData[0] = rs.getInt("count");
                    columnData[1] = rs.getString("date");
                    columnData[2] = rs.getString("id");
                    columnData[3] = rs.getString("name");
                    columnData[4] = rs.getInt("age");
                    columnData[5] = rs.getString("gender");
                    columnData[6] = rs.getString("blood");
                    columnData[7] = rs.getString("dept");
                    columnData[8] = rs.getString("phone");
                    columnData[9] = rs.getString("email");
                    columnData[10] = rs.getString("status");
                    columnData[11] = rs.getString("address");
                    columnData[12] = rs.getString("username");
                    columnData[13] = rs.getString("password");
                    defaultTableModel.addRow(columnData);
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        } else {
            rPassBtn.setText("Show Passwords");
            defaultTableModel.getDataVector().removeAllElements();
            defaultTableModel.fireTableDataChanged();
            connection = Connector.ConnectDb();
            String sql = "select count,date,id,name,age,gender,blood,dept,phone,email,status,address,username,password from doctor";
            try {
                ps = connection.prepareStatement(sql);
                rs = ps.executeQuery();
                Object columnData[] = new Object[14];
                while (rs.next()) {
                    columnData[0] = rs.getInt("count");
                    columnData[1] = rs.getString("date");
                    columnData[2] = rs.getString("id");
                    columnData[3] = rs.getString("name");
                    columnData[4] = rs.getInt("age");
                    columnData[5] = rs.getString("gender");
                    columnData[6] = rs.getString("blood");
                    columnData[7] = rs.getString("dept");
                    columnData[8] = rs.getString("phone");
                    columnData[9] = rs.getString("email");
                    columnData[10] = rs.getString("status");
                    columnData[11] = rs.getString("address");
                    columnData[12] = rs.getString("username");
                    defaultTableModel.addRow(columnData);
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Something went wrong");
            }
        }

    }//GEN-LAST:event_rPassBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         doctorManagement dManagement = new doctorManagement();
        dManagement.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Hospital hospital = new Hospital();
        hospital.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new viewDoctor().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToggleButton rPassBtn;
    private javax.swing.JTable rTable;
    // End of variables declaration//GEN-END:variables
}
