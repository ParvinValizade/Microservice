package com.company.microservice1product.dto;

import java.time.LocalDateTime;

public class ProductDto {
    private Long id;

    private String name;
    private Double price;
    private LocalDateTime createTime;

    public ProductDto(Long id, String name, Double price, LocalDateTime createTime) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.createTime = createTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }
}
