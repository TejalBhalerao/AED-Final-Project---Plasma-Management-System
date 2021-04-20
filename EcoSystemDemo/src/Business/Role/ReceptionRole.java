/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.DoctorOrganization;
import Business.Organization.Organization;
import Business.Organization.ReceptionOrganization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.DoctorRole.ViewPatientInfoJPanel;
import ui.ReceptionRole.ReceptionWorkAreaJPanel;

/**
 *
 * @author srikar
 */
public class ReceptionRole extends Role {
    
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new ReceptionWorkAreaJPanel(userProcessContainer, account, (ReceptionOrganization)organization, enterprise,business);
    }

    /*@Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {
    return new ReceptionWorkAreaJPanel(userProcessContainer, account, (ReceptionOrganization)organization, enterprise,business);
    }*/
    
    
}
