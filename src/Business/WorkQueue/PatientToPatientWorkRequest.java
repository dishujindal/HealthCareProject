/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.WorkQueue;

import Business.Doctor.Doctor;

/**
 *
 * @author rekhajindal
 */
public class PatientToPatientWorkRequest extends WorkRequest {
    
    private String doctorName;

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }
    
    public String toString()
    {
        return super.getMessage();
    }
    
}
