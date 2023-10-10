package com.kuang.pojo;

import com.sun.istack.internal.NotNull;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;


@Component
@Validated
public class Person {

    @Value("${person.name}")
    private String name;

    public Person(){}

    public Person(String name) {
        this.name = name;
    }

    public String getEm() {
        return name;
    }

    public void setEm(String em) {
        this.name = em;
    }

}
