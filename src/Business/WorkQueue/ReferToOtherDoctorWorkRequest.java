/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.WorkQueue;

import Business.Encounter.Encounter;
import Business.Enterprise.Enterprise;
import Business.Patient.Patient;
import java.util.ArrayList;

/**
 *
 * @author rekhajindal
 */
public class ReferToOtherDoctorWorkRequest extends WorkRequest{
    
    private Patient patient;
    private ArrayList<Encounter>encounterList;
    private Enterprise senderEnterprise;
    private Enterprise receiverEnterprise;

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
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

    public Enterprise getReceiverEnterprise() {
        return receiverEnterprise;
    }

    public void setReceiverEnterprise(Enterprise receiverEnterprise) {
        this.receiverEnterprise = receiverEnterprise;
    }
    
     public String toString()
    {
        return super.getMessage();
    }
}
