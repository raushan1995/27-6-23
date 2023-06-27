package com.cg.department.service;

import com.cg.department.DepartmentDto;
import com.cg.department.EmployeeDto;
import com.cg.department.ResponseDto;
import com.cg.department.model.Department;
import com.cg.department.repository.DepartmentRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DepartmentServiceImpl implements DepartmentService{

    private DepartmentRepository departmentRepository;
    private RestTemplate restTemplate;

    @Override
    public Department saveDepartment(Department department){
        return departmentRepository.save(department);
    }

    @Override
    public ResponseDto getDepartment(Integer departmentId) {

        ResponseDto responseDto = new ResponseDto();
        Department department = departmentRepository.findById(departmentId).get();
        DepartmentDto departmentDto = mapToDepartment(department);

        ResponseEntity<EmployeeDto> responseEntity = restTemplate
                .getForEntity("http://localhost:8080/api/employee/" + department.getEmployeeId(),
                        EmployeeDto.class);

        EmployeeDto employeeDto = responseEntity.getBody();

        System.out.println(responseEntity.getStatusCode());

        responseDto.setDepartment(departmentDto);
        responseDto.setEmployee(employeeDto);

        return responseDto;
    }

    private DepartmentDto mapToDepartment(Department department){
        DepartmentDto departmentDto = new DepartmentDto();
        departmentDto.setDepartmentId(department.getDepartmentId());
        departmentDto.setDepartmentName(department.getDepartmentName());

        return departmentDto;
    }
}
