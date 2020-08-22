package com.example.spring.demo.config;

import com.example.spring.demo.models.services.Index2Services;
import com.example.spring.demo.models.services.IndexInterface;
import com.example.spring.demo.models.services.IndexService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {

    @Bean("mySimpleService")
    @Primary
    public IndexInterface registerSimpleService(){
        return new IndexService();
    }

    @Bean("myComplexService")
    public IndexInterface registerComplexService(){
        return new Index2Services();
    }


}
