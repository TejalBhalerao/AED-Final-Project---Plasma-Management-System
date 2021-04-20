/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.SysCoordinatorRole;
import java.util.ArrayList;

/**
 *
 * @author TEJAL
 */
public class SysCoordinatorOrganization extends Organization{
    
    public SysCoordinatorOrganization() {
        super(Organization.Type.SysCoordinator.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new SysCoordinatorRole());
        return roles;
    }

    
}
