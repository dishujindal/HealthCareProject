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
public class LabAssistant extends Person{
    
    private String licenseNumber;

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }
    
    public String toString()
    {
        return (super.getSsnNumber());
    }
}
