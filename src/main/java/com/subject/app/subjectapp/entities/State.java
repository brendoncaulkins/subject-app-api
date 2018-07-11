package com.subject.app.subjectapp.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="states")
public class State {

    @Id
    @NotNull
    private String code;

    private String name;

    public State() {}

    public String getCode() {
        return code;
    }

    public State setCode(String code) {
        this.code = code;
        return this;
    }

    public String getName() {
        return name;
    }

    public State setName(String name) {
        this.name = name;
        return this;
    }
}
