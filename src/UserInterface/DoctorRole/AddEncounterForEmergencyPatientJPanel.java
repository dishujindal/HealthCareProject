/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.DoctorRole;

import Business.Doctor.Doctor;
import Business.Encounter.Encounter;
import Business.Enterprise.ClinicEnterprise;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Patient.Patient;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author rekhajindal
 */
public class AddEncounterForEmergencyPatientJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private Doctor doctor;
    private Patient patient;
    /**
     * Creates new form AddEncounterForEmergencyPatientJPanel
     */
    public AddEncounterForEmergencyPatientJPanel(JPanel upc,Enterprise enterprise,Doctor doctor,Patient patient) {
        initComponents();
        this.userProcessContainer=upc;
        this.enterprise=enterprise;
        this.doctor=doctor;
        this.patient=patient;
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
        txtBldPressure = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtHeartRate = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtRespiartoryRate = new javax.swing.JTextField();
        btnAddEncounter = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txttemperature = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtRemarks = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();

        jLabel1.setText("Blood Pressure");

        jLabel2.setText("Heart Rate");

        jLabel3.setText("Respiratory Rate");

        btnAddEncounter.setText("Add Encounter");
        btnAddEncounter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddEncounterActionPerformed(evt);
            }
        });

        jLabel4.setText("Temperature");

        jLabel5.setText("Remarks");

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
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAddEncounter)
                            .addComponent(txtBldPressure)
                            .addComponent(txtHeartRate)
                            .addComponent(txtRespiartoryRate)
                            .addComponent(txttemperature)
                            .addComponent(txtRemarks, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE))))
                .addGap(340, 340, 340))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtBldPressure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtHeartRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRespiartoryRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txttemperature, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(txtRemarks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(btnAddEncounter)
                .addGap(38, 38, 38)
                .addComponent(btnBack)
                .addGap(33, 33, 33))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddEncounterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEncounterActionPerformed
        // TODO add your handling code here:
        float bloodPressure = Float.parseFloat(txtBldPressure.getText());
        float respiratoryRate = Float.parseFloat(txtRespiartoryRate.getText());
        float heartRate = Float.parseFloat(txtHeartRate.getText());
        float temperature = Float.parseFloat(txttemperature.getText());
        String remarks=txtRemarks.getText();
        Encounter encounter=new Encounter();
        encounter.getVitalSign().setBloodPressure(bloodPressure);
        encounter.getVitalSign().setHeartRate(heartRate);
        encounter.getVitalSign().setRespiratoryRate(respiratoryRate);
        encounter.getVitalSign().setTemperature(temperature);
        encounter.setDoctor(doctor);
        encounter.setPatient(patient);
        encounter.setDiagnosis(remarks);
        if(enterprise instanceof HospitalEnterprise)
        {
            HospitalEnterprise hosEnterprise=(HospitalEnterprise)enterprise;
            hosEnterprise.getEncounterList().add(encounter);
        }
        if(enterprise instanceof ClinicEnterprise)
        {
            ClinicEnterprise clinicEnterprise=(ClinicEnterprise)enterprise;
            clinicEnterprise.getEncounterList().add(encounter);
        }
    }//GEN-LAST:event_btnAddEncounterActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddEncounter;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtBldPressure;
    private javax.swing.JTextField txtHeartRate;
    private javax.swing.JTextField txtRemarks;
    private javax.swing.JTextField txtRespiartoryRate;
    private javax.swing.JTextField txttemperature;
    // End of variables declaration//GEN-END:variables
}