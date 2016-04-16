/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Network;

import java.util.ArrayList;

/**
 *
 * @author rekhajindal
 */
public class NetworkState {
    private String stateName;
    private ArrayList<NetworkCity> networkCityList;
    

    public NetworkState() {
        networkCityList=new ArrayList<>();
    }

    public ArrayList<NetworkCity> getNetworkCityList() {
        return networkCityList;
    }

    public void setNetworkCityList(ArrayList<NetworkCity> networkStateList) {
        this.networkCityList = networkStateList;
    }

    public String getName() {
        return stateName;
    }

    public void setName(String name) {
        this.stateName = name;
    }
    
    @Override
    public String toString()
    {
        return stateName;
    }
    
    public NetworkCity createAddCity()
    {
        NetworkCity city= new NetworkCity();
        networkCityList.add(city);
        return city;
    }
}
