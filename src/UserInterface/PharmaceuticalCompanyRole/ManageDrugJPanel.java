/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.PharmaceuticalCompanyRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.PharmacyCompanyEnterprise;
import Business.Organization.Organization;
import Business.PharmaceuticalCompany.Drug;
import Business.WorkQueue.PharmaceuticalCompanyWorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rekhajindal
 */
public class ManageDrugJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Organization organization;
    private Enterprise enterprise;
    private EcoSystem system;
    /**
     * Creates new form ManageDrugJPanel
     */
    public ManageDrugJPanel(JPanel upc, Organization org,Enterprise enterprise,EcoSystem system) {
        initComponents();
        this.userProcessContainer=upc;
        this.organization=org;
        this.enterprise=enterprise;
        this.system=system;
        populateDrugDetailsTable();
    }

    public void populateDrugDetailsTable()
    {
        PharmacyCompanyEnterprise pcEnterprise=(PharmacyCompanyEnterprise)enterprise;
        DefaultTableModel model=(DefaultTableModel)DrugDetailsJtable.getModel();
        model.setRowCount(0);
        for(Drug drug:pcEnterprise.getDrugList())
        {
            Object[]row=new Object[4];
            row[0]=drug;
            row[1]=drug.getDrugName();
            row[2]=drug.getDrugStrength();
            row[3]=drug.getDrugStatus();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        DrugDetailsJtable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        btnApprovalRequest = new javax.swing.JButton();
        btnAddDrug = new javax.swing.JButton();
        btnback = new javax.swing.JButton();

        DrugDetailsJtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Drug ID", "Drug Name", "Strength", "FDA sttaus"
            }
        ));
        jScrollPane1.setViewportView(DrugDetailsJtable);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Drug Details");

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        btnApprovalRequest.setText("Send Approval Request");
        btnApprovalRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApprovalRequestActionPerformed(evt);
            }
        });

        btnAddDrug.setText("Create Drug");
        btnAddDrug.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDrugActionPerformed(evt);
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
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnback)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAddDrug)
                        .addGap(27, 27, 27)
                        .addComponent(btnDelete)
                        .addGap(18, 18, 18)
                        .addComponent(btnApprovalRequest))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(363, 363, 363)
                        .addComponent(btnRefresh)))
                .addGap(134, 134, 134))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete)
                    .addComponent(btnRefresh)
                    .addComponent(btnApprovalRequest)
                    .addComponent(btnAddDrug))
                .addGap(208, 208, 208)
                .addComponent(btnback)
                .addGap(35, 35, 35))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnApprovalRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApprovalRequestActionPerformed
        // TODO add your handling code here:
        int selectedRow=DrugDetailsJtable.getSelectedRow();
        if(selectedRow <0)
        {
            JOptionPane.showMessageDialog(null, "please select atleast one row");
            return;
        }
        Drug drug=(Drug)DrugDetailsJtable.getValueAt(selectedRow, 0);
        if(drug.getDrugStatus().equals("Approved"))
        {
            JOptionPane.showMessageDialog(null,"You can not forward request for this drug");
            return;
        }
        SendApprovalRequestJPanel panel=new SendApprovalRequestJPanel(userProcessContainer,drug,enterprise,system);
        userProcessContainer.add("SendApprovalRequestPanel", panel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnApprovalRequestActionPerformed

    private void btnAddDrugActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDrugActionPerformed
        // TODO add your handling code here:
        CreateDrugJPanel panel=new CreateDrugJPanel(userProcessContainer,enterprise);
        userProcessContainer.add("CreateDrugJPanel", panel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnAddDrugActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        populateDrugDetailsTable();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnbackActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow=DrugDetailsJtable.getSelectedRow();
        if(selectedRow <0)
        {
            JOptionPane.showMessageDialog(null, "please select atleast one row");
            return;
        }
        Drug drug=(Drug)DrugDetailsJtable.getValueAt(selectedRow, 0);
        PharmacyCompanyEnterprise ent=(PharmacyCompanyEnterprise)enterprise;
        ent.getDrugList().remove(drug);
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable DrugDetailsJtable;
    private javax.swing.JButton btnAddDrug;
    private javax.swing.JButton btnApprovalRequest;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnback;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
