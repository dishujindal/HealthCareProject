/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.WorkQueue;

import Business.PharmaceuticalCompany.Drug;

/**
 *
 * @author rekhajindal
 */
public class FeedbackToPharmaCompanyWorkRequest extends WorkRequest{
    
    //private String patientName;
    private Drug drug;

//    public String getPatientName() {
//        return patientName;
//    }
//
//    public void setPatientName(String patientName) {
//        this.patientName = patientName;
//    }

    public Drug getDrug() {
        return drug;
    }

    public void setDrug(Drug drug) {
        this.drug = drug;
    }
   
    
    public String toString()
    {
        return super.getMessage();
    }
}
