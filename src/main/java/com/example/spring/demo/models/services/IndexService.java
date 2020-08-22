package com.example.spring.demo.models.services;

import org.springframework.stereotype.Component;

@Component
public class IndexService {

    public String operation(){
        //Aca deberian estar mapeados las tablas de la DB, interaccion con DAO, Hibernate, JPA, comunicandose con la API Rest, etc, por ejemplo.

        return "Executing an important process";
    }
}
