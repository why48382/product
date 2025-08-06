package org.example.product.cotroller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {
    private final ProductService productservice;

    @PostMapping("/save")
    public ResponseEntity productSave(@RequestBody ProductDto.save dto) {
        productservice.save(dto);
        return ResponseEntity.status(200).body("저장 성공");
    }
}
