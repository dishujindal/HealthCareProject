/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Doctor;

import Business.Enterprise.Enterprise;
import static Business.Organization.Organization.Type.Patient;
import Business.Patient.Patient;
import Business.Person.Person;
import java.util.ArrayList;

/**
 *
 * @author rekhajindal
 */
public class Doctor extends Person {
    
    private String LicenseID;
    private String specialization;
    private ArrayList<Patient>patientList;
    private ArrayList<Enterprise>enterpriseList;
    private ArrayList<DoctorRatings>ratingList;
    public Doctor()
    {
        patientList=new ArrayList<>();
        enterpriseList=new ArrayList<>();
        ratingList=new ArrayList<>();
    }

    public String getLicenseID() {
        return LicenseID;
    }

    public void setLicenseID(String LicenseID) {
        this.LicenseID = LicenseID;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public ArrayList<Patient> getPatientList() {
        return patientList;
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public ArrayList<DoctorRatings> getRatingList() {
        return ratingList;
    }
    
    
    public String toString()
    {
        return (super.getSsnNumber());
    }
}
