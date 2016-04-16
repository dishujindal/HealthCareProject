/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.WorkQueue;

import Business.Doctor.Doctor;
import Business.Enterprise.Enterprise;
import Business.Patient.Patient;
import Business.PharmaceuticalCompany.Drug;
import java.util.ArrayList;

/**
 *
 * @author rekhajindal
 */
public class PharmacyWorkRequest extends WorkRequest{
    
    private Doctor doctor;
    private Patient patient;
    private Enterprise enterprise;
    private String drugSender;
    private Drug sendDrug;
   // private ArrayList<Drug>drugList;

    public PharmacyWorkRequest()
    {
        //drugList=new ArrayList<>();
    }
    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    public String getDrugSender() {
        return drugSender;
    }

    public void setDrugSender(String drugSender) {
        this.drugSender = drugSender;
    }

    public Drug getSendDrug() {
        return sendDrug;
    }

    public void setSendDrug(Drug sendDrug) {
        this.sendDrug = sendDrug;
    }

    

    
    
    
    
    public String toString()
    {
        return super.getMessage();
    }
}
