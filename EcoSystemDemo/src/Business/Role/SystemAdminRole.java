/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.ECOSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Account.Account;
import userInterface.AdminWorkSpace.OTAWorkArea;
import javax.swing.JPanel;

/**
 *
 * @author TEJAL 
*/
public class SystemAdminRole extends Role{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, Account account, Organization organization, Enterprise enterprise, ECOSystem system) {
        return new OTAWorkArea(userProcessContainer, system);
    }
    
}
