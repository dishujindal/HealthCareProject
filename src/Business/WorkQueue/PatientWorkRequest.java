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
public class PatientWorkRequest extends WorkRequest {
    
    private Patient patient;
    private Doctor doctor;
    private Enterprise enterprise;
    private String appointmentDetailMessage;

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

    public Enterprise getReceiverEnterprise() {
        return enterprise;
    }

    public void setReceiverEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    public String getAppointmentMessage() {
        return appointmentDetailMessage;
    }

    public void setAppointmentMessage(String appointmentMessage) {
        this.appointmentDetailMessage = appointmentMessage;
    }
    
    
    public String toString()
    {
        return super.getMessage();
    }
    
    
}
