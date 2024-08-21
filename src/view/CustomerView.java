/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

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
        jPanel1.add(addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 370, 110, -1));

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

        System.out.println(" ID " + id);
        System.out.println(" Name " + customerName);
        System.out.println(" NIC " + nic);
        System.out.println(" NIC " + contact);
    }//GEN-LAST:event_addButtonActionPerformed

    private void cusIdTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cusIdTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cusIdTxtActionPerformed

    private void cusContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cusContactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cusContactActionPerformed

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
    // End of variables declaration//GEN-END:variables
}
