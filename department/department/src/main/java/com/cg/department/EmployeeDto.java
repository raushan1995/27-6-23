package com.cg.department;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


public class EmployeeDto {

    private Integer employeeId;
    @Column(name = "name", nullable = true)
    private String name;
    @Column(name = "location", nullable = true)
    private String location;
    @Column(name = "email_address", nullable = true)
    private String emailId;

    public EmployeeDto(Integer employeeId, String name, String location, String emailId) {
        this.employeeId = employeeId;
        this.name = name;
        this.location = location;
        this.emailId = emailId;
    }

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }



    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", emailId='" + emailId + '\'' +
                '}';
    }
}
