/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.SystemAdminWorkAreaJPanel;

import Business.EcoSystem;
import Business.Network.Network;
import Business.Network.NetworkCity;
import Business.Network.NetworkState;
import java.awt.CardLayout;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rekhajindal
 */
public class ManageCityJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;
    /**
     * Creates new form ManageCityJPanel
     */
    public ManageCityJPanel(JPanel upc, EcoSystem system) {
        initComponents();
        this.userProcessContainer=upc;
        this.system=system;
        populateCountryCombo();
        populateDisplayCountryCombo();
        
    }

    public void populateDisplayCountryCombo()
    {
        comboCountryDisplay.removeAllItems();
        for(Network network:system.getNetworkList())
        {
            comboCountryDisplay.addItem(network);
        }
    }
    
    public void populateStateDisplayCombo(Network network)
    {
        comboStateDisplay.removeAllItems();
        for(NetworkState state: network.getNetworkStateList())
        {
            comboStateDisplay.addItem(state);
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
        NetworkJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        ComboState = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        txtCityName = new javax.swing.JTextField();
        BtnSubmit = new javax.swing.JButton();
        Btnbck = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        ComboCountry = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        comboCountryDisplay = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        comboStateDisplay = new javax.swing.JComboBox();

        NetworkJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "City Name"
            }
        ));
        jScrollPane1.setViewportView(NetworkJTable);
        if (NetworkJTable.getColumnModel().getColumnCount() > 0) {
            NetworkJTable.getColumnModel().getColumn(0).setResizable(false);
        }

        jLabel1.setText("Select State");

        ComboState.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setText("City Name");

        txtCityName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCityNameActionPerformed(evt);
            }
        });

        BtnSubmit.setText("Submit");
        BtnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSubmitActionPerformed(evt);
            }
        });

        Btnbck.setText("<< Back");
        Btnbck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnbckActionPerformed(evt);
            }
        });

        jLabel3.setText("Select Country");

        ComboCountry.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ComboCountry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboCountryActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Add City");

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel5.setText("Select Country");

        comboCountryDisplay.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboCountryDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCountryDisplayActionPerformed(evt);
            }
        });

        jLabel6.setText("Select State");

        comboStateDisplay.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboStateDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboStateDisplayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(Btnbck))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ComboState, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCityName, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(136, 136, 136)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(comboCountryDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6)))
                        .addGap(34, 34, 34)
                        .addComponent(comboStateDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDelete)
                            .addComponent(BtnSubmit))))
                .addGap(147, 147, 147))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(comboCountryDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(comboStateDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDelete)
                .addGap(50, 50, 50)
                .addComponent(jLabel4)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCityName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(BtnSubmit)
                .addGap(23, 23, 23)
                .addComponent(Btnbck)
                .addGap(26, 26, 26))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BtnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSubmitActionPerformed
        // TODO add your handling code here:
        Network network=(Network)ComboCountry.getSelectedItem();
        if(ComboCountry.getItemCount()==0)
        {
            JOptionPane.showMessageDialog(null,"please add country");
            return;
        }
        NetworkState networkState=(NetworkState)ComboState.getSelectedItem();
        if(ComboState.getItemCount()==0)
        {
            JOptionPane.showMessageDialog(null,"please add state");
            return;
        }
        String cityName=txtCityName.getText().trim();
        if(cityName.isEmpty())
        {
            JOptionPane.showMessageDialog(null,"please enter city");
            return;
        }
        Pattern pattern;
        pattern = Pattern.compile("[a-zA-Z ]+");
        Matcher matchCity = pattern.matcher(cityName);
         if(!matchCity.matches())
         {
             JOptionPane.showMessageDialog(null,"Only alphabhats are allowed");
             return;
         }
        
        for(NetworkCity city:networkState.getNetworkCityList())
        {
            if(city.getCityName().equals(cityName))
            {
                JOptionPane.showMessageDialog(null, "This city is already present");
                return;
            }
        }
        NetworkCity networkCity=networkState.createAddCity();
        networkCity.setCityName(cityName);
        txtCityName.setText(null);
    }//GEN-LAST:event_BtnSubmitActionPerformed

    private void BtnbckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnbckActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_BtnbckActionPerformed

    private void ComboCountryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboCountryActionPerformed
        // TODO add your handling code here:
        Network network=(Network)ComboCountry.getSelectedItem();
        if(network != null)
        {
            populateStateCombo(network);
        }
    }//GEN-LAST:event_ComboCountryActionPerformed

    private void comboCountryDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCountryDisplayActionPerformed
        // TODO add your handling code here:
        
        Network country=(Network)comboCountryDisplay.getSelectedItem();
        if(country != null)
        {
            populateStateDisplayCombo(country);
        }
    }//GEN-LAST:event_comboCountryDisplayActionPerformed

    private void comboStateDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboStateDisplayActionPerformed
        // TODO add your handling code here:
        
        NetworkState state=(NetworkState)comboStateDisplay.getSelectedItem();
        if(state != null)
        {
            populateNetworkTable(state);
        }
      
    }//GEN-LAST:event_comboStateDisplayActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = NetworkJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "please select atleast one row");
            return;
        }
        NetworkState state=(NetworkState)ComboState.getSelectedItem();
        NetworkCity city = (NetworkCity) NetworkJTable.getValueAt(selectedRow, 0);
        state.getNetworkCityList().remove(city);
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtCityNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCityNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCityNameActionPerformed

    public void populateStateCombo(Network network)
    {
        ComboState.removeAllItems();
        
        for(NetworkState state:network.getNetworkStateList())
        {
            ComboState.addItem(state);
        }
    }
    
    public void populateNetworkTable(NetworkState state)
    {
        DefaultTableModel model=(DefaultTableModel)NetworkJTable.getModel();
        model.setRowCount(0);
        
        for(NetworkCity city:state.getNetworkCityList())
           {
                Object[]row=new Object[3];
                row[0]=city;
                model.addRow(row);
            }
            
        
    }

    public void populateCountryCombo()
    {
        ComboCountry.removeAllItems();
        for(Network network:system.getNetworkList())
        {
            ComboCountry.addItem(network);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnSubmit;
    private javax.swing.JButton Btnbck;
    private javax.swing.JComboBox ComboCountry;
    private javax.swing.JComboBox ComboState;
    private javax.swing.JTable NetworkJTable;
    private javax.swing.JButton btnDelete;
    private javax.swing.JComboBox comboCountryDisplay;
    private javax.swing.JComboBox comboStateDisplay;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCityName;
    // End of variables declaration//GEN-END:variables
}
