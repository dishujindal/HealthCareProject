/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Doctor;

import Business.Person.Person;

/**
 *
 * @author rekhajindal
 */
public class Nurse extends Person{
    
    private String licenseNumber;
    private String nurseType;
    

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public String getNurseType() {
        return nurseType;
    }

    public void setNurseType(String nurseType) {
        this.nurseType = nurseType;
    }

   public String toString()
   {
       return (super.getSsnNumber());
   }
    
    
    
}
