/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.WorkQueue;

import Business.Doctor.Doctor;
import Business.Enterprise.Enterprise;

/**
 *
 * @author rekhajindal
 */
public class EmergencyAssignWorkRequest extends WorkRequest{
    
    private long patientMRN;
    private String patientName;
    private Doctor doctor;
    private Enterprise senderEnterprise;

    public long getPatientMRN() {
        return patientMRN;
    }

    public void setPatientMRN(long patientMRN) {
        this.patientMRN = patientMRN;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Enterprise getSenderEnterprise() {
        return senderEnterprise;
    }

    public void setSenderEnterprise(Enterprise senderEnterprise) {
        this.senderEnterprise = senderEnterprise;
    }
    
    public String toString()
    {
        return super.getMessage();
    }
    
}
