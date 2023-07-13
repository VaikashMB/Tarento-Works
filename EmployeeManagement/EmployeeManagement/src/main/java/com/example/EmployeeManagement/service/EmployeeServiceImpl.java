package com.example.EmployeeManagement.service;

import com.example.EmployeeManagement.dao.EmployeeDao;
import com.example.EmployeeManagement.dto.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    private EmployeeDao employeeDao;
    @Override
    public Employee addEmployee(Employee employee) {
        return employeeDao.save(employee);
    }
    @Override
    public Optional<Employee> getEmployee(int empId) {return employeeDao.findById(empId);}
    @Override
    public String deleteEmployee(Employee deletedUser){
        employeeDao.delete(deletedUser);
        return "Deleted";
    }
    public String updateEmployee(Employee updateemployee){
        employeeDao.save(updateemployee);
        return "Employee Updated";
    }
}
