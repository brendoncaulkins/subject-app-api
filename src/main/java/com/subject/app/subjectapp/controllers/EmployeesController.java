package com.subject.app.subjectapp.controllers;

import com.subject.app.subjectapp.entities.Employee;
import com.subject.app.subjectapp.repositories.EmployeesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("employees")
public class EmployeesController {

    @Autowired
    private EmployeesRepository employeesRepository;

    @GetMapping(value="", produces = "application/json")
    public Page<Employee> getAll(Pageable pageable) {
        return this.employeesRepository.findAll(pageable);
    }

    @PostMapping(value="", produces = "application/json")
    public Employee create(@RequestBody Employee employee) {
        return this.employeesRepository.save(employee);
    }

    @GetMapping(value = "/{id}", produces = "application/json")
    public Optional<Employee> getById(@PathVariable Long id) {
        return this.employeesRepository.findById(id);
    }

    @PutMapping(value = "/{id}", produces = "application/json")
    public Employee updateById(@PathVariable Long id, @RequestBody Employee employee) {
        if(this.employeesRepository.existsById(id) && id.equals(employee.getId())) {
            return this.employeesRepository.saveAndFlush(employee);
        } else {
            throw new Error("Employee not found");
        }
    }
}
