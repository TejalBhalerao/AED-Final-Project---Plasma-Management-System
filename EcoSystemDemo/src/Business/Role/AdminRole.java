/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Account.Account;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
<<<<<<< HEAD
=======
import Business.UserAccount.UserAccount;
import ui.AdministrativeWorkSpace.AdminWorkAreaJPanel;
>>>>>>> 5f8eaeead469eab9fad6c663c9464f1f58d8b92e
import javax.swing.JPanel;

/**
 *
 * @author TEJAL
 */
public class AdminRole extends Role{
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, Account account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new HospitalAdminWorkArea(userProcessContainer, enterprise);
    }
}
