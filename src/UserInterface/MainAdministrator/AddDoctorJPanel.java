/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.MainAdministrator;

import Business.Administrative;
import Business.Doctor.Doctor;
import Business.EcoSystem;
import Business.Person.Address;
import Business.Person.Person;
import Business.Role.DoctorRole;
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
public class AddDoctorJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Administrative admin;
    /**
     * Creates new form AddDoctorJPanel
     */
    public AddDoctorJPanel(JPanel upc, Administrative admin) {
        initComponents();
        this.userProcessContainer=upc;
        this.admin=admin;
        datechooser.getDateEditor().setEnabled(false);
        populateEmailCombo();
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel4 = new javax.swing.JLabel();
        txtLicenseID = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtFirstname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        datechooser = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        txtSSnNumber = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtlastName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtPhnNumber = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtEmailID = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        radiobtnMale = new javax.swing.JRadioButton();
        radioBtnfemale = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        txtStreetAddress = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtState = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtCountry = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtSpecialization = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        comboEmailname = new javax.swing.JComboBox();

        jLabel4.setText("Password");

        jLabel3.setText("User Name");

        jLabel1.setText("First Name");

        jLabel2.setText("License ID");

        jLabel5.setText("Date of Birth");

        jLabel6.setText("SSN Number");

        jLabel7.setText("Last Name");

        jLabel8.setText("Phone Number");

        jLabel9.setText("Email ID");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Doctor's Details");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("User Account Details");

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

        jLabel12.setText("Gender");

        buttonGroup1.add(radiobtnMale);
        radiobtnMale.setText("Male");

        buttonGroup1.add(radioBtnfemale);
        radioBtnfemale.setText("Female");

        jLabel13.setText("Street Address");

        jLabel14.setText("City");

        jLabel15.setText("State");

        jLabel16.setText("Country");

        jLabel17.setText("Specialization");

        jLabel18.setText("@");

        comboEmailname.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(btnBack)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel10))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(59, 59, 59)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel13)
                                            .addComponent(jLabel15)
                                            .addComponent(jLabel17))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(datechooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtStreetAddress)
                                                .addComponent(txtState)
                                                .addComponent(txtSpecialization))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtEmailID, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel18)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(comboEmailname, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(36, 36, 36))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(57, 57, 57)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel1))
                                        .addGap(41, 41, 41)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtLicenseID, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtFirstname, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel16)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(205, 205, 205)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtSSnNumber)
                                    .addComponent(txtlastName)
                                    .addComponent(txtPhnNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(radiobtnMale)
                                        .addGap(18, 18, 18)
                                        .addComponent(radioBtnfemale))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtCountry, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                                        .addComponent(txtCity, javax.swing.GroupLayout.Alignment.LEADING))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(268, 268, 268)
                        .addComponent(btnSubmit)))
                .addGap(246, 246, 246))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtFirstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtlastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtLicenseID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtSSnNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(datechooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(txtPhnNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtEmailID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(radiobtnMale)
                    .addComponent(radioBtnfemale)
                    .addComponent(jLabel18)
                    .addComponent(comboEmailname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtStreetAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(txtCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtSpecialization, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(jLabel11)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(btnSubmit)
                .addGap(27, 27, 27)
                .addComponent(btnBack)
                .addGap(34, 34, 34))
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
        //String date=datechooser.getDateFormatString();
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
        String specialization=txtSpecialization.getText();
        String userName=txtUserName.getText();
        String password=txtPassword.getText();
        String ssnNumber=txtSSnNumber.getText();
        
        // not working.
        String dateValidate =((JTextField)datechooser.getDateEditor().getUiComponent()).getText();
        
        if ((firstName.isEmpty())|| (lastName.isEmpty())|| (ssnNumber.isEmpty()) || (city.isEmpty()) ||
                (country.isEmpty()) || (userName.isEmpty()) || (password.isEmpty()) || (state.isEmpty()) ||
                (gender==null) ||  (dateValidate.isEmpty())||(emaildID.isEmpty())||(specialization.isEmpty())||
                (licenseID.isEmpty()) || (streetAddress.isEmpty()) || (dateValidate==null)|| (partEmailID.isEmpty()))
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
         
         Matcher matchSpec= pattern.matcher(specialization);
         if(!matchSpec.matches())
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
        
        Person person= new Doctor();
        person.setFirstName(firstName);
        person.setLastName(lastName);
        person.setEmailID(emaildID);
        person.setPartEmailID(partEmailID);
        person.setGender(gender);
        person.setPhoneNumber(phoneNumber);
        person.setSsnNumber(ssnNumber);
        person.setDateofBirth(datebirth);
        person.setPersonAddress(address);
        Doctor doctor=(Doctor)person;
        doctor.setLicenseID(licenseID);
        doctor.setSpecialization(specialization);
        admin.getPerosnDirectory().getPersonList().add(person);
        UserAccount userAccount=admin.getUserAccountDirectory().createUserAccount(userName, password, person, new DoctorRole());
        }
        catch(NumberFormatException ex)
        {
            JOptionPane.showMessageDialog(null,"please enter proper phone details");
        }
        
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private Boolean check(String id){
        for(Person p : admin.getPerosnDirectory().getPersonList()){
            if(p instanceof Doctor){
                Doctor d = (Doctor)p;
                if(d.getSsnNumber().equals(id)){
                    JOptionPane.showMessageDialog(null, "Doctor with this ID already exists!");
                    return false;
                }
            }
        }
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSubmit;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox comboEmailname;
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
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
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
    private javax.swing.JTextField txtSpecialization;
    private javax.swing.JTextField txtState;
    private javax.swing.JTextField txtStreetAddress;
    private javax.swing.JTextField txtUserName;
    private javax.swing.JTextField txtlastName;
    // End of variables declaration//GEN-END:variables
}
