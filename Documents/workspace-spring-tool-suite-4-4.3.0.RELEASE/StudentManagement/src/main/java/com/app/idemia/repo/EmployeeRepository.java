package com.app.idemia.repo;

import org.springframework.data.repository.CrudRepository;

import com.app.idemia.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, String> {
}