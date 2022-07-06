package com.example.department.service.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.department.entity.Department;
@Repository
public interface DepartmentDao extends JpaRepository<Department, Long> {

	Department findByDepartmentId(Long departmentId);

}