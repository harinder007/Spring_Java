package com.harinder.bookmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.harinder.bookmanagement.model.BookManagement;

@Repository
public interface BookManagementRepository extends JpaRepository<BookManagement,Long>{

}