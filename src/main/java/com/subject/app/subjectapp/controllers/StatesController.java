package com.subject.app.subjectapp.controllers;

import com.subject.app.subjectapp.entities.State;
import com.subject.app.subjectapp.repositories.StatesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value="states")
public class StatesController {

    @Autowired
    private StatesRepository statesRepository;

    @GetMapping(value="")
    public List<State> list() {
        return this.statesRepository.findAll();
    }

    @GetMapping(value="/code")
    public Optional<State> findByCode(@RequestParam String code) {
        return this.statesRepository.findById(code);
    }
}
