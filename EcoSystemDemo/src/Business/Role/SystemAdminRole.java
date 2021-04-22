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
import javax.swing.JPanel;
import ui.AdministrativeWorkSpace.WorkArea;

/**
 *
 * @author TEJAL
 */
public class SystemAdminRole extends Role{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, Account account, Organization organization, Enterprise enterprise, EcoSystem system) {
        return new WorkArea(userProcessContainer, system);
    }
    
}
