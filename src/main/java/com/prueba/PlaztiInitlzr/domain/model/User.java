package com.prueba.PlaztiInitlzr.domain.model;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.Builder;

@AllArgsConstructor
@Getter
@Setter
@Builder

public class User {

    private String id;
    private String name;
    private String lastName;
    private Date birthDate;
    private int cellphone;
}
