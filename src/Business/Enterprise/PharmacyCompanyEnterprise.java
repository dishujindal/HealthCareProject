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
public class PharmacyCompanyEnterprise extends Enterprise{
    
    private ArrayList<Drug>drugList;
    private ArrayList<PharmacyEnterprise> pharmacyList;
    
     public PharmacyCompanyEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.PharmaceuticalCompanies);
        drugList=new ArrayList<>();
        pharmacyList=new ArrayList<>();
    }

    public ArrayList<Drug> getDrugList() {
        return drugList;
    }

    public ArrayList<PharmacyEnterprise> getPharmacyList() {
        return pharmacyList;
    }

     
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
