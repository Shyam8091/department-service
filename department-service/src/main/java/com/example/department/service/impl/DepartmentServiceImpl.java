package com.example.department.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.department.entity.Department;
import com.example.department.service.DepartmentService;
import com.example.department.service.dao.DepartmentDao;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentDao departmentDao;

	@Override
	public Department saveDepartment(Department department) {

		return departmentDao.save(department);
	}

	@Override
	public Department findDepartmentById(Long departmentId) {
		
		return departmentDao.findByDepartmentId(departmentId);
	}
}
