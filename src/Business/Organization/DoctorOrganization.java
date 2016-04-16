/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Organization;

import Business.Organization.Organization.Type;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author rekhajindal
 */
public class DoctorOrganization extends Organization{
    
    public DoctorOrganization()
    {
        super(Type.Doctor.getValue());
    }
    
    @Override
     public ArrayList<Role> getSupportedRole()
    {
        return null;
//        ArrayList<Role> roles=new ArrayList<Role>();
//        roles.add(new DoctorRole());
//        return roles;
    }
}
