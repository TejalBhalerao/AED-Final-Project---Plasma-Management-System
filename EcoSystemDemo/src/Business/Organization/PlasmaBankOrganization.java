/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.LabRole;
import Business.Role.PlasmaBankAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author patol
 */
public class PlasmaBankOrganization extends Organization{

    public PlasmaBankOrganization() {
        super(Organization.Type.PlasmaBankAdmin.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new PlasmaBankAdminRole());
        return roles;
    }
     
} 
