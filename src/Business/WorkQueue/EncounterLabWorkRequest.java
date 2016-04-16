/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.WorkQueue;

import Business.Enterprise.Enterprise;

/**
 *
 * @author rekhajindal
 */
public class EncounterLabWorkRequest extends WorkRequest{
    
    private long patientMRN;
    private String labTestResult;
    private Enterprise senderEnterprise;
    private String patientName;
    private String resolvePersonName;
   

    public long getPatientMRN() {
        return patientMRN;
    }

    public void setPatientMRN(long patientMRN) {
        this.patientMRN = patientMRN;
    }

    public String getLabTestResult() {
        return labTestResult;
    }

    public void setLabTestResult(String labTestResult) {
        this.labTestResult = labTestResult;
    }

    public Enterprise getSenderEnterprise() {
        return senderEnterprise;
    }

    public void setSenderEnterprise(Enterprise senderEnterprise) {
        this.senderEnterprise = senderEnterprise;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getResolvePersonName() {
        return resolvePersonName;
    }

    public void setResolvePersonName(String resolvePersonName) {
        this.resolvePersonName = resolvePersonName;
    }
    
    
    public String toString()
    {
        return super.getMessage();
    }
}
