/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.AdministrativeRole;

import Business.Doctor.LabAssistant;
import Business.Doctor.Nurse;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.DrugManagementOrganization;
import Business.Organization.LabAssistantOrganization;
import Business.Organization.NurseOrganization;
import Business.Organization.Organization;
import Business.Organization.PharmaceuticalCompanyOrganization;
import Business.Person.Address;
import Business.Person.DrugAdmin;
import Business.Person.Person;
import Business.Role.LabAssistantRole;
import Business.Role.ManageDrugRole;
import Business.Role.NurseRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author rekhajindal
 */
public class AddEmployeeJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;
    private Enterprise enterprise;
    private Organization organization;
    /**
     * Creates new form AddEmployeeJPanel
     */
    public AddEmployeeJPanel(JPanel upc,Enterprise enterprise,Organization org) {
        initComponents();
        this.userProcessContainer=upc;
        this.enterprise=enterprise;
        this.organization=org;
        hideControls();
        datechooser.getDateEditor().setEnabled(false);
        populateEmailCombo();
    }

    public void hideControls()
    {
       
            if(organization instanceof NurseOrganization)
            {
                comboNurseType.setVisible(true);
                labelNurse.setVisible(true);
                populateNurseCombo();
            }
           else
            {
                comboNurseType.setVisible(false);
                labelNurse.setVisible(false);
            }
        
    }
    
    public void populateNurseCombo()
    {
        comboNurseType.removeAllItems();
        comboNurseType.addItem("Non-Degree");
        comboNurseType.addItem("Degree");
        comboNurseType.addItem("Advanced Degree");
    }
    
    public void populateEmailCombo()
    {
        comboEmailname.removeAllItems();
        comboEmailname.addItem("gmail.com");
        comboEmailname.addItem("yahoo.com");
        comboEmailname.addItem("yahoo.co.in");
        comboEmailname.addItem("hotmail.com");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel14 = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        txtSSnNumber = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        datechooser = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        radiobtnMale = new javax.swing.JRadioButton();
        radioBtnfemale = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        txtFirstname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtStreetAddress = new javax.swing.JTextField();
        txtState = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtEmailID = new javax.swing.JTextField();
        txtCountry = new javax.swing.JTextField();
        txtlastName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtPhnNumber = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        txtUserName = new javax.swing.JTextField();
        labelNurse = new javax.swing.JLabel();
        comboNurseType = new javax.swing.JComboBox();
        jLabel17 = new javax.swing.JLabel();
        txtLicenseID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        comboEmailname = new javax.swing.JComboBox();

        jLabel14.setText("City");

        jLabel7.setText("Last Name");

        jLabel6.setText("SSN Number");

        radiobtnMale.setText("Male");

        radioBtnfemale.setText("Female");

        jLabel12.setText("Gender");

        jLabel5.setText("Date of Birth");

        jLabel13.setText("Street Address");

        jLabel1.setText("First Name");

        jLabel9.setText("Email ID");

        jLabel16.setText("Country");

        jLabel8.setText("Phone Number");

        jLabel15.setText("State");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Employee Details");

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel4.setText("Password");

        jLabel10.setText("User Name");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("User Account Details");

        labelNurse.setText("Nurse Type");

        comboNurseType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel17.setText("License Number");

        jLabel2.setText("@");

        comboEmailname.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addGap(103, 103, 103)
                        .addComponent(btnSubmit)
                        .addGap(240, 240, 240))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel4))
                        .addGap(111, 111, 111)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelNurse)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel6))
                                        .addGap(28, 28, 28)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtSSnNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtlastName, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel14)
                                            .addComponent(jLabel12))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(radiobtnMale)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(radioBtnfemale))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtPhnNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                                                .addComponent(txtCity))
                                            .addComponent(comboNurseType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap())))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(198, 198, 198))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel5)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel17))))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtStreetAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtState, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                                    .addComponent(txtCountry)
                                    .addComponent(txtLicenseID)))
                            .addComponent(txtFirstname, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(datechooser, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtEmailID, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboEmailname, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel11)))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtFirstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(txtlastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(txtSSnNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(70, 70, 70)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel14)
                                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(radiobtnMale)
                                    .addComponent(radioBtnfemale)
                                    .addComponent(jLabel12)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(datechooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(txtEmailID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)
                                    .addComponent(txtPhnNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(comboEmailname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel13)
                                    .addComponent(txtStreetAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15))))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(txtCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboNurseType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelNurse))
                        .addGap(4, 4, 4)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtLicenseID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(jLabel11)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBack)
                            .addComponent(btnSubmit)))
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        try
        {
            Pattern pattern;
            pattern = Pattern.compile("[a-zA-Z ]+");  
            
        String gender=null;
        Address address= new Address();
        String dateFormat="EEE, MMM d,YYYY";
        SimpleDateFormat formatDate=new SimpleDateFormat(dateFormat);
        Date dateofBirth=datechooser.getDate();
        String firstName=txtFirstname.getText().trim();
        String lastName=txtlastName.getText().trim();
        String ssnNumber=txtSSnNumber.getText();
        long phoneNumber=Long.parseLong(txtPhnNumber.getText());
        String emaildID=txtEmailID.getText();
        String partEmailID=(String)comboEmailname.getSelectedItem();
        if(radiobtnMale.isSelected())
        {
            gender="male";
        }
        if(radioBtnfemale.isSelected())
        {
            gender="female";
        }
        String streetAddress=txtStreetAddress.getText();
        String city=txtCity.getText();
        String state=txtState.getText();
        String country=txtCountry.getText();
        String licenseID=txtLicenseID.getText();
        String userName=txtUserName.getText();
        String password=txtPassword.getText();
        
        String dateValidate =((JTextField)datechooser.getDateEditor().getUiComponent()).getText();
        
           if ((firstName.isEmpty())|| (lastName.isEmpty())|| (ssnNumber.isEmpty()) || (city.isEmpty()) ||
                (country.isEmpty()) || (userName.isEmpty()) || (password.isEmpty()) || (state.isEmpty()) ||
                (gender==null) || (dateValidate.isEmpty())||(emaildID.isEmpty())||(licenseID.isEmpty())
                ||(streetAddress.isEmpty())||(partEmailID.isEmpty()))
                {
                    JOptionPane.showMessageDialog(null,"Please do not keep any values empty.");
                    return;
                }
           
           Matcher finame = pattern.matcher(firstName);
         if(!finame.matches())
         {
             JOptionPane.showMessageDialog(null,"Only alphabhats are allowed");
             return;
         }
         
         Matcher lstname = pattern.matcher(lastName);
         if(!lstname.matches())
         {
             JOptionPane.showMessageDialog(null,"Only alphabhats are allowed");
             return;
         }
         
         Matcher matchState= pattern.matcher(state);
         if(!matchState.matches())
         {
             JOptionPane.showMessageDialog(null,"Only alphabhats are allowed");
             return;
         }
         
         Matcher matchCountry= pattern.matcher(country);
         if(!matchCountry.matches())
         {
             JOptionPane.showMessageDialog(null,"Only alphabhats are allowed");
             return;
         }
          String datebirth=formatDate.format(dateofBirth);

           Boolean result=EcoSystem.checkIfUsernameIsUnique(userName);
            if(result==false)return;
            Boolean result1=check(ssnNumber);
            if(result1==false)return;
            
        address.setCity(city);
        address.setCountry(country);
        address.setState(state);
        address.setStreetAdress(streetAddress);
        
        if(organization instanceof NurseOrganization)
        {
        Person person= new Nurse();
        person.setFirstName(firstName);
        person.setLastName(lastName);
        person.setEmailID(emaildID);
        person.setPartEmailID(partEmailID);
        person.setGender(gender);
        person.setPhoneNumber(phoneNumber);
        person.setSsnNumber(ssnNumber);
        person.setDateofBirth(datebirth);
        person.setPersonAddress(address);
        Nurse nurse=(Nurse)person;
        nurse.setLicenseNumber(licenseID);
        String nurseType=(String)comboNurseType.getSelectedItem();
        if(nurseType==null)
        {
            JOptionPane.showMessageDialog(null,"Please select nurse Type");
                    return;
        }
        UserAccount useraccount=organization.getUserAccountDirectory().createUserAccount(userName, password, person, new NurseRole());
        organization.getPerosnDirectory().getPersonList().add(person);
        }
        if(organization instanceof LabAssistantOrganization)
        {
        Person person= new LabAssistant();
        person.setFirstName(firstName);
        person.setLastName(lastName);
        person.setEmailID(emaildID);
        person.setPartEmailID(partEmailID);
        person.setGender(gender);
        person.setPhoneNumber(phoneNumber);
        person.setSsnNumber(ssnNumber);
        person.setDateofBirth(datebirth);
        person.setPersonAddress(address);
        LabAssistant assistant=(LabAssistant)person;
        assistant.setLicenseNumber(licenseID);
        UserAccount useraccount=organization.getUserAccountDirectory().createUserAccount(userName, password, person, new LabAssistantRole());
        organization.getPerosnDirectory().getPersonList().add(person);
        }
        if(organization instanceof DrugManagementOrganization)
        {
        Person person= new DrugAdmin();
        person.setFirstName(firstName);
        person.setLastName(lastName);
        person.setEmailID(emaildID);
        person.setPartEmailID(partEmailID);
        person.setGender(gender);
        person.setPhoneNumber(phoneNumber);
        person.setSsnNumber(ssnNumber);
        person.setDateofBirth(datebirth);
        person.setPersonAddress(address);
        UserAccount useraccount=organization.getUserAccountDirectory().createUserAccount(userName, password, person, new ManageDrugRole());
        organization.getPerosnDirectory().getPersonList().add(person);
        }
        }
        catch(NumberFormatException ex)
        {
            JOptionPane.showMessageDialog(null,"please enter proper values");
            return;
        }
        
//
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private Boolean check(String id){
        for(Person p:organization.getPerosnDirectory().getPersonList())
        {
            if(p.getSsnNumber().equals(id))
            {
                JOptionPane.showMessageDialog(null,"This perosn is already registered with" +id);
               return false;
            }
        }
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox comboEmailname;
    private javax.swing.JComboBox comboNurseType;
    private com.toedter.calendar.JDateChooser datechooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel labelNurse;
    private javax.swing.JRadioButton radioBtnfemale;
    private javax.swing.JRadioButton radiobtnMale;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtCountry;
    private javax.swing.JTextField txtEmailID;
    private javax.swing.JTextField txtFirstname;
    private javax.swing.JTextField txtLicenseID;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPhnNumber;
    private javax.swing.JTextField txtSSnNumber;
    private javax.swing.JTextField txtState;
    private javax.swing.JTextField txtStreetAddress;
    private javax.swing.JTextField txtUserName;
    private javax.swing.JTextField txtlastName;
    // End of variables declaration//GEN-END:variables
}
