/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.AdministrativeRole;

import Business.EcoSystem;
import Business.Encounter.Encounter;
import Business.Enterprise.ClinicEnterprise;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Enterprise.PharmacyCompanyEnterprise;
import Business.Enterprise.PharmacyEnterprise;
import Business.Organization.Organization;
import Business.Organization.PatientOrganization;
import Business.Organization.PharmacyStoresOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.EmergencyEnquiryWorkRequest;
import Business.WorkQueue.WorkQueue;
import Business.WorkQueue.WorkRequest;
import UserInterface.PatientRole.ReceivedCommunicationWorkRequestJPanel;
import UserInterface.PharmaceuticalCompanyRole.DrugCallBackJPanel;
import UserInterface.PharmaceuticalCompanyRole.NetworkCommunicationJPanel;
import UserInterface.PharmaceuticalCompanyRole.ViewPharmacyCompanyJPanel;
import UserInterface.PharmacyRole.AddPharmacyStoresJPanel;
import UserInterface.PharmacyRole.ManagePharmaceuticalCompanyAndDrugsJPanel;
import UserInterface.PharmacyRole.ManagePharmacyWorkRequestJPanel;
import UserInterface.PharmacyRole.ViewDrugCallBackJPanel;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rekhajindal
 */
public class AdminWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem system;
    
    /**
     * Creates new form HospitalEnterpriseAdminWorkAreaJPanel
     */
    public AdminWorkAreaJPanel(JPanel upc,UserAccount userAccount, Enterprise enterprise,EcoSystem system) {
        initComponents();
        this.userProcessContainer=upc;
        this.userAccount=userAccount;
        this.enterprise=enterprise;
        this.system=system;
        hideControls();
        lblEnterpriseName.setText(enterprise.getName());
    }

    public void hideControls()
    {
        if(enterprise instanceof HospitalEnterprise )
        {
            btnRegisterPatient.setVisible(true);
            tblPanel.setVisible(true);
            btnEmergencySituation.setVisible(true);
            populateEmergencyRequestTable();
            btnManagePharmacyStores.setVisible(false);
            btnManagePharmaceuticalCompanies.setVisible(false);
            btnViewPharmacyCompany.setVisible(false);
            btnManagePharmacyWorkRequest.setVisible(false);
            btnDrugBackRequest.setVisible(false);
            btnManageFeedbackrequest.setVisible(false);
            btnNetworkCommunication.setVisible(false);
            btnViewDrugCallBackrequest.setVisible(false);
            btnreceivedcomm.setVisible(false);
            
        }
        else
        {
            btnRegisterPatient.setVisible(false);
            tblPanel.setVisible(false);
            btnEmergencySituation.setVisible(false);
        }
        
        if(enterprise instanceof ClinicEnterprise)
        {
            btnRegisterPatient.setVisible(true);
            tblPanel.setVisible(true);
            btnEmergencySituation.setVisible(false);
            populateEmergencyRequestTable();
            btnManagePharmacyStores.setVisible(false);
            btnManagePharmaceuticalCompanies.setVisible(false);
            btnViewPharmacyCompany.setVisible(false);
            btnManagePharmacyWorkRequest.setVisible(false);
            btnDrugBackRequest.setVisible(false);
            btnManageFeedbackrequest.setVisible(false);
            btnNetworkCommunication.setVisible(false);
            btnViewDrugCallBackrequest.setVisible(false);
            btnreceivedcomm.setVisible(false);
        }
        if(enterprise instanceof PharmacyEnterprise )
        {
            btnManagePharmacyStores.setVisible(true);
            btnManagePharmaceuticalCompanies.setVisible(true);
            btnViewDrugCallBackrequest.setVisible(true);
            btnManagePharmacyWorkRequest.setVisible(true);
            btnreceivedcomm.setVisible(true);
            btnViewPharmacyCompany.setVisible(false);
            btnManageFeedbackrequest.setVisible(false);
            btnNetworkCommunication.setVisible(false);
            btnDrugBackRequest.setVisible(false);
            btnManageEmployee.setVisible(false);
            
        }
        if(enterprise instanceof PharmacyCompanyEnterprise)
        {
            btnViewPharmacyCompany.setVisible(true);
            btnManageFeedbackrequest.setVisible(true);
            btnNetworkCommunication.setVisible(true);
            btnDrugBackRequest.setVisible(true);
            btnManagePharmacyStores.setVisible(false);
            btnManagePharmaceuticalCompanies.setVisible(false);
            btnManagePharmacyWorkRequest.setVisible(false);
            btnViewDrugCallBackrequest.setVisible(false);
            btnreceivedcomm.setVisible(false);
        }
    }
    
    public void populateEmergencyRequestTable()
    {
        DefaultTableModel model=(DefaultTableModel)EmergencyWorkRequestTable.getModel();
        model.setRowCount(0);
        for(WorkRequest request:enterprise.getWorkQueue().getWorkRequestList())
        {
            if(request instanceof EmergencyEnquiryWorkRequest)
            {
                EmergencyEnquiryWorkRequest enquiryRequest=(EmergencyEnquiryWorkRequest)request;
                Object[]row=new Object[4];
                row[0]=enquiryRequest;
                row[1]=enquiryRequest.getPatientMRN();
                row[2]=enquiryRequest.getDoctor().getFirstName();
                row[3]=enquiryRequest.getSenderEnterprise();
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

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnManageOrganization = new javax.swing.JButton();
        btnManageEmployee = new javax.swing.JButton();
        btnRegisterPatient = new javax.swing.JButton();
        btnManagePharmacyStores = new javax.swing.JButton();
        btnManagePharmaceuticalCompanies = new javax.swing.JButton();
        btnViewPharmacyCompany = new javax.swing.JButton();
        btnManagePharmacyWorkRequest = new javax.swing.JButton();
        btnEmergencySituation = new javax.swing.JButton();
        btnNetworkCommunication = new javax.swing.JButton();
        btnreceivedcomm = new javax.swing.JButton();
        btnDrugBackRequest = new javax.swing.JButton();
        btnViewDrugCallBackrequest = new javax.swing.JButton();
        btnManageFeedbackrequest = new javax.swing.JButton();
        tblPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        EmergencyWorkRequestTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnSendDetails = new javax.swing.JButton();
        lblEnterpriseName = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Admin Work Area");

        btnManageOrganization.setText("Manage Organization");
        btnManageOrganization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageOrganizationActionPerformed(evt);
            }
        });

        btnManageEmployee.setText("Manage Employee");
        btnManageEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageEmployeeActionPerformed(evt);
            }
        });

        btnRegisterPatient.setText("Manage patient");
        btnRegisterPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterPatientActionPerformed(evt);
            }
        });

        btnManagePharmacyStores.setText("Manage Pharmacy Stores");
        btnManagePharmacyStores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManagePharmacyStoresActionPerformed(evt);
            }
        });

        btnManagePharmaceuticalCompanies.setText("Manage Pharmaceutical Companies and Drugs");
        btnManagePharmaceuticalCompanies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManagePharmaceuticalCompaniesActionPerformed(evt);
            }
        });

        btnViewPharmacyCompany.setText("View Pharmacy Companies");
        btnViewPharmacyCompany.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewPharmacyCompanyActionPerformed(evt);
            }
        });

        btnManagePharmacyWorkRequest.setText("Manage Pharmacy Work Request");
        btnManagePharmacyWorkRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManagePharmacyWorkRequestActionPerformed(evt);
            }
        });

        btnEmergencySituation.setText("Emergency Situation");
        btnEmergencySituation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmergencySituationActionPerformed(evt);
            }
        });

        btnNetworkCommunication.setText("Network Communication Request");
        btnNetworkCommunication.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNetworkCommunicationActionPerformed(evt);
            }
        });

        btnreceivedcomm.setText("View Received Communication");
        btnreceivedcomm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreceivedcommActionPerformed(evt);
            }
        });

        btnDrugBackRequest.setText("create Drug CallBack Request");
        btnDrugBackRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDrugBackRequestActionPerformed(evt);
            }
        });

        btnViewDrugCallBackrequest.setText("view drug call Back request");
        btnViewDrugCallBackrequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDrugCallBackrequestActionPerformed(evt);
            }
        });

        btnManageFeedbackrequest.setText("Manage feedback Requests");
        btnManageFeedbackrequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageFeedbackrequestActionPerformed(evt);
            }
        });

        EmergencyWorkRequestTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Message", "Patient MRN", "Doctor Name", "Enterprise Name"
            }
        ));
        jScrollPane1.setViewportView(EmergencyWorkRequestTable);

        jLabel2.setText("List of Emergency Request");

        btnSendDetails.setText("send Encounter Details");
        btnSendDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendDetailsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tblPanelLayout = new javax.swing.GroupLayout(tblPanel);
        tblPanel.setLayout(tblPanelLayout);
        tblPanelLayout.setHorizontalGroup(
            tblPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tblPanelLayout.createSequentialGroup()
                .addGroup(tblPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tblPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(tblPanelLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tblPanelLayout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(btnSendDetails)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        tblPanelLayout.setVerticalGroup(
            tblPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tblPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(btnSendDetails)
                .addContainerGap())
        );

        lblEnterpriseName.setText("jLabel3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(tblPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(jLabel1)
                                .addGap(47, 47, 47)
                                .addComponent(lblEnterpriseName, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnRegisterPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnManageOrganization, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnManagePharmaceuticalCompanies)
                                    .addComponent(btnViewDrugCallBackrequest, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnManagePharmacyWorkRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnManagePharmacyStores, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnreceivedcomm, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(88, 88, 88)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnManageEmployee, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                                .addComponent(btnViewPharmacyCompany, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                                .addComponent(btnManageFeedbackrequest, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnEmergencySituation, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNetworkCommunication, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDrugBackRequest, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(224, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblEnterpriseName))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnManageOrganization)
                    .addComponent(btnManageEmployee))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegisterPatient)
                    .addComponent(btnEmergencySituation))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnManagePharmaceuticalCompanies)
                    .addComponent(btnViewPharmacyCompany))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnManageFeedbackrequest)
                    .addComponent(btnManagePharmacyWorkRequest))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(btnViewDrugCallBackrequest)
                        .addGap(35, 35, 35)
                        .addComponent(btnManagePharmacyStores))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(btnNetworkCommunication)
                        .addGap(48, 48, 48)
                        .addComponent(btnDrugBackRequest)))
                .addGap(13, 13, 13)
                .addComponent(btnreceivedcomm)
                .addGap(105, 105, 105)
                .addComponent(tblPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageOrganizationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageOrganizationActionPerformed
        // TODO add your handling code here:
        ManageOrganizationJPanel panel= new ManageOrganizationJPanel(userProcessContainer,userAccount,enterprise);
        userProcessContainer.add("ManageOrganizationPanel", panel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_btnManageOrganizationActionPerformed

    private void btnManageEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageEmployeeActionPerformed
        // TODO add your handling code here:
        ManageEmployeeJPanel panel=new ManageEmployeeJPanel(userProcessContainer,system,enterprise);
        userProcessContainer.add("ManageEmployeePanel", panel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageEmployeeActionPerformed

    private void btnRegisterPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterPatientActionPerformed
        // TODO add your handling code here:
        boolean flag= false;
        for(Organization org:enterprise.getOrganizationDirectory().getOrganizationList())
        {
          if(org instanceof PatientOrganization)
            {
                ManagePatientsJPanel panel=new ManagePatientsJPanel(userProcessContainer,enterprise,system.getAdministrative(),org);
                userProcessContainer.add("ManageEnterprisePatientPanel", panel);
                CardLayout layout=(CardLayout)userProcessContainer.getLayout();
                layout.next(userProcessContainer);
                flag=true;
            }

        }
        if(flag==false)
        {
            JOptionPane.showMessageDialog(null, "please create patient Organization first");
            return;
        }
    }//GEN-LAST:event_btnRegisterPatientActionPerformed

    private void btnManagePharmacyStoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManagePharmacyStoresActionPerformed
        // TODO add your handling code here:
        boolean flag= false;
        for(Organization org:enterprise.getOrganizationDirectory().getOrganizationList())
        {
          if(org instanceof PharmacyStoresOrganization)
            {
                AddPharmacyStoresJPanel panel=new AddPharmacyStoresJPanel(userProcessContainer,enterprise);
                userProcessContainer.add("AddPharmacyJPanel", panel);
                CardLayout layout=(CardLayout)userProcessContainer.getLayout();
                layout.next(userProcessContainer);
                flag=true;
            }
        }
        if(flag==false)
        {
            JOptionPane.showMessageDialog(null, "please create Pharmacy Stores Organization first");
            return;
        }
    }//GEN-LAST:event_btnManagePharmacyStoresActionPerformed

    private void btnManagePharmaceuticalCompaniesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManagePharmaceuticalCompaniesActionPerformed
        // TODO add your handling code here:
        ManagePharmaceuticalCompanyAndDrugsJPanel panel=new ManagePharmaceuticalCompanyAndDrugsJPanel(userProcessContainer,enterprise,system);
        userProcessContainer.add("ManagePharmaAndDrugsPanel", panel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManagePharmaceuticalCompaniesActionPerformed

    private void btnViewPharmacyCompanyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewPharmacyCompanyActionPerformed
        // TODO add your handling code here:
        ViewPharmacyCompanyJPanel panel=new ViewPharmacyCompanyJPanel(userProcessContainer,enterprise);
        userProcessContainer.add("ViewPharmacycompanyJPanel", panel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnViewPharmacyCompanyActionPerformed

    private void btnManagePharmacyWorkRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManagePharmacyWorkRequestActionPerformed
        // TODO add your handling code here:
        ManagePharmacyWorkRequestJPanel panel= new ManagePharmacyWorkRequestJPanel(userProcessContainer,enterprise);
        userProcessContainer.add("ManagePharmacyWorkRequestJPanel", panel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManagePharmacyWorkRequestActionPerformed

    private void btnEmergencySituationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmergencySituationActionPerformed
        // TODO add your handling code here:
        HandleEmergencySituationJPanel panel=new HandleEmergencySituationJPanel(userProcessContainer,enterprise);
        userProcessContainer.add("HandleEmergencyJPanel", panel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnEmergencySituationActionPerformed

    private void btnSendDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendDetailsActionPerformed
        // TODO add your handling code here:
        
        int selectedRow=EmergencyWorkRequestTable.getSelectedRow();
        if(selectedRow < 0)
        {
            JOptionPane.showMessageDialog(null,"please select a row");
            return;
        }
        WorkRequest request=(WorkRequest)EmergencyWorkRequestTable.getValueAt(selectedRow, 0);
        EmergencyEnquiryWorkRequest enquiryRequest=(EmergencyEnquiryWorkRequest)request;
        long patientMRN=enquiryRequest.getPatientMRN();
        
        if(enterprise instanceof HospitalEnterprise )//|| enterprise instanceof ClinicEnterprise)
        {
            HospitalEnterprise hosEnterprise=(HospitalEnterprise)enterprise;
            for(Encounter encounter:hosEnterprise.getEncounterList())
            {
                if(encounter.getPatient().getPatientMRN()==patientMRN)
                {
                  enquiryRequest.getEncounterList().add(encounter);
                }
            }
            
        }
        
        if(enterprise instanceof ClinicEnterprise )//|| enterprise instanceof ClinicEnterprise)
        {
            ClinicEnterprise clinicEnterprise=(ClinicEnterprise)enterprise;
            for(Encounter encounter:clinicEnterprise.getEncounterList())
            {
                if(encounter.getPatient().getPatientMRN()==patientMRN)
                {
                  enquiryRequest.getEncounterList().add(encounter);
                }
            }
            
        }
        enterprise.getWorkQueue().getWorkRequestList().remove(request);
        
    }//GEN-LAST:event_btnSendDetailsActionPerformed

    private void btnNetworkCommunicationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNetworkCommunicationActionPerformed
        // TODO add your handling code here:
        NetworkCommunicationJPanel panel=new NetworkCommunicationJPanel(userProcessContainer, enterprise, system);
        userProcessContainer.add("networkCommunicationJPanel", panel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnNetworkCommunicationActionPerformed

    private void btnreceivedcommActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreceivedcommActionPerformed
        // TODO add your handling code here:
        WorkQueue pharmacyQueue=enterprise.getWorkQueue();
        ReceivedCommunicationWorkRequestJPanel panel=new ReceivedCommunicationWorkRequestJPanel(userProcessContainer, pharmacyQueue);
        userProcessContainer.add("ReceivedCommunicationPharmacyJPanel", panel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnreceivedcommActionPerformed

    private void btnDrugBackRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDrugBackRequestActionPerformed
        // TODO add your handling code here:
        DrugCallBackJPanel panel=new DrugCallBackJPanel(userProcessContainer, enterprise);
        userProcessContainer.add("DrugcallBackJPanel", panel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnDrugBackRequestActionPerformed

    private void btnViewDrugCallBackrequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDrugCallBackrequestActionPerformed
        // TODO add your handling code here:
        ViewDrugCallBackJPanel panel=new ViewDrugCallBackJPanel(userProcessContainer, enterprise);
        userProcessContainer.add("ViewDrugcallBackJPanel", panel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnViewDrugCallBackrequestActionPerformed

    private void btnManageFeedbackrequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageFeedbackrequestActionPerformed
        // TODO add your handling code here:
        ManageFeedBackWorkRequestJPanel panel=new ManageFeedBackWorkRequestJPanel(userProcessContainer,enterprise);
        userProcessContainer.add("ManageFeedbackJPanel", panel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageFeedbackrequestActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable EmergencyWorkRequestTable;
    private javax.swing.JButton btnDrugBackRequest;
    private javax.swing.JButton btnEmergencySituation;
    private javax.swing.JButton btnManageEmployee;
    private javax.swing.JButton btnManageFeedbackrequest;
    private javax.swing.JButton btnManageOrganization;
    private javax.swing.JButton btnManagePharmaceuticalCompanies;
    private javax.swing.JButton btnManagePharmacyStores;
    private javax.swing.JButton btnManagePharmacyWorkRequest;
    private javax.swing.JButton btnNetworkCommunication;
    private javax.swing.JButton btnRegisterPatient;
    private javax.swing.JButton btnSendDetails;
    private javax.swing.JButton btnViewDrugCallBackrequest;
    private javax.swing.JButton btnViewPharmacyCompany;
    private javax.swing.JButton btnreceivedcomm;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEnterpriseName;
    private javax.swing.JPanel tblPanel;
    // End of variables declaration//GEN-END:variables
}
