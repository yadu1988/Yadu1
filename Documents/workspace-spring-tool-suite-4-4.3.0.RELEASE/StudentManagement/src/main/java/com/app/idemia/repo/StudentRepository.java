package com.app.idemia.repo;

import org.springframework.data.repository.CrudRepository;

import com.app.idemia.model.Student;

public interface StudentRepository extends CrudRepository<Student, String> {
 
	
}


