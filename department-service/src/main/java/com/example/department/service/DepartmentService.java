package com.example.department.service;

import com.example.department.entity.Department;

public interface DepartmentService {

	Department saveDepartment(Department department);

	Department findDepartmentById(Long departmentId);

}
