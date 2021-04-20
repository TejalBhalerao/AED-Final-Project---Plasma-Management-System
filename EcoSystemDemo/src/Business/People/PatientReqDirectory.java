/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.People;

import java.util.ArrayList;

/**
 *
 * @author TEJAL
 */
public class PatientReqDirectory {
    
    private ArrayList<PatientRequest> patientReqDirectory;

    public ArrayList<PatientRequest> getPatientReqDirectory() {return patientReqDirectory;}
    public void setPatientReqDirectory(ArrayList<PatientRequest> patientReqDirectory) {this.patientReqDirectory = patientReqDirectory;}
    
    public PatientReqDirectory(){
        patientReqDirectory = new ArrayList<PatientRequest>();
    }
    
    public PatientRequest addPatientRequest()
    {
        PatientRequest patientRequest = new PatientRequest();
        patientReqDirectory.add(patientRequest);
        return patientRequest;
    }
    
    public DonorRequest removePatientRequest(PatientRequest p)
    {
        //DonorRequest donorRequest = new DonorRequest();
        //this.donor = donor
        patientReqDirectory.remove(p);
        //return donorRequest;
        return null;
    }
}
