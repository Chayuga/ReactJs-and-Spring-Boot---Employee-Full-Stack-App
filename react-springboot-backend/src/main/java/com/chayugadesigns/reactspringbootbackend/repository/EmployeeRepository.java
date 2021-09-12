package com.chayugadesigns.reactspringbootbackend.repository;

import com.chayugadesigns.reactspringbootbackend.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
