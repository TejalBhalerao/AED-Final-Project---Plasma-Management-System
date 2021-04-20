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
public class PatientDirectory {
    
    private ArrayList<Patient> patientdirectory;

    public ArrayList<Patient> getPatientdirectory() {return patientdirectory;}
    public void setPatientdirectory(ArrayList<Patient> patientdirectory) {this.patientdirectory = patientdirectory;}
    
    public PatientDirectory(){
        patientdirectory = new ArrayList<Patient>();
        
    }

    public Patient addPatient()
    {
        Patient patient = new Patient();
        patientdirectory.add(patient);
        return patient;
        
    }
    
}
