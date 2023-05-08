package com.employee.springboot.user.project.employeeProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employee.springboot.user.project.employeeProject.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
