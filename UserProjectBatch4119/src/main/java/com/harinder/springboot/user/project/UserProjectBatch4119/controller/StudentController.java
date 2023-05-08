package com.harinder.springboot.user.project.UserProjectBatch4119.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.harinder.springboot.user.project.UserProjectBatch4119.model.Student;
import com.harinder.springboot.user.project.UserProjectBatch4119.repository.StudentRepository;

@RestController
@RequestMapping("/Student")
public class StudentController {
@Autowired
StudentRepository sr;
@RequestMapping("/Details")
public List<Student> getStudent(){
	return sr.findAll();
}

}
