package com.cg.department.service;

import com.cg.department.ResponseDto;
import com.cg.department.model.Department;

public interface DepartmentService {

    Department saveDepartment(Department department);

    ResponseDto getDepartment(Integer departmentId);
}
