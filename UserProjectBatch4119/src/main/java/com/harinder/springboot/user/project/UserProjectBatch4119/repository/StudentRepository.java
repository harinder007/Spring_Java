package com.harinder.springboot.user.project.UserProjectBatch4119.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.harinder.springboot.user.project.UserProjectBatch4119.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
	

}
