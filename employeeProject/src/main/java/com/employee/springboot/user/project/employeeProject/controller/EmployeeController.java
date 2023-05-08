package com.employee.springboot.user.project.employeeProject.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.springboot.user.project.employeeProject.model.Employee;
import com.employee.springboot.user.project.employeeProject.repository.EmployeeRepository;

@RestController
@RequestMapping("/Employee")
public class EmployeeController {
	@Autowired
	EmployeeRepository sr;
	@RequestMapping("/Details")
	public List<Employee> getEmployee(){
		return sr.findAll();
}}
