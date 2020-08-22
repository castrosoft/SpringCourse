package com.example.spring.demo.models.services;

import org.springframework.stereotype.Component;

@Component("mySimpleService")
public class IndexService implements IndexInterface{

    @Override
    public String operation(){
        //Aca deberian estar mapeados las tablas de la DB, interaccion con DAO, Hibernate, JPA, comunicandose con la API Rest, etc, por ejemplo.

        return "Executing an important process!";
    }
}
