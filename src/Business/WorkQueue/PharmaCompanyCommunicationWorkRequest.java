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
public class PharmaCompanyCommunicationWorkRequest extends WorkRequest{
    
    
    private String senderEnterprise;

    public String getSenderEnterprise() {
        return senderEnterprise;
    }

    public void setSenderEnterprise(String senderEnterprise) {
        this.senderEnterprise = senderEnterprise;
    }
    
    public String toString()
    {
        return super.getMessage();
    }
}
