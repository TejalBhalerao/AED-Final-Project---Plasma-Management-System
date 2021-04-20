/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.PathologistRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author TEJAL
 */
public class PathologistOrganization extends Organization {
    
    public PathologistOrganization() {
        super(Organization.Type.Pathologist.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new PathologistRole());
        return roles;
    }
}
