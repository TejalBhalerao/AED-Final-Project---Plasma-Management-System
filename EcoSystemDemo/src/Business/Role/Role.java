/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.ECOSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Account.Account;
import javax.swing.JPanel;

/**
 *
 * @author TEJAL 
*/
public abstract class Role {
    public enum RoleType{
        Admin("Admin"),
        Doctor("Doctor"),
        LabAssistant("Lab Assistant"),
        Government("Government Official");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            Account account, 
            Organization organization, 
            Enterprise enterprise, 
            ECOSystem business);

    @Override
    public String toString() {
        return this.getClass().getName().substring(14);
    }
    
    
}