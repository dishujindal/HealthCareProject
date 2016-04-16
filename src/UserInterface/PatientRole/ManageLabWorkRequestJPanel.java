/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.PatientRole;

import Business.Patient.Patient;
import Business.WorkQueue.EncounterLabWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rekhajindal
 */
public class ManageLabWorkRequestJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Patient patient;
    /**
     * Creates new form ManageLabWorkRequest
     */
    public ManageLabWorkRequestJPanel(JPanel upc, Patient patient) {
        initComponents();
        this.userProcessContainer=upc;
        this.patient=patient;
        populateLabWorkRequestTable();
    }

    public void populateLabWorkRequestTable()
    {
        DefaultTableModel model=(DefaultTableModel)PatientLabWorkRequestTable.getModel();
        model.setRowCount(0);
        for(WorkRequest request:patient.getWorkQueue().getWorkRequestList())
        {
            if(request instanceof EncounterLabWorkRequest)
            {
                EncounterLabWorkRequest labRequest=(EncounterLabWorkRequest)request;
                Object[]row=new Object[5];
                row[0]=labRequest;
                row[1]=labRequest.getSender().getFirstName()+labRequest.getSender().getLastName();
                row[2]=labRequest.getSenderEnterprise().getName();
                row[3]=labRequest.getLabTestResult();
                row[4]=labRequest.getStatus();
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
        PatientLabWorkRequestTable = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();

        jLabel1.setText("List of Work Request");

        PatientLabWorkRequestTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Message", "Doctor Name", "Enterprise Name", "Lab Test Status", "Request Status"
            }
        ));
        jScrollPane1.setViewportView(PatientLabWorkRequestTable);

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
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(105, 105, 105))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(224, 224, 224)
                .addComponent(btnBack)
                .addGap(67, 67, 67))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable PatientLabWorkRequestTable;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}