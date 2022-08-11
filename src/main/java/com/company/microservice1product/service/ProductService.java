package com.company.microservice1product.service;

import com.company.microservice1product.dto.CreateProductRequest;
import com.company.microservice1product.dto.ProductDto;
import com.company.microservice1product.dto.converter.ProductDtoConverter;
import com.company.microservice1product.model.Product;
import com.company.microservice1product.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ProductService {

    private final ProductRepository repository;
    private final ProductDtoConverter converter;

    public ProductService(ProductRepository repository, ProductDtoConverter converter) {
        this.repository = repository;
        this.converter = converter;
    }

    public ProductDto createProduct(CreateProductRequest request){
        Product product = new Product(
                request.getName(),
                request.getPrice(),
                LocalDateTime.now()
        );

        return converter.convert(repository.save(product));
    }

    public void deleteProduct(Long id){
        repository.deleteById(id);
    }

    public List<ProductDto> getAllProducts(){
        return converter.convert(repository.findAll());
    }
}
