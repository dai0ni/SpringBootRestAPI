package com.example.sbrestapi;

import com.example.sbrestapi.entity.Regions;
import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MappedTypes(Regions.class)
@MapperScan("com.example.sbrestapi.mapping")
@SpringBootApplication
public class SBRestApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SBRestApiApplication.class, args);
    }

}
