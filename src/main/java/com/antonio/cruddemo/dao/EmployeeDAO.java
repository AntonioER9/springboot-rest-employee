package com.antonio.cruddemo.dao;

import java.util.List;

import com.antonio.cruddemo.entity.Employee;

public interface EmployeeDAO {

    List<Employee> findAll();

}
