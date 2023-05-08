package com.employee.springboot.user.project.employeeProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.employee.springboot.user.project.employeeProject.model.*;

import com.employee.springboot.user.project.employeeProject.repository.EmployeeRepository;

@SpringBootApplication
public class EmployeeProjectApplication implements CommandLineRunner {
@Autowired
EmployeeRepository sr;
	public static void main(String[] args) {
		SpringApplication.run(EmployeeProjectApplication.class, args);
	}

 @Override
  public void run(String... args) throws Exception {
	// TODO Auto-generated method stub
	sr.save(new Employee("Harinder","harinderyadav@gmail.com"));
	sr.save(new Employee("Deepak","Deepakkumar@gmail.com"));
}
}