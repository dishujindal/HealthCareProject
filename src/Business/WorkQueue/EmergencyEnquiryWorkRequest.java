/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.WorkQueue;

import Business.Doctor.Doctor;
import Business.Encounter.Encounter;
import Business.Enterprise.Enterprise;
import java.util.ArrayList;

/**
 *
 * @author rekhajindal
 */
public class EmergencyEnquiryWorkRequest extends WorkRequest{
    private long patientMRN;
    private ArrayList<Encounter>encounterList;
    private Enterprise senderEnterprise;
    private Doctor  doctor;

    public EmergencyEnquiryWorkRequest()
    {
        encounterList=new ArrayList<>();
    }
    public long getPatientMRN() {
        return patientMRN;
    }

    public void setPatientMRN(long patientMRN) {
        this.patientMRN = patientMRN;
    }

    public ArrayList<Encounter> getEncounterList() {
        return encounterList;
    }

    public void setEncounterList(ArrayList<Encounter> encounterList) {
        this.encounterList = encounterList;
    }

    public Enterprise getSenderEnterprise() {
        return senderEnterprise;
    }

    public void setSenderEnterprise(Enterprise senderEnterprise) {
        this.senderEnterprise = senderEnterprise;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
    
     public String toString()
    {
        return super.getMessage();
    }
    
}
