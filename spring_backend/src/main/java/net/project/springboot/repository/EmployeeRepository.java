package net.project.springboot.repository;

import net.project.springboot.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // all crud database methods
}