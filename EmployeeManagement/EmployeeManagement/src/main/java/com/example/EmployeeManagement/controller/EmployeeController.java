package com.example.EmployeeManagement.controller;

import com.example.EmployeeManagement.dto.Employee;
import com.example.EmployeeManagement.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/addEmployee")
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeeService.addEmployee(employee);
    }
    @GetMapping("/getEmployee/{empId}")
    public Employee getEmployee(@PathVariable int empId){
        return employeeService.getEmployee(empId).get();
    }

    @DeleteMapping(value = "/delete/{empId}")
    public String deleteEmployee(@PathVariable int empId){
        Employee deletedUser = employeeService.getEmployee(empId).get();
        return employeeService.deleteEmployee(deletedUser);
    }
    @PutMapping("/updateEmployee/{empId}")
    public String updateEmployee(@PathVariable int empId,@RequestBody Employee employee){
        Employee updateemployee=employeeService.getEmployee(empId).get();
        updateemployee.setEmpName(employee.getEmpName());
        return employeeService.updateEmployee(updateemployee);
    }


}