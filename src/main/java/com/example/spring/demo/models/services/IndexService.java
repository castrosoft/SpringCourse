package com.example.spring.demo.models.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("mySimpleService")
@Primary
public class IndexService implements IndexInterface{

    @Override
    public String operation(){
        //Aca deberian estar mapeados las tablas de la DB, interaccion con DAO, Hibernate, JPA, comunicandose con la API Rest, etc, por ejemplo.

        return "Executing a simple process!";
    }
}
