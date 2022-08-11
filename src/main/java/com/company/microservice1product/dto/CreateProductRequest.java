package com.company.microservice1product.dto;

import java.time.LocalDateTime;

public class CreateProductRequest {
    private String name;
    private Double price;

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }
}
