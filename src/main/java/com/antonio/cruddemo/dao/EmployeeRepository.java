package com.antonio.cruddemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.antonio.cruddemo.entity.Employee;

// Uncomment the following line to customize the repository path
// If you want to change the default path from "employees" to "members", uncomment the line below
// @RepositoryRestResource(path = "members")
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
