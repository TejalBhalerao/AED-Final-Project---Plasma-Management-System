/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import Business.Enterprise.Enterprise;
import java.util.ArrayList;

/**
 *
 * @author patol
 */
public class EmployeeDirectory {
    private ArrayList<Employee> employeeList;

    public EmployeeDirectory() {
        employeeList = new ArrayList();
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }
    
    public Employee createEmployee(String name,Enterprise enterprise){
        Employee employee = new Employee();
        employee.setName(name);
        if(enterprise != null)
         employee.setRole(enterprise.getEnterpriseType().getValue());
        employeeList.add(employee);
        return employee;
    }
}
