/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author srikar
 */
public abstract class PlasmaBankEnterprise extends Enterprise{

    public PlasmaBankEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.PlasmaBank);
    }
     
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}

