/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Organization;

import Business.PharmacyOrganization.PharmacyStore;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author rekhajindal
 */
public class PharmacyStoresOrganization extends Organization {

    private ArrayList<PharmacyStore>storeList;
    public PharmacyStoresOrganization()
    {
        super(Type.PharmacyStores.getValue());
        storeList=new ArrayList<>();
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public ArrayList<PharmacyStore> getStoreList() {
        return storeList;
    }
    
    
}
