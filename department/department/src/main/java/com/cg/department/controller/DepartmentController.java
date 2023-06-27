package com.cg.department.controller;

import com.cg.department.ResponseDto;
import com.cg.department.model.Department;
import com.cg.department.repository.DepartmentRepository;
import com.cg.department.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("api/v1")
public class DepartmentController {

    private DepartmentService departmentService;
@Autowired
DepartmentRepository departmentRepository;

    @PostMapping
    public ResponseEntity<Department> saveDepartment(@RequestBody Department department){
        Department savedDepartment = departmentService.saveDepartment(department);
        return new ResponseEntity<>(savedDepartment, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<ResponseDto> getDepartment(@PathVariable("id") Integer departmentId){
        ResponseDto responseDto = departmentService.getDepartment(departmentId);
        return ResponseEntity.ok(responseDto);
    }
}
