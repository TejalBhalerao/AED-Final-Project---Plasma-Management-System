/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Account.Account;
import Business.ECOSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import javax.swing.JPanel;
import userInterface.Committee.CommiteeWorkAreaJPanel;
import userInterface.plasmabank.ManagePlasmaJPanel;

/**
 *
 * @author patol
 */
public class PlasmaBankAdminRole extends Role{
      @Override
    public JPanel createWorkArea(JPanel rightPanel, Account account, Organization organization, Enterprise enterprise, ECOSystem business) {
        return new ManagePlasmaJPanel(rightPanel, account,organization,enterprise,business);
    }
}
