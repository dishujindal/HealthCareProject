/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Role;

import Business.Doctor.Doctor;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Network.NetworkCity;
import Business.Network.NetworkState;
import Business.Organization.Organization;
import Business.Person.Person;
import Business.UserAccount.UserAccount;
import UserInterface.DoctorRole.DoctorWorkAreaJPanel;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author rekhajindal
 */
public class DoctorRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system) {
        Person person=account.getPerson();
        Doctor doctor=(Doctor)person;
        
        return new DoctorWorkAreaJPanel(userProcessContainer,enterprise,doctor,system);
//To change body of generated methods, choose Tools | Templates.
    }
    
}
