/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Network.Network;
import Business.Organization.Organization;
import Business.Person.AwarenessEvent;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author TEJAL
 */
public class ECOSystem extends Organization{
    
    private static ECOSystem business;
    private ArrayList<Network> networkList;
    private ArrayList<AwarenessEvent> eventList;
    private WorkQueue workQueue;
    
    public static ECOSystem getInstance(){
        if(business==null){
            business=new ECOSystem();
        }
        return business;
    }

    public ArrayList<AwarenessEvent> getEventList() {
        return eventList;
    }

    
    public Network createAndAddNetwork(){
        Network network=new Network();
        networkList.add(network);
        return network;
    }
    
    public AwarenessEvent createEvent(){
    
        AwarenessEvent event = new AwarenessEvent();
        eventList.add(event);
        return event;
    } 
    
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    private ECOSystem(){
        super(null);
        networkList=new ArrayList<Network>();
        eventList = new ArrayList<AwarenessEvent>();
        this.workQueue = new WorkQueue();
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }
    
    public boolean checkIfUserIsUnique(String userName){
        return true;
    }
    
     public WorkQueue getWorkQueue() {
        return workQueue;
    }
     
     public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }
}
