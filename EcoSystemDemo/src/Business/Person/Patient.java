/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

/**
 *
 * @author patol
 */
public class Patient extends Person{
     boolean plasmaRequired;

    public boolean isPlasmaRequired() {
        return plasmaRequired;
    }

    public void setPlasmaRequired(boolean plasmaRequired) {
        this.plasmaRequired = plasmaRequired;
    }
    
    
     @Override
    public String toString() {
        return this.getName();
    }
    
     
    
}
