/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Account.Account;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.DoctorOrganization;
import Business.Organization.Organization;
<<<<<<< HEAD
=======
import Business.UserAccount.UserAccount;
>>>>>>> 5f8eaeead469eab9fad6c663c9464f1f58d8b92e
import ui.DoctorWorkSpace.DoctorWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class DoctorRole extends Role{

    public JPanel createWorkArea(JPanel userProcessContainer, Account account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new DoctorWorkAreaJPanel(userProcessContainer, account, (DoctorOrganization)organization, enterprise);
    }
    
    
}
