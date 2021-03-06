/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.AdministrativeRole;

import Business.Doctor.Doctor;
import Business.Enterprise.Enterprise;
import Business.Organization.DoctorOrganization;
import Business.Organization.Organization;
import Business.Person.Person;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rekhajindal
 */
public class RegisterDoctorJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private ArrayList<Person>personList;
    private Organization org;
    private Enterprise enterprise;
    /**
     * Creates new form RegisterDoctorJPanel
     */
    public RegisterDoctorJPanel(JPanel upc,ArrayList<Person>list,Organization org,Enterprise enterprise) {
        initComponents();
        this.userProcessContainer=upc;
        this.personList=list;
        this.org=org;
        this.enterprise=enterprise;
        populateDoctorsTable();
    }

    public void populateDoctorsTable()
    {
        DefaultTableModel model=(DefaultTableModel)DoctorsJtable.getModel();
        model.setRowCount(0);
        for(Person person:personList)
        {
            if(person instanceof Doctor)
            {
                Doctor doctor=(Doctor)person;
                Object[]row=new Object[4];
                row[0]=doctor;
                row[1]=doctor.getLicenseID();
                row[2]=doctor.getFirstName();
                row[3]=doctor.getSpecialization();
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

        btnregister = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        DoctorsJtable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        btnregister.setText("Register");
        btnregister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregisterActionPerformed(evt);
            }
        });

        DoctorsJtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "PersonID", "License Number", "Name", "Specialization"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(DoctorsJtable);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Doctor's Details");

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
                        .addGap(98, 98, 98)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(252, 252, 252)
                        .addComponent(btnregister))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btnBack)))
                .addGap(141, 141, 141))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(btnregister)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBack)
                .addContainerGap(23, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnregisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregisterActionPerformed
        // TODO add your handling code here:
        int selectedRow=DoctorsJtable.getSelectedRow();
        if(selectedRow < 0)
        {
            JOptionPane.showMessageDialog(null,"Please select atleast one row");
            return ;
        }
        Doctor doctor=(Doctor)DoctorsJtable.getValueAt(selectedRow, 0);
//        for(Organization org:enterprise.getOrganizationDirectory().getOrganizationList())
//        {
//            if(org instanceof DoctorOrganization)
//            {
//                for(person )
//            }
//        }
        for(Enterprise ent:doctor.getEnterpriseList())
        {
            if(ent==enterprise)
            {
                JOptionPane.showMessageDialog(null,"This doctor is already added");
                return;
            }
        }
        doctor.getEnterpriseList().add(enterprise);
        org.getPerosnDirectory().getPersonList().add(doctor);
        
    }//GEN-LAST:event_btnregisterActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable DoctorsJtable;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnregister;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
