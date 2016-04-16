/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.PharmaceuticalCompanyRole.DrugAdminOrganizationWorkAreaJPanel;
import UserInterface.MainAdministrator.ManageDoctorsJPanel;
import javax.swing.JPanel;

/**
 *
 * @author rekhajindal
 */
public class ManageDrugRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system) {
        return new DrugAdminOrganizationWorkAreaJPanel(userProcessContainer,enterprise,system);
//To change body of generated methods, choose Tools | Templates.
    }
    
}
