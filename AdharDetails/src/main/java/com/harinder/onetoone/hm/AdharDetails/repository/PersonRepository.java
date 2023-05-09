package com.harinder.onetoone.hm.AdharDetails.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.harinder.onetoone.hm.AdharDetails.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person,Long>{

}
