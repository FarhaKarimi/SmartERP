package com.frhd.smarterp.repository;

import com.frhd.smarterp.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}