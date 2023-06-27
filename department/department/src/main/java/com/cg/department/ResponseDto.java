package com.cg.department;

public class ResponseDto {

    private DepartmentDto department;
    private EmployeeDto employee;

    public ResponseDto() {
    }

    public ResponseDto(DepartmentDto department, EmployeeDto employee) {
        this.department = department;
        this.employee = employee;
    }

    public DepartmentDto getDepartment() {
        return department;
    }

    public void setDepartment(DepartmentDto department) {
        this.department = department;
    }

    public EmployeeDto getEmployee() {
        return employee;
    }

    public void setEmployee(EmployeeDto employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "ResponseDto{" +
                "department=" + department +
                ", employee=" + employee +
                '}';
    }
}
