/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class EmployeeDirectory {
    
    private ArrayList<Employee> employeeDirectory;

    public EmployeeDirectory() {
        employeeDirectory = new ArrayList();
    }

    public ArrayList<Employee> getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public Employee createEmployee(String name){
        Employee employee = new Employee();
        employee.setName(name);
        employeeDirectory.add(employee);
        return employee;
    }
}