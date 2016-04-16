/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Network;

import Business.Enterprise.EnterpriseDirectory;
import java.util.ArrayList;

/**
 *
 * @author rekhajindal
 */
public class Network {
    private String name;
    private ArrayList<NetworkState> networkStateList;
    

    public Network() {
        networkStateList=new ArrayList<>();
    }

    public ArrayList<NetworkState> getNetworkStateList() {
        return networkStateList;
    }

    public void setNetworkStateList(ArrayList<NetworkState> networkStateList) {
        this.networkStateList = networkStateList;
    }

   
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
    
    public NetworkState createAddState()
    {
        NetworkState state= new NetworkState();
        networkStateList.add(state);
        return state;
    }
}
