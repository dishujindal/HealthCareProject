/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Enterprise;

import Business.PharmaceuticalCompany.Drug;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author rekhajindal
 */
public class PharmacyEnterprise extends Enterprise{
    private ArrayList<Drug>pharmacyDrugList;
    
     public PharmacyEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.Pharmacy);
        pharmacyDrugList=new ArrayList<>();
        
    }

    public ArrayList<Drug> getPharmacyDrugList() {
        return pharmacyDrugList;
    }

     
     
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
