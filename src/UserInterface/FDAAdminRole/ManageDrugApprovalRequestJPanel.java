/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.FDAAdminRole;

import Business.EcoSystem;
import Business.PharmaceuticalCompany.Drug;
import Business.WorkQueue.PharmaceuticalCompanyWorkRequest;
import Business.WorkQueue.WorkRequest;
import Business.WorldDrugAdministrativeAuthority;
import UserInterface.PharmaceuticalCompanyRole.ViewDrugGuidelinesJPanel;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rekhajindal
 */
public class ManageDrugApprovalRequestJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private WorldDrugAdministrativeAuthority worldDrugAdmin;
    /**
     * Creates new form ManageDrugApprovalRequestJPanel
     */
    public ManageDrugApprovalRequestJPanel(JPanel upc,WorldDrugAdministrativeAuthority admin) {
        initComponents();
        this.userProcessContainer=upc;
        this.worldDrugAdmin=admin;
        populateRequestTable();
    }

    public void populateRequestTable()
    {
        DefaultTableModel model=(DefaultTableModel)RequestDetailsJTable.getModel();
        model.setRowCount(0);
        for(WorkRequest wr:worldDrugAdmin.getWorkQueue().getWorkRequestList())
        {
            PharmaceuticalCompanyWorkRequest request=(PharmaceuticalCompanyWorkRequest)wr;
            Object[]row=new Object[6];
            row[0]=wr;
            row[1]=request.getDrug();
            row[2]=request.getDrug().getDrugName();
            row[3]=request.getDrug().getManufacturingCompany();
            row[4]=request.getDrug().getDrugStatus();
            row[5]=request.getStatus();
            model.addRow(row);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        RequestDetailsJTable = new javax.swing.JTable();
        btnProcessRequest = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnradioApprove = new javax.swing.JRadioButton();
        btnradionotApprove = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        btnViewDrugguidelines = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        RequestDetailsJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Message", "DrugID", "Drug Name", "Company Name", "Drug Status", "Work Request Status"
            }
        ));
        jScrollPane1.setViewportView(RequestDetailsJTable);

        btnProcessRequest.setText("Process Request");
        btnProcessRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessRequestActionPerformed(evt);
            }
        });

        jLabel1.setText("Drug Status");

        buttonGroup1.add(btnradioApprove);
        btnradioApprove.setText("Approve");

        buttonGroup1.add(btnradionotApprove);
        btnradionotApprove.setText("Not Approve");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Details of Work Request");

        btnViewDrugguidelines.setText("View Drug Guidelines");
        btnViewDrugguidelines.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDrugguidelinesActionPerformed(evt);
            }
        });

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(41, 41, 41)
                                .addComponent(btnradioApprove)
                                .addGap(33, 33, 33)
                                .addComponent(btnradionotApprove))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnViewDrugguidelines)
                                .addGap(110, 110, 110)
                                .addComponent(btnProcessRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBack)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnradioApprove)
                    .addComponent(btnradionotApprove))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnViewDrugguidelines)
                    .addComponent(btnProcessRequest))
                .addGap(44, 44, 44)
                .addComponent(btnBack)
                .addGap(31, 31, 31))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnProcessRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessRequestActionPerformed
        // TODO add your handling code here:
        String status=null;
        int selectedRow=RequestDetailsJTable.getSelectedRow();
        if(selectedRow < 0)
        {
            JOptionPane.showMessageDialog(null, "please select atleast one row");
        }
        if(btnradioApprove.isSelected())
        {
            status="Approved";
        }
        if(btnradionotApprove.isSelected())
        {
            status="Not Approved";
        }
        if(status==null)
        {
            JOptionPane.showMessageDialog(null, "please select proper option");
        }
        WorkRequest request=(WorkRequest)RequestDetailsJTable.getValueAt(selectedRow, 0);
        PharmaceuticalCompanyWorkRequest pcRequest=(PharmaceuticalCompanyWorkRequest)request;
        
        pcRequest.getDrug().setDrugStatus(status);
        pcRequest.setStatus("completed");
        populateRequestTable();
    }//GEN-LAST:event_btnProcessRequestActionPerformed

    private void btnViewDrugguidelinesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDrugguidelinesActionPerformed
        // TODO add your handling code here:
        int selectedRow=RequestDetailsJTable.getSelectedRow();
        if(selectedRow < 0)
        {
            JOptionPane.showMessageDialog(null, "please select atleast one row");
        }
        WorkRequest request=(WorkRequest)RequestDetailsJTable.getValueAt(selectedRow, 0);
        PharmaceuticalCompanyWorkRequest pcRequest=(PharmaceuticalCompanyWorkRequest)request;
        Drug drug=pcRequest.getDrug();
        ViewDrugGuidelinesJPanel panel=new ViewDrugGuidelinesJPanel(userProcessContainer, drug);
        userProcessContainer.add("View Drug Details from fda", panel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnViewDrugguidelinesActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable RequestDetailsJTable;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnProcessRequest;
    private javax.swing.JButton btnViewDrugguidelines;
    private javax.swing.JRadioButton btnradioApprove;
    private javax.swing.JRadioButton btnradionotApprove;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
