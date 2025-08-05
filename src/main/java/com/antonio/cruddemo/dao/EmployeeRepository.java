package com.antonio.cruddemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.antonio.cruddemo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
