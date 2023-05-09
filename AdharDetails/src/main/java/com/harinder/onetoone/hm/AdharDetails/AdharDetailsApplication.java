package com.harinder.onetoone.hm.AdharDetails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.harinder.onetoone.hm.AdharDetails.model.*;
import com.harinder.onetoone.hm.AdharDetails.repository.PersonRepository;

@SpringBootApplication
public class AdharDetailsApplication implements CommandLineRunner{
	@Autowired
	PersonRepository pr;

	public static void main(String[] args) {
		SpringApplication.run(AdharDetailsApplication.class, args);
	}
@Override
public void run(String... args) throws Exception {
Person p1 = new Person("Harinder","Haryana");
Person p2 = new Person("Deepak","Haryana");
Adhaar a1 = new Adhaar(123454);
Adhaar a2 = new Adhaar(345678);
p1.setAddress(a1);
p2.setAddress(a2);
pr.save(p1);
pr.save(p2);
}
}

