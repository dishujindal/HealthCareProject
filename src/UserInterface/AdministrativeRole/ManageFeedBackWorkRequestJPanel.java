/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.AdministrativeRole;

import Business.Doctor.Doctor;
import Business.Enterprise.Enterprise;
import Business.Enterprise.PharmacyCompanyEnterprise;
import Business.Patient.Patient;
import Business.WorkQueue.FeedbackToPharmaCompanyWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rekhajindal
 */
public class ManageFeedBackWorkRequestJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Enterprise enterprise;
    /**
     * Creates new form ManageFeedBackWorkRequest
     */
    public ManageFeedBackWorkRequestJPanel(JPanel upc,Enterprise enterprise) {
        initComponents();
        this.userProcessContainer=upc;
        this.enterprise=enterprise;
        populatePatientFeedbackRequest();
    }

    
    public void populatePatientFeedbackRequest()
    {
        DefaultTableModel model=(DefaultTableModel)patientFeedbackrequest.getModel();
        model.setRowCount(0);
        
        if(enterprise instanceof PharmacyCompanyEnterprise)
        {
            PharmacyCompanyEnterprise phComEnterprise=(PharmacyCompanyEnterprise)enterprise;
            for(WorkRequest request:phComEnterprise.getWorkQueue().getWorkRequestList())
            {
                if(request instanceof FeedbackToPharmaCompanyWorkRequest)
                {
                    FeedbackToPharmaCompanyWorkRequest feedRequest=(FeedbackToPharmaCompanyWorkRequest)request;
                    if(feedRequest.getSender() instanceof Patient)
                    {
                        Object[]row=new Object[4];
                        row[0]=feedRequest;
                        row[1]="Patient";
                        row[2]=feedRequest.getSender().getFirstName();
                        row[3]=feedRequest.getDrug().getDrugName();
                        model.addRow(row);
                    }
                    
                    if(feedRequest.getSender() instanceof Doctor)
                    {
                        Object[]row=new Object[4];
                        row[0]=feedRequest;
                        row[1]="Doctor";
                        row[2]=feedRequest.getSender().getFirstName();
                        row[3]=feedRequest.getDrug().getDrugName();
                        model.addRow(row);
                    }
                }
                
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

        jScrollPane1 = new javax.swing.JScrollPane();
        patientFeedbackrequest = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        patientFeedbackrequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Message", "sender", "Patient Name", "Drug Name"
            }
        ));
        jScrollPane1.setViewportView(patientFeedbackrequest);

        jLabel2.setText("List of FeedBack Work Request");

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
                        .addGap(23, 23, 23)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(btnBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(114, 114, 114))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel2)
                .addGap(48, 48, 48)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addComponent(btnBack)
                .addContainerGap(34, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable patientFeedbackrequest;
    // End of variables declaration//GEN-END:variables
}
