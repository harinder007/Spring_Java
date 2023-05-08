package com.harinder.springboot.user.project.UserProjectBatch4119;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.harinder.springboot.user.project.UserProjectBatch4119.model.Student;
import com.harinder.springboot.user.project.UserProjectBatch4119.repository.StudentRepository;

@SpringBootApplication

public class UserProjectBatch4119Application implements CommandLineRunner{
	
 @Autowired
 StudentRepository sr;
	public static void main(String[] args) {
		SpringApplication.run(UserProjectBatch4119Application.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		sr.save(new Student("Harinder","harinderyadav@gmail.com"));
		sr.save(new Student("Prince","princekumar@gmail.com"));
	}

}
