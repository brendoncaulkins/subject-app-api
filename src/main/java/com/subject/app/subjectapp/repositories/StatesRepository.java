package com.subject.app.subjectapp.repositories;

import com.subject.app.subjectapp.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.persistence.Table;

@RepositoryRestResource
@CrossOrigin
@Table(name="states")
public interface StatesRepository extends JpaRepository<State, String>{
}
