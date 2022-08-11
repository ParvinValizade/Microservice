package com.company.microservice1product.dto.converter;

import com.company.microservice1product.dto.ProductDto;
import com.company.microservice1product.model.Product;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ProductDtoConverter {

    public ProductDto convert(Product from){
        return new ProductDto(
                from.getId(),
                from.getName(),
                from.getPrice(),
                from.getCreateTime()
        );
    }

    public List<ProductDto> convert(List<Product> fromList){
        return fromList.stream()
                .map(this::convert).collect(Collectors.toList());
    }
}
