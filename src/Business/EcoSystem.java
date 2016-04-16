/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business;

import Business.DB4OUtil.DB4OUtil;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Network.NetworkCity;
import Business.Network.NetworkState;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author rekhajindal
 */
public class EcoSystem extends Organization{
    
    private static EcoSystem system;
    private static EcoSystem system1;
    private ArrayList<Network> networkList;
    private Administrative administrative;
    private WorldDrugAdministrativeAuthority wdAA;

    public static EcoSystem getInstance() {
        if (system == null) {
            system = new EcoSystem();
        }
        return system;
    }

    private EcoSystem() {
        super(null);
        networkList = new ArrayList<>();
        administrative = new Administrative(null);
        wdAA=new WorldDrugAdministrativeAuthority(null);
    }

    public static void getReplicateSystem(EcoSystem system)
    {
        system1=system;
    }
    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public Network createAndAddNetwork() {
        Network network = new Network();
        networkList.add(network);
        return network;
    }

    public Administrative getAdministrative() {
        return administrative;
    }

    public void setAdministrative(Administrative administartive) {
        this.administrative = administartive;
    }

    public WorldDrugAdministrativeAuthority getWdAA() {
        return wdAA;
    }

    public void setWdAA(WorldDrugAdministrativeAuthority wdAA) {
        this.wdAA = wdAA;
    }
    
    
    public boolean matchState(String name)
    {
        Boolean result=true;
        for(Network network:networkList)
        {
            if(network.getName().equals(name))
            {
                result=false;
                break;
            }
                
            else
                result=true;
            
        }
        return result;
    }

    
    
public static boolean checkIfUsernameIsUnique(String username) {
        EcoSystem system = system1;
                //DB4OUtil.getInstance().retrieveSystem();

        

        if (system.getAdministrative() != null) 
        {
            
            for (UserAccount ua : system.getAdministrative().getUserAccountDirectory().getUserAccountList()) 
            {
                if (ua.getUsername().equals(username)) 
                {
                    JOptionPane.showMessageDialog(null, "Username already exists.");
                    return false;
                }
            }
        }
        if(system.getWdAA()!=null)
        {
            for (UserAccount ua : system.getWdAA().getUserAccountDirectory().getUserAccountList()) 
            {
                if (ua.getUsername().equals(username))
                {
                    JOptionPane.showMessageDialog(null, "Username already exists.");
                    return false;
                }
            }
        }

        

        
        
        for (Network network : system.networkList)
        {
            for (NetworkState state : network.getNetworkStateList()) 
            {
                for (NetworkCity city : state.getNetworkCityList()) 
                {
                    for (Enterprise enterprise : city.getEnterpriseDirectory().getEnterpriseList()) {
                        for (UserAccount account : enterprise.getUserAccountDirectory().getUserAccountList()) {
                            if (account.getUsername().equals(username)) {
                                JOptionPane.showMessageDialog(null, "Username already exists.");
                                return false;
                            }
                        }
                        for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()) {
                            for (UserAccount account : org.getUserAccountDirectory().getUserAccountList()) {
                                if (account.getUsername().equals(username)) {
                                    JOptionPane.showMessageDialog(null, "Username already exists.");
                                    return false;
                                }
                            }
                        }
                    }
                }
            }
        }
        
        return true;
    }


//    @Override
//    public ArrayList<Role> getSupportedRole() {
//        ArrayList<Role> roleList = new ArrayList<>();
//        roleList.add(new SystemAdminRole());
//        return roleList;
//    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
