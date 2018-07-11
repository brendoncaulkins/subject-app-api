package com.subject.app.subjectapp.repositories;

import com.subject.app.subjectapp.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.persistence.Table;

@RepositoryRestResource
@CrossOrigin
@Table(name="employees")
public interface EmployeesRepository extends JpaRepository<Employee, Long>{
}
