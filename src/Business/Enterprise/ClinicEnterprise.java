/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Enterprise;

import Business.Encounter.Encounter;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author rekhajindal
 */
public class ClinicEnterprise extends Enterprise{
   
    private ArrayList<Encounter>encounterList;
     public ClinicEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.Clinic);
        encounterList=new ArrayList<>();
    }

    public ArrayList<Encounter> getEncounterList() {
        return encounterList;
    }

     
     
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
