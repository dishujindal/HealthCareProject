/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.PharmacyOrganization;

import Business.Person.Address;

/**
 *
 * @author rekhajindal
 */
public class PharmacyStore {
    private static int count=1;
    private String storeName;
    private Address address;
    private int storeId;
    
    public PharmacyStore()
    {
        storeId=count;
        count++;
    }

    public String getStoreName() {
        return storeName;
        
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    
    public String toString()
    {
        return (String.valueOf(storeId));
    }
    
}
