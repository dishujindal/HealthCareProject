/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Encounter;

import java.util.ArrayList;

/**
 *
 * @author rekhajindal
 */
public class EncounterHistory {
    
    private ArrayList<Encounter> encouterList;
    
    public EncounterHistory()
    {
        encouterList=new ArrayList<>();
    }

    public ArrayList<Encounter> getEncouterList() {
        return encouterList;
    }

    public void setEncouterList(ArrayList<Encounter> encouterList) {
        this.encouterList = encouterList;
    }
    
    
}
