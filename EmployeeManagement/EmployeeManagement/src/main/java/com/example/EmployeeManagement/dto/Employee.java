package com.example.EmployeeManagement.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    @Id
    private int empId;
    private String empName;

    public Employee() {

    }

    public Employee(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }


}