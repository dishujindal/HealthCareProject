/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.WorkQueue;

import Business.Doctor.Doctor;
import Business.Enterprise.Enterprise;
import Business.Patient.Patient;

/**
 *
 * @author rekhajindal
 */
public class HospitalEnterpriseAdminWorkRequest extends WorkRequest {
    
    private Enterprise enterpriseSender;
    private Doctor doctor;
    private Patient patient;

    public Enterprise getEnterpriseSender() {
        return enterpriseSender;
    }

    public void setEnterpriseSender(Enterprise enterpriseSender) {
        this.enterpriseSender = enterpriseSender;
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
    
    public String toString()
    {
        return super.getMessage();
    }
    
}
