/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import com.mysql.cj.jdbc.Driver;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.util.logging.Level;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author tharindumadhushan
 */
public class CustomerView extends javax.swing.JFrame {

    /**
     * Creates new form CustomerView
     */
    public CustomerView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cusIdLbl = new javax.swing.JLabel();
        cusIdTxt = new javax.swing.JTextField();
        cusIdLbl1 = new javax.swing.JLabel();
        cusName = new javax.swing.JTextField();
        cusIdLbl2 = new javax.swing.JLabel();
        cusNic = new javax.swing.JTextField();
        cusIdLbl3 = new javax.swing.JLabel();
        cusContact = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        searchBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 153));
        jLabel1.setFont(new java.awt.Font("Marker Felt", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Customer Form");
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, -1));

        cusIdLbl.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        cusIdLbl.setText("Customer ID");
        jPanel1.add(cusIdLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 110, 30));

        cusIdTxt.setFont(new java.awt.Font("Noto Sans NKo", 0, 18)); // NOI18N
        cusIdTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cusIdTxtActionPerformed(evt);
            }
        });
        jPanel1.add(cusIdTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 190, -1));

        cusIdLbl1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        cusIdLbl1.setText("Customer Name");
        jPanel1.add(cusIdLbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 150, 30));

        cusName.setFont(new java.awt.Font("Noto Sans NKo", 0, 18)); // NOI18N
        jPanel1.add(cusName, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 190, -1));

        cusIdLbl2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        cusIdLbl2.setText("Customer NIC");
        jPanel1.add(cusIdLbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 110, 30));

        cusNic.setFont(new java.awt.Font("Noto Sans NKo", 0, 18)); // NOI18N
        jPanel1.add(cusNic, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 190, -1));

        cusIdLbl3.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        cusIdLbl3.setText("Customer Contact");
        jPanel1.add(cusIdLbl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 160, 30));

        cusContact.setFont(new java.awt.Font("Noto Sans NKo", 0, 18)); // NOI18N
        cusContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cusContactActionPerformed(evt);
            }
        });
        jPanel1.add(cusContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 190, -1));

        addButton.setBackground(new java.awt.Color(255, 102, 0));
        addButton.setFont(new java.awt.Font("InaiMathi", 3, 18)); // NOI18N
        addButton.setText("Add");
        addButton.setToolTipText("");
        addButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(51, 153, 0), null, null));
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        jPanel1.add(addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 110, -1));

        searchBtn.setBackground(new java.awt.Color(255, 102, 255));
        searchBtn.setFont(new java.awt.Font("Kohinoor Gujarati", 3, 14)); // NOI18N
        searchBtn.setText("SeachButton");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });
        jPanel1.add(searchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, 130, 40));

        updateBtn.setBackground(new java.awt.Color(0, 153, 0));
        updateBtn.setFont(new java.awt.Font("Hiragino Sans GB", 0, 14)); // NOI18N
        updateBtn.setForeground(new java.awt.Color(255, 255, 255));
        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        jPanel1.add(updateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 370, 90, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 524, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed

        String id = cusIdTxt.getText();
        String customerName = cusName.getText();
        String nic = cusNic.getText();
//        int contact=cusContact.getText();
        int contact = Integer.parseInt(cusContact.getText());

        String url = "jdbc:mysql://localhost:3306/pos_db";
        String user = "root";
        String password = "rootrootroot";

        //get database connection
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        //SQl query to insert customer data
        String sql = "INSERT INTO customer VALUES(?,?,?,?)";

        try {

            //load jdbc driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //establish connection
            connection = DriverManager.getConnection(url, user, password);

            //prepares sql statement
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, id);
            preparedStatement.setString(2, customerName);
            preparedStatement.setString(3, nic);
            preparedStatement.setInt(4, contact);

            int result = preparedStatement.executeUpdate();

            if (result > 0) {
                JOptionPane.showMessageDialog(this, "Added Successfully");
                clearForm();

            } else {

            }

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }

                if (preparedStatement != null) {
                    preparedStatement.close();
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        }
    }//GEN-LAST:event_addButtonActionPerformed

    private void cusIdTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cusIdTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cusIdTxtActionPerformed

    private void cusContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cusContactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cusContactActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed

        String id = cusIdTxt.getText();

        String url = "jdbc:mysql://localhost:3306/pos_db";
        String user = "root";
        String password = "rootrootroot";

        //get database connection
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        //SQl query to insert customer data
        String sql = "SELECT * FROM CUSTOMER WHERE id= ?";

        try {
            //load jdbc driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //establish connection
            connection = DriverManager.getConnection(url, user, password);

            //prepares sql statement
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, id);

            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                String rsId = resultSet.getString("id");
                String rsName = resultSet.getString("name");
                String rsNic = resultSet.getString("nic");
                int rsContact = resultSet.getInt("contact");

//                System.out.println("Id " + rsId);
//                System.out.println("Name " + rsName);
//                System.out.println("Nic " + rsNic);
//                System.out.println("COntact " + rsContact);
                cusName.setText(rsName);
                cusNic.setText(rsNic);
                cusContact.setText("" + rsContact);

            }

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }

                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (resultSet != null) {
                    resultSet.close();
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        }
    }//GEN-LAST:event_searchBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:

        String url = "jdbc:mysql://localhost:3306/pos_db";
        String user = "root";
        String password = "rootrootroot";

        String id = cusIdTxt.getText();
        String customerName = cusName.getText();
        String nic = cusNic.getText();
//        int contact=cusContact.getText();
        int contact = Integer.parseInt(cusContact.getText());
        //get database connection
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        //SQl query to insert customer data
        String sql = "UPDATE CUSTOMER SET name = ?, NIC = ?, contact = ? WHERE id = ?";

        try {
            //load jdbc driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //establish connection
            connection = DriverManager.getConnection(url, user, password);

            //prepares sql statement
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, customerName);
            preparedStatement.setString(2, nic);
            preparedStatement.setInt(3, contact);
            preparedStatement.setString(4, id);

            int result = preparedStatement.executeUpdate();

            if (result > 0) {
                clearForm();
                JOptionPane.showMessageDialog(this, "USER UPDATED");
            }

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
        finally {
            try {
                if (connection != null) {
                    connection.close();
                }

                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (resultSet != null) {
                    resultSet.close();
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        }

    }//GEN-LAST:event_updateBtnActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerView().setVisible(true);
            }
        });
    }

    public void clearForm() {
        cusIdTxt.setText("");
        cusName.setText("");
        cusNic.setText("");
        cusContact.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JTextField cusContact;
    private javax.swing.JLabel cusIdLbl;
    private javax.swing.JLabel cusIdLbl1;
    private javax.swing.JLabel cusIdLbl2;
    private javax.swing.JLabel cusIdLbl3;
    private javax.swing.JTextField cusIdTxt;
    private javax.swing.JTextField cusName;
    private javax.swing.JTextField cusNic;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton searchBtn;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
