package com.app.idemia.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.idemia.model.Student;
import com.app.idemia.repo.StudentRepository;

@RestController
public class StudentController {
	
	

	 @Autowired
	 private StudentRepository studentRepository;
	 
	@GetMapping(value = "/healthcheck", produces = "application/json; charset=utf-8")
	 public String getHealthCheck()
	 {
	  return "{ \"isWorking\" : true }";
	 }
	
	
	@GetMapping("/student")
	 public List<Student> getAllStudents()
	 {
	  Iterable<Student> result = studentRepository.findAll();
	  List<Student> employeesList = new ArrayList<Student>();
	  result.forEach(employeesList::add);
	  return employeesList;
	 }
	
	
	
	@GetMapping("/student/{id}")
	 public Optional<Student> getStudent(@PathVariable String id)
	 {
	  Optional<Student> stud = studentRepository.findById(id);
	  return stud;
	 }
	
	
	
	
	@PutMapping("/student/{id}")
	 public Optional<Student> updateEmployee(@RequestBody Student newStudent, @PathVariable String id)
	 {
	  Optional<Student> optionalStudent = studentRepository.findById(id);
	  if (optionalStudent.isPresent()) {
		  Student stud = optionalStudent.get();
		  stud.setSfirstName(newStudent.getSfirstName());
		  stud.setSlastName(newStudent.getSlastName());
		  stud.setScourse(newStudent.getScourse());
	   
	   studentRepository.save(stud);
	  }
	  return optionalStudent;
	 }
	
	
	
	
	@DeleteMapping(value = "/student/{id}", produces = "application/json; charset=utf-8")
	 public String deleteEmployee(@PathVariable String id) {
	  Boolean result = studentRepository.existsById(id);
	  studentRepository.deleteById(id);
	  return "{ \"success\" : "+ (result ? "true" : "false") +" }";
	 }
	
	
	
	 @PostMapping("/studentAdd")
	 public Student addEmployee(@RequestBody Student newStudent)
	 {
	  String id = String.valueOf(new Random().nextInt());
	  Student st = new Student(id, newStudent.getSfirstName(), newStudent.getSlastName(),newStudent.getScourse());
	  studentRepository.save(st);
	  return st;
	 } 
	 
	

}


