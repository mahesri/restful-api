package com.Payroll;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * EmployeeRepository
 */

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

    
}