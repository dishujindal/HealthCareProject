/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Patient;

import Business.Doctor.Doctor;
import Business.Enterprise.Enterprise;
import Business.Person.Person;

/**
 *
 * @author rekhajindal
 */
public class Patient extends Person {
    
    private String insuranceCompany;
    private String healthAllergy;
    private String insuranceNumber;
    private Doctor preffredDoctor;
    private Doctor temporaryDoctor;
    private String dateOfVisit;
    private long patientMRN;
    private String maritialStatus;
    private Boolean assign=false;
    private Enterprise prefferedDoctorEnterprise, secondaryDoctorEnterprise;
    private static long count=1000;
    
    public Patient()
    {
        patientMRN=count;
        count++;
    }
    
    public String getInsuranceCompany() {
        return insuranceCompany;
    }

    public void setInsuranceCompany(String insuranceCompany) {
        this.insuranceCompany = insuranceCompany;
    }

    public String getHealthAllergy() {
        return healthAllergy;
    }

    public void setHealthAllergy(String healthAllergy) {
        this.healthAllergy = healthAllergy;
    }

    public String getInsuranceNumber() {
        return insuranceNumber;
    }

    public void setInsuranceNumber(String insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
    }

    public Doctor getPreffredDoctor() {
        return preffredDoctor;
    }

    public void setPreffredDoctor(Doctor preffredDoctor) {
        this.preffredDoctor = preffredDoctor;
    }

    public String getDateOfVisit() {
        return dateOfVisit;
    }

    public void setDateOfVisit(String dateOfVisit) {
        this.dateOfVisit = dateOfVisit;
    }

    public long getPatientMRN() {
        return patientMRN;
    }

    public void setPatientMRN(long patientMRN) {
        this.patientMRN = patientMRN;
    }

    public String getMaritialStatus() {
        return maritialStatus;
    }

    public void setMaritialStatus(String maritialStatus) {
        this.maritialStatus = maritialStatus;
    }

    public Boolean isAssign() {
        return assign;
    }

    public void setAssign(Boolean assign) {
        this.assign = assign;
    }

    public Doctor getTemporaryDoctor() {
        return temporaryDoctor;
    }

    public void setTemporaryDoctor(Doctor temporaryDoctor) {
        this.temporaryDoctor = temporaryDoctor;
    }

    public Enterprise getPrefferedDoctorEnterprise() {
        return prefferedDoctorEnterprise;
    }

    public void setPrefferedDoctorEnterprise(Enterprise prefferedDoctorEnterprise) {
        this.prefferedDoctorEnterprise = prefferedDoctorEnterprise;
    }

    public Enterprise getSecondaryDoctorEnterprise() {
        return secondaryDoctorEnterprise;
    }

    public void setSecondaryDoctorEnterprise(Enterprise secondaryDoctorEnterprise) {
        this.secondaryDoctorEnterprise = secondaryDoctorEnterprise;
    }
    
    
    public String toString()
    {
        return (super.getSsnNumber());
    }
    
}
