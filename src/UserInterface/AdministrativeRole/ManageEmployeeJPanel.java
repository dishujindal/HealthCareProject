/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.AdministrativeRole;

import Business.Doctor.Doctor;
import Business.Doctor.LabAssistant;
import Business.Doctor.Nurse;
import Business.EcoSystem;
import Business.Enterprise.ClinicEnterprise;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Enterprise.PharmacyCompanyEnterprise;
import Business.Enterprise.PharmacyEnterprise;
import Business.Organization.DoctorOrganization;
import Business.Organization.DrugManagementOrganization;
import Business.Organization.LabAssistantOrganization;
import Business.Organization.NurseOrganization;
import Business.Organization.Organization;
import Business.Organization.Organization.Type;
import Business.Organization.PatientOrganization;
import Business.Patient.Patient;
import Business.Person.DrugAdmin;
import Business.Person.Person;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rekhajindal
 */
public class ManageEmployeeJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;
    private Enterprise enterprise;
    private Organization organization;
    /**
     * Creates new form ManageEmployeeJPanel
     */
    public ManageEmployeeJPanel(JPanel upc, EcoSystem system,Enterprise enterprise) {
        initComponents();
        this.userProcessContainer=upc;
        this.system=system;
        this.enterprise=enterprise;
        populateManageEmployeeTable();
        populateComboOrganization();
    }

    
    
    public void populateComboOrganization()
    {
        comboOrganizationList.removeAllItems();
         if (enterprise instanceof HospitalEnterprise) 
        {
            for (Organization.Type type : Organization.Type.values()) {
                if (type.getValue().equals(Organization.Type.Doctor.getValue()) || type.getValue().equals(Organization.Type.LabAssistant.getValue()) )
                {
                    comboOrganizationList.addItem(type);
                }
            }
        }
         else if (enterprise instanceof ClinicEnterprise) 
          {
            for (Organization.Type type : Organization.Type.values()) 
            {
                if (type.getValue().equals(Organization.Type.Doctor.getValue()) || type.getValue().equals(Organization.Type.LabAssistant.getValue()) )
                {
                    comboOrganizationList.addItem(type);
                }
            }
         }
        
        else if (enterprise instanceof PharmacyEnterprise) 
          {
            for (Organization.Type type : Organization.Type.values()) 
            {
                if (type.getValue().equals(Organization.Type.PharmacyStores.getValue()) || type.getValue().equals(Organization.Type.pharmaceuticalCompany.getValue())) 
                {
                    comboOrganizationList.addItem(type);
                }
            }
         }
        
        else if (enterprise instanceof PharmacyCompanyEnterprise) 
          {
            for (Organization.Type type : Organization.Type.values()) 
            {
                if (type.getValue().equals(Organization.Type.DrugManagement.getValue()) )
                {
                    comboOrganizationList.addItem(type);
                }
            }
            btnDelete.setVisible(false);
         }
    }
    public void populateManageEmployeeTable()
    {
        DefaultTableModel model=(DefaultTableModel)ManageEmployeeJTable.getModel();
        model.setRowCount(0);
        //int size=system.getAdministrative().getPerosnDirectory().getPersonList().size();
        for(Organization org: enterprise.getOrganizationDirectory().getOrganizationList())
        {
            if(org instanceof DoctorOrganization)
            {
                for(Person person:org.getPerosnDirectory().getPersonList())
                {
                    Doctor doctor=(Doctor)person;
                    Object[]row=new Object[3];
                    row[0]=doctor;
                    row[1]=doctor.getFirstName();
                    row[2]=org;
                    model.addRow(row);

                }
            }
            if(org instanceof PatientOrganization)
            {
                for(Person person:org.getPerosnDirectory().getPersonList())
                {
                
                Patient patient=(Patient)person;
                Object[]row=new Object[3];
                row[0]=patient;
                row[1]=patient.getFirstName();
                row[2]=org;
                model.addRow(row);

                }
            }
            if(org instanceof NurseOrganization)
            {
                for(Person person:org.getPerosnDirectory().getPersonList())
                {

                 Nurse nurse=(Nurse)person;
                Object[]row=new Object[3];
                row[0]=nurse;
                row[1]=nurse.getFirstName();
                row[2]=org;
                model.addRow(row);

                }
            }
            if(org instanceof LabAssistantOrganization)
            {
                for(Person person:org.getPerosnDirectory().getPersonList())
                {

                LabAssistant assistant=(LabAssistant)person;
                Object[]row=new Object[3];
                row[0]=assistant;
                row[1]=assistant.getFirstName();
                row[2]=org;
                model.addRow(row);

                }
            }
            if(org instanceof DrugManagementOrganization)
            {
                for(Person person:org.getPerosnDirectory().getPersonList())
                {

                DrugAdmin admin=(DrugAdmin)person;
                Object[]row=new Object[3];
                row[0]=admin;
                row[1]=admin.getFirstName();
                row[2]=org;
                model.addRow(row);

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
        ManageEmployeeJTable = new javax.swing.JTable();
        btnAddEmployee = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        btnregisterDoctor = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        comboOrganizationList = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        ManageEmployeeJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "PersonID", "Employee Name", "Organization"
            }
        ));
        jScrollPane1.setViewportView(ManageEmployeeJTable);

        btnAddEmployee.setText("Add Employee");
        btnAddEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddEmployeeActionPerformed(evt);
            }
        });

        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        btnregisterDoctor.setText("Add  Doctor");
        btnregisterDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregisterDoctorActionPerformed(evt);
            }
        });

        jLabel1.setText("List of Orgnizations");

        comboOrganizationList.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboOrganizationList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboOrganizationListActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Employee Details");

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel1)
                        .addGap(31, 31, 31)
                        .addComponent(comboOrganizationList, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(btnBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(btnAddEmployee)
                                .addGap(26, 26, 26)
                                .addComponent(btnDelete)
                                .addGap(28, 28, 28)
                                .addComponent(btnregisterDoctor)
                                .addGap(30, 30, 30)
                                .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(78, 78, 78))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(comboOrganizationList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddEmployee)
                    .addComponent(btnRefresh)
                    .addComponent(btnDelete)
                    .addComponent(btnregisterDoctor))
                .addGap(73, 73, 73)
                .addComponent(btnBack)
                .addGap(32, 32, 32))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEmployeeActionPerformed
        // TODO add your handling code here:
     Boolean flag=false;
        Type type=(Type)comboOrganizationList.getSelectedItem();
        if(type.getValue().equals(Organization.Type.Nurse.getValue()))
        {
            for(Organization org:enterprise.getOrganizationDirectory().getOrganizationList())
            {
                if(org instanceof NurseOrganization)
                {
                    organization=org;
                    AddEmployeeJPanel panel = new AddEmployeeJPanel(userProcessContainer,enterprise,organization);
                    userProcessContainer.add("AddEmployeePanel", panel);
                    CardLayout layout=(CardLayout)userProcessContainer.getLayout();
                    layout.next(userProcessContainer);
                    flag=true;
                }
            }
            if(flag==false)
            {
                JOptionPane.showMessageDialog(null, "Please create Nurse Organization");
                return;
            }
        }
        
            if(type.getValue().equals(Organization.Type.LabAssistant.getValue()))
            {
                for(Organization org:enterprise.getOrganizationDirectory().getOrganizationList())
                {
                   if(org instanceof LabAssistantOrganization)
                    {
                        organization=org;
                        AddEmployeeJPanel panel = new AddEmployeeJPanel(userProcessContainer,enterprise,organization);
                        userProcessContainer.add("AddEmployeePanel", panel);
                        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
                        layout.next(userProcessContainer);
                        flag=true;
                    }
                }
                if(flag==false)
                {
                    JOptionPane.showMessageDialog(null, "Please create Lab Assistant Organization ");
                    return;
                }
            }
            
            if(type.getValue().equals(Organization.Type.DrugManagement.getValue()))
        {
            for(Organization org:enterprise.getOrganizationDirectory().getOrganizationList())
            {
                if(org instanceof DrugManagementOrganization)
                {
                    organization=org;
                    AddEmployeeJPanel panel = new AddEmployeeJPanel(userProcessContainer,enterprise,organization);
                    userProcessContainer.add("AddEmployeePanel", panel);
                    CardLayout layout=(CardLayout)userProcessContainer.getLayout();
                    layout.next(userProcessContainer);
                    flag=true;
                }
            }
            if(flag==false)
            {
                JOptionPane.showMessageDialog(null, "Please create DrugManagement Organization");
                return;
            }
        }
        
    }//GEN-LAST:event_btnAddEmployeeActionPerformed

    private void btnregisterDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregisterDoctorActionPerformed
        // TODO add your handling code here:
        Boolean flag=false;
        for(Organization org:enterprise.getOrganizationDirectory().getOrganizationList())
        {
            if(org instanceof DoctorOrganization)
            {
                RegisterDoctorJPanel panel=new RegisterDoctorJPanel(userProcessContainer,system.getAdministrative().getPerosnDirectory().getPersonList(),org,enterprise);
                userProcessContainer.add("RegisterEmployeePanel", panel);
                CardLayout layout=(CardLayout)userProcessContainer.getLayout();
                layout.next(userProcessContainer);
                flag=true;
            }
        }
        if(flag==false)
        {
            JOptionPane.showMessageDialog(null, "please create Doctor Organization");
        }
    }//GEN-LAST:event_btnregisterDoctorActionPerformed

    private void comboOrganizationListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboOrganizationListActionPerformed
        // TODO add your handling code here:
        Type type=(Type)comboOrganizationList.getSelectedItem();
        if(type!=null)
        {
        if(type.getValue().equals(Organization.Type.Doctor.getValue()))
        {
            btnregisterDoctor.setVisible(true);
            btnAddEmployee.setVisible(false);
            btnRefresh.setVisible(true);
        }
        
        else
        {
            btnregisterDoctor.setVisible(false);
            btnAddEmployee.setVisible(true);
            btnRefresh.setVisible(true);
        }
        }
    }//GEN-LAST:event_comboOrganizationListActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        populateManageEmployeeTable();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow=ManageEmployeeJTable.getSelectedRow();
        if(selectedRow < 0)
        {
            JOptionPane.showMessageDialog(null,"please select a row");
            return;
        }
        Person person=(Person)ManageEmployeeJTable.getValueAt(selectedRow,0);
        
            if(person instanceof Doctor)
               {
                 for(Organization org:enterprise.getOrganizationDirectory().getOrganizationList())
                 {
                    if(org instanceof DoctorOrganization)
                      {
                           org.getPerosnDirectory().getPersonList().remove(person);
                      }
                 }
                 Doctor doc=(Doctor)person;
                 doc.getEnterpriseList().remove(enterprise);
               }
        
            if(person instanceof Patient)
            {
                JOptionPane.showMessageDialog(null, "You can not delete any patient");
                return;
            }
        
        if(person instanceof LabAssistant)
        {
            Organization labOrg=null;
            for(Organization org:enterprise.getOrganizationDirectory().getOrganizationList())
                 {
                     if(org instanceof LabAssistantOrganization)
                     {
                         labOrg=org;
                         org.getPerosnDirectory().getPersonList().remove(person);
                     }
                 }
            for(UserAccount account:labOrg.getUserAccountDirectory().getUserAccountList())
            {
                if(account.getPerson()==person)
                {
                    enterprise.getUserAccountDirectory().getUserAccountList().remove(account);
                }
            }
        }
       
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ManageEmployeeJTable;
    private javax.swing.JButton btnAddEmployee;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnregisterDoctor;
    private javax.swing.JComboBox comboOrganizationList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
