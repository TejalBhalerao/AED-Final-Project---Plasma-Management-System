package Business;

import Business.Account.Account;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Role.SystemAdminRole;

/**
 *
 * @author patol
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        Employee employee = system.getEmployeeDirectory().createEmployee("RRH",null);
        
        Account ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
        
        return system;
    }
    
}
