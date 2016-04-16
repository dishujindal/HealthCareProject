/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.FDAAdminRole;

import Business.EcoSystem;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author rekhajindal
 */
public class WFDAAdminWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;
    /**
     * Creates new form WFDAAdminWorkAreaJPanel
     */
    public WFDAAdminWorkAreaJPanel(JPanel upc,EcoSystem system) {
        initComponents();
        this.userProcessContainer=upc;
        this.system=system;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnManageDrugRequest = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Welcome to Drug Admin Work Area");

        btnManageDrugRequest.setText("Manage Drug Request");
        btnManageDrugRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageDrugRequestActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(btnManageDrugRequest)))
                .addGap(378, 378, 378))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel1)
                .addGap(51, 51, 51)
                .addComponent(btnManageDrugRequest)
                .addContainerGap(176, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageDrugRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageDrugRequestActionPerformed
        // TODO add your handling code here:
        ManageDrugApprovalRequestJPanel panel=new ManageDrugApprovalRequestJPanel(userProcessContainer,system.getWdAA());
        userProcessContainer.add("ManageDrugApprovalPanel", panel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageDrugRequestActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageDrugRequest;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
