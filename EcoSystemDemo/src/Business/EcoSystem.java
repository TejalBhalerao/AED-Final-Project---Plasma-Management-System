/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Network.Network;
import Business.Organization.Organization;
import Business.People.AwarenessEvent;
import Business.People.DonorDirectory;
<<<<<<< HEAD
import Business.People.PeopleDirectory;
=======
import Business.People.DonorReqDirectory;
import Business.People.PeopleDirectory;
import Business.People.PatientReqDirectory;
>>>>>>> 5f8eaeead469eab9fad6c663c9464f1f58d8b92e
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public class EcoSystem extends Organization{
    
    private static EcoSystem business;
<<<<<<< HEAD
=======
    private DonorDirectory donorDirectory;
    private DonorReqDirectory donorReqDirectory;
    private PeopleDirectory patientDirectory;
   

    public static EcoSystem getBusiness() {
        return business;
    }

    public static void setBusiness(EcoSystem business) {
        EcoSystem.business = business;
    }

    public DonorDirectory getDonorDirectory() {
        return donorDirectory;
    }

    public void setDonorDirectory(DonorDirectory donorDirectory) {
        this.donorDirectory = donorDirectory;
    }

    public PeopleDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(PeopleDirectory patientDirectory) {
        this.patientDirectory = patientDirectory;
    }

    public DonorReqDirectory getDonorReqDirectory() {
        return donorReqDirectory;
    }

    public void setDonorReqDirectory(DonorReqDirectory donorReqDirectory) {
        this.donorReqDirectory = donorReqDirectory;
    }

    public PatientReqDirectory getPatientRequestDirectory() {
        return patientRequestDirectory;
    }

    public void setPatientRequestDirectory(PatientReqDirectory patientRequestDirectory) {
        this.patientRequestDirectory = patientRequestDirectory;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }
    private PatientReqDirectory patientRequestDirectory;
    private  UserAccountDirectory userAccountDirectory;
    
>>>>>>> 5f8eaeead469eab9fad6c663c9464f1f58d8b92e
    private ArrayList<Network> networkList;
    private ArrayList<AwarenessEvent> eventList;
 
    
    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
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
    private EcoSystem(){
        super(null);
        networkList=new ArrayList<Network>();
        eventList = new ArrayList<AwarenessEvent>();
        
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
}
