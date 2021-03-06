/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.AdministrativeRole;

import Business.Patient.Patient;
import Business.Person.Address;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author rekhajindal
 */
public class ViewPatientDetailsJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Patient patient;
    /**
     * Creates new form ViewPatientDetailsJPanel
     */
    public ViewPatientDetailsJPanel(JPanel upc, Patient patient) {
        initComponents();
        this.userProcessContainer=upc;
        this.patient=patient;
        populateAllFields();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtFirstname = new javax.swing.JTextField();
        txtStreetAddress = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtallergy = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtlastName = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtSSnNumber = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        txtInsuranceID = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtInsuranceCompany = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtPhnNumber = new javax.swing.JTextField();
        txtEmailID = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtState = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtCountry = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        txtDateofBirth = new javax.swing.JTextField();
        txtMartialStatus = new javax.swing.JTextField();
        txtgender = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        txtPreffredDoctor = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(txtFirstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 50, 85, -1));
        add(txtStreetAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 278, 91, -1));

        jLabel5.setText("Date of Birth");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 88, -1, -1));
        add(txtallergy, new org.netbeans.lib.awtextra.AbsoluteConstraints(523, 199, 91, -1));

        jLabel13.setText("Street Address");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 281, -1, -1));

        jLabel22.setText("Maritial Status");
        add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 244, -1, -1));

        jLabel12.setText("Gender");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(384, 242, -1, -1));
        add(txtlastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(523, 50, 91, -1));

        jLabel21.setText("Medicine Allergy");
        add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(388, 205, -1, -1));

        jLabel15.setText("State");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 334, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Patient Details");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 10, -1, -1));
        add(txtSSnNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(523, 88, 91, -1));

        jLabel2.setText("First Name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 53, -1, -1));
        add(txtCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(526, 284, 94, -1));
        add(txtInsuranceID, new org.netbeans.lib.awtextra.AbsoluteConstraints(523, 161, 91, -1));

        jLabel19.setText("Preffered Doctor");
        add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 205, -1, -1));
        add(txtInsuranceCompany, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 164, 91, -1));

        jLabel18.setText("Insurance ID");
        add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(388, 164, -1, -1));
        add(txtPhnNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(523, 126, 91, -1));
        add(txtEmailID, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 126, 91, -1));

        jLabel8.setText("Phone Number");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(388, 129, -1, -1));
        add(txtState, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, 91, -1));

        jLabel16.setText("Country");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(384, 334, -1, -1));
        add(txtCountry, new org.netbeans.lib.awtextra.AbsoluteConstraints(526, 331, 96, -1));

        jLabel14.setText("City");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(394, 277, -1, 34));

        jLabel9.setText("Email ID");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 129, -1, -1));

        jLabel17.setText("Insurance Company");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 167, -1, -1));

        jLabel6.setText("SSN Number");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(388, 91, -1, -1));

        jLabel7.setText("Last Name");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(397, 53, -1, -1));

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 521, -1, -1));
        add(txtDateofBirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 87, 82, -1));
        add(txtMartialStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 239, 90, -1));
        add(txtgender, new org.netbeans.lib.awtextra.AbsoluteConstraints(526, 239, 89, -1));

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 428, -1, -1));

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 428, 78, -1));

        txtPreffredDoctor.setText("jTextField1");
        add(txtPreffredDoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 90, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        txtCity.setEnabled(true);
        txtCountry.setEnabled(true);
        txtEmailID.setEnabled(true);
        txtFirstname.setEnabled(true);
        txtInsuranceCompany.setEnabled(true);
        txtInsuranceID.setEnabled(true);
        txtDateofBirth.setEnabled(true);
        txtPhnNumber.setEnabled(true);
        txtSSnNumber.setEnabled(true);
        txtState.setEnabled(true);
        txtStreetAddress.setEnabled(true);
        txtallergy.setEnabled(true);
        txtlastName.setEnabled(true);
        txtMartialStatus.setEnabled(true);
        txtgender.setEnabled(true);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
                patient.setFirstName(txtFirstname.getText());
                patient.setLastName(txtlastName.getText());
                patient.setEmailID(txtEmailID.getText());
                patient.setGender(txtgender.getText());
                patient.setPhoneNumber(Integer.parseInt(txtPhnNumber.getText()));
                patient.setSsnNumber(txtSSnNumber.getText());
                patient.setDateofBirth(txtDateofBirth.getText());
                Address personAddress=new Address();
                personAddress.setCity(txtCity.getText());
                personAddress.setCountry(txtCountry.getText());
                personAddress.setState(txtState.getText());
                personAddress.setStreetAdress(txtStreetAddress.getText());
                patient.setPersonAddress(personAddress);
               
                patient.setHealthAllergy(txtallergy.getText());
                patient.setInsuranceCompany(txtInsuranceCompany.getText());
                patient.setInsuranceNumber(txtInsuranceID.getText());
                patient.setMaritialStatus(txtMartialStatus.getText());
    }//GEN-LAST:event_btnSaveActionPerformed
    public void populateAllFields()
    {
        txtFirstname.setText(patient.getFirstName());
        txtlastName.setText(patient.getLastName());
        txtCity.setText(patient.getPersonAddress().getCity());
        txtCountry.setText(patient.getPersonAddress().getCountry());
        txtEmailID.setText(patient.getEmailID());
        txtInsuranceCompany.setText(patient.getInsuranceCompany());
        txtInsuranceID.setText(patient.getInsuranceNumber());
        txtPhnNumber.setText(String.valueOf(patient.getPhoneNumber()));
        txtSSnNumber.setText(patient.getSsnNumber());
        txtState.setText(patient.getPersonAddress().getState());
        txtStreetAddress.setText(patient.getPersonAddress().getStreetAdress());
        txtallergy.setText(patient.getHealthAllergy());
        txtDateofBirth.setText(patient.getDateofBirth());
        txtMartialStatus.setText(patient.getMaritialStatus());
        txtgender.setText(patient.getGender());
        txtPreffredDoctor.setText(String.valueOf(patient.getPreffredDoctor()));
        txtCity.setEnabled(false);
        txtCountry.setEnabled(false);
        txtEmailID.setEnabled(false);
        txtFirstname.setEnabled(false);
        txtInsuranceCompany.setEnabled(false);
        txtInsuranceID.setEnabled(false);
        txtDateofBirth.setEnabled(false);
        txtPhnNumber.setEnabled(false);
        txtSSnNumber.setEnabled(false);
        txtState.setEnabled(false);
        txtStreetAddress.setEnabled(false);
        txtallergy.setEnabled(false);
        txtlastName.setEnabled(false);
        txtMartialStatus.setEnabled(false);
        txtgender.setEnabled(false);
        txtPreffredDoctor.setEnabled(false);
                
                
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtCountry;
    private javax.swing.JTextField txtDateofBirth;
    private javax.swing.JTextField txtEmailID;
    private javax.swing.JTextField txtFirstname;
    private javax.swing.JTextField txtInsuranceCompany;
    private javax.swing.JTextField txtInsuranceID;
    private javax.swing.JTextField txtMartialStatus;
    private javax.swing.JTextField txtPhnNumber;
    private javax.swing.JTextField txtPreffredDoctor;
    private javax.swing.JTextField txtSSnNumber;
    private javax.swing.JTextField txtState;
    private javax.swing.JTextField txtStreetAddress;
    private javax.swing.JTextField txtallergy;
    private javax.swing.JTextField txtgender;
    private javax.swing.JTextField txtlastName;
    // End of variables declaration//GEN-END:variables
}
