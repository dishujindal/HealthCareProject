/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Patient.Patient;
import Business.Person.Person;
import Business.UserAccount.UserAccount;
import UserInterface.PatientRole.PatientWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author rekhajindal
 */
public class PatientRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system) {
        Person person=account.getPerson();
        Patient patient=(Patient)person;
        return new PatientWorkAreaJPanel(userProcessContainer,system,patient);
            //To change body of generated methods, choose Tools | Templates.
    }
    
}
