/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author rekhajindal
 */
public class OrganizationDirectory {
    
     private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Doctor.getValue())){
            organization =new DoctorOrganization();
            organizationList.add(organization);
        }
        if (type.getValue().equals(Type.Nurse.getValue())){
            organization = new NurseOrganization();
            organizationList.add(organization);
        }
         if (type.getValue().equals(Type.Patient.getValue())){
            organization = new PatientOrganization();
            organizationList.add(organization);
        }
         if (type.getValue().equals(Type.LabAssistant.getValue())){
            organization = new LabAssistantOrganization();
            organizationList.add(organization);
        }
         if (type.getValue().equals(Type.PharmacyStores.getValue())){
            organization = new PharmacyStoresOrganization();
            organizationList.add(organization);
        }
         if (type.getValue().equals(Type.pharmaceuticalCompany.getValue())){
            organization = new PharmaceuticalCompanyOrganization();
            organizationList.add(organization);
        }
         if (type.getValue().equals(Type.DrugManagement.getValue())){
            organization = new DrugManagementOrganization();
            organizationList.add(organization);
         }
        return organization;
    }
}


