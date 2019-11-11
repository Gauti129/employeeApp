package com.employee.rest.dao;

import java.util.Collections;
import java.util.Comparator;

import org.springframework.stereotype.Repository;

import com.employee.rest.model.Employee;
import com.employee.rest.model.Employees;

@Repository
public class EmployeeDAO 
{
    private static Employees list = new Employees();
    
    static 
    {
        list.getEmployeeList().add(new Employee(1, "Abhay", "Gupta", "Male","03/11/1987","Audit"));
        list.getEmployeeList().add(new Employee(2, "Rani", "Sharma", "Female","17/09/1987","Cash"));
        list.getEmployeeList().add(new Employee(3, "Raju", "Rastogi", "Male","03/10/1997","Sports"));
        list.getEmployeeList().add(new Employee(4, "Sachin", "Shukls", "Male","24/03/2001","Treasury"));
    }
    
    
    public Employees getAllEmployees() 
    {
        return list;
    }
    
    public void addEmployee(Employee employee) {
        list.getEmployeeList().add(employee);
    }
}
