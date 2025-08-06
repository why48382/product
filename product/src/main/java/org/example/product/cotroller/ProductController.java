package org.example.product.cotroller;

import org.example.product.model.ProductDto;
import org.example.product.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {
    private final ProductService productservice;

    public ProductController(ProductService productservice) {
        this.productservice = productservice;
    }

    @PostMapping("/save")
    public ResponseEntity productSave(@RequestBody ProductDto.Register dto) {
        productservice.register(dto);
        return ResponseEntity.status(200).body("저장 성공");
    }
}
