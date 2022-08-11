package com.company.microservice1product;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
        info = @Info(
                title = "Product Rest API",
                description = "MicroService",
                version = "v1"
        )
)
public class Microservice1ProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(Microservice1ProductApplication.class, args);
    }

}
