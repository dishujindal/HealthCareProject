/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.PharmacyRole;

import Business.Enterprise.Enterprise;
import Business.WorkQueue.PharmacyWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rekhajindal
 */
public class ManagePharmacyWorkRequestJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Enterprise enterprise;
    
    /**
     * Creates new form ManagePharmacyLabRequestJPanel
     */
    public ManagePharmacyWorkRequestJPanel(JPanel upc,Enterprise enterprise) {
        initComponents();
        this.userProcessContainer=upc;
        this.enterprise=enterprise;
        hideControls();
        populatePharmacyWorkRequest();
    }

    public void hideControls()
    {
        txtMessage.setVisible(false);
        LabelMessage.setVisible(false);
        btnSubmit.setVisible(false);
    }
    public void populatePharmacyWorkRequest()
    {
        DefaultTableModel model=(DefaultTableModel)pharmacyWorkRequestTable.getModel();
        model.setRowCount(0);
        for(WorkRequest request:enterprise.getWorkQueue().getWorkRequestList())
        {
            if(request instanceof PharmacyWorkRequest)
            {
                PharmacyWorkRequest phRequest=(PharmacyWorkRequest)request;
                Object[]row=new Object[5];
                row[0]=phRequest;
                row[1]=phRequest.getDoctor().getFirstName();
                row[2]=phRequest.getEnterprise().getName();
                row[3]=phRequest.getPatient().getFirstName();
                row[4]=phRequest.getStatus();
                model.addRow(row);
            }
        }
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
        jScrollPane1 = new javax.swing.JScrollPane();
        pharmacyWorkRequestTable = new javax.swing.JTable();
        btnProcessRequest = new javax.swing.JButton();
        LabelMessage = new javax.swing.JLabel();
        txtMessage = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        btnback = new javax.swing.JButton();

        jLabel1.setText("List of Pharmacy Work Request");

        pharmacyWorkRequestTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Message", "Doctor Name", "Enterprise Name", "Patient Name", "Request Status"
            }
        ));
        jScrollPane1.setViewportView(pharmacyWorkRequestTable);

        btnProcessRequest.setText("Process Request");
        btnProcessRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessRequestActionPerformed(evt);
            }
        });

        LabelMessage.setText("Message");

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        btnback.setText("<< Back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnback)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addComponent(btnSubmit))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(LabelMessage)
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnProcessRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(109, 109, 109))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(51, 51, 51)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnProcessRequest)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelMessage)
                    .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(btnSubmit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnback)
                .addContainerGap(80, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnProcessRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessRequestActionPerformed
        // TODO add your handling code here:
        int selectedRow=pharmacyWorkRequestTable.getSelectedRow();
        if(selectedRow < 0)
        {
            JOptionPane.showMessageDialog(null, "please select a row");
            return;
        }
        txtMessage.setVisible(true);
        LabelMessage.setVisible(true);
        btnSubmit.setVisible(true);
    }//GEN-LAST:event_btnProcessRequestActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        int selectedRow=pharmacyWorkRequestTable.getSelectedRow();
        if(selectedRow < 0)
        {
            JOptionPane.showMessageDialog(null, "please select a row");
            return;
        }
        String message =txtMessage.getText();
        if(message.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "please enter the message");
            return;
        }
        WorkRequest request=(WorkRequest)pharmacyWorkRequestTable.getValueAt(selectedRow,0);
        request.setStatus(message);
        hideControls();
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnbackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelMessage;
    private javax.swing.JButton btnProcessRequest;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton btnback;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable pharmacyWorkRequestTable;
    private javax.swing.JTextField txtMessage;
    // End of variables declaration//GEN-END:variables
}