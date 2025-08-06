package org.example.product.service;


import org.example.product.model.ProductDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void register(ProductDto.Register dto) {
        productRepository.save(dto.toEntity());
    }

    public List<ProductDto.product> list() {
        List<ProductEntity> result = productRepository.findAll();

        return result.stream().map(ProductDto.product::from).toList();
    }

    public ProductDto.product read(Integer idx) {
        Optional<ProductEntity> result = productRepository.findById(idx);

        if (result.isPresent()) {
            ProductEntity entity = result.get();

            return ProductDto.product.from(entity);
        }

        return null;
    }

    public List<ProductDto.product> search(String name) {
        List<ProductEntity> result = productRepository.findByName(name);

        return result.stream().map(ProductDto.product::from).toList();
    }
}
