/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author patol
 */
public class PatientDirectory {
   
     private List<Patient> patientsList;
    
    public PatientDirectory(){
       this.patientsList = new ArrayList<Patient>();
    }

    public List<Patient> getPatientsList() {
        return patientsList;
    }

    public void setPatientsList(List<Patient> patientsList) {
        this.patientsList = patientsList;
    }
    
     public Patient addPatient(String name, int age, String sex, String bloodGroup, String contactNum, String address, String sign,
                String emailAdd){
        Patient newPatient = new Patient();
        newPatient.setName(name);
        newPatient.setAge(age);
        newPatient.setGender(sex);
        newPatient.setBloodGroup(bloodGroup);
        newPatient.setContactNum(contactNum);
        newPatient.setAddress(address);
        newPatient.setSign(sign);
        newPatient.setEmailAdd(emailAdd);
        patientsList.add(newPatient);
        return newPatient;
    }

     
     public void updatePlasmaRequired(Patient patient)
     {
         for(Patient p : patientsList)
         {
             if(p.getName().equals(patient.getName()))
             {
                 p.setPlasmaRequired(patient.isPlasmaRequired());
             }
         }
     }
    
}
