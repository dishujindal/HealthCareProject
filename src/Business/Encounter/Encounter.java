/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Encounter;

import Business.Doctor.Doctor;
import static Business.Organization.Organization.Type.Patient;
import Business.Patient.Patient;
import Business.PharmaceuticalCompany.Drug;
import Business.WorkQueue.EncounterLabWorkRequest;
import Business.WorkQueue.PharmacyWorkRequest;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author rekhajindal
 */
public class Encounter {
   
    private int encounterID;
    private Patient patient;
    private Doctor doctor;
    private Date date;
    private String  diagnosis;
    private VitalSign vitalSign;
    private EncounterLabWorkRequest labWorkRequest;
    private PharmacyWorkRequest phWorkRequest;
    private ArrayList<String>medicineList;
    private ArrayList<Drug> prescribedDrug;
  
    private static int count=500;
    
    public Encounter()
    {
        encounterID=count;
        count++;
        date= new Date();
        vitalSign=new VitalSign();
        medicineList=new ArrayList<>();
        prescribedDrug= new ArrayList<>();
    }

    public int getEncounterID() {
        return encounterID;
    }

    public void setEncounterID(int encounterID) {
        this.encounterID = encounterID;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public VitalSign getVitalSign() {
        return vitalSign;
    }

    public void setVitalSign(VitalSign vitalSign) {
        this.vitalSign = vitalSign;
    }

    public EncounterLabWorkRequest getLabWorkRequest() {
        return labWorkRequest;
    }

    public void setLabWorkRequest(EncounterLabWorkRequest workRequest) {
        this.labWorkRequest = workRequest;
    }

    public PharmacyWorkRequest getPhWorkRequest() {
        return phWorkRequest;
    }

    public void setPhWorkRequest(PharmacyWorkRequest phWorkRequest) {
        this.phWorkRequest = phWorkRequest;
    }

    public ArrayList<String> getMedicineList() {
        return medicineList;
    }

    public void setMedicineList(ArrayList<String> medicineList) {
        this.medicineList = medicineList;
    }

    public ArrayList<Drug> getPrescribedDrug() {
        return prescribedDrug;
    }
    
    
    public String toString()
    {
        return String.valueOf(encounterID);
    }
}
