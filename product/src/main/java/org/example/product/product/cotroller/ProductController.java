package org.example.product.product.cotroller;

import org.example.product.product.cotroller.model.ProductDto;
import org.example.product.product.cotroller.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    private final ProductService productService;
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/save")
    public ResponseEntity productSave(@RequestBody ProductDto.Register dto) {
        productService.register(dto);
        return ResponseEntity.status(200).body("저장 성공");
    }

    @GetMapping("/read")
    public ResponseEntity productRead(Integer idx) {
        ProductDto.product result = productService.read(idx);
        return ResponseEntity.status(200).body(result);
    }

    @GetMapping("/list")
    public ResponseEntity productList() {
        List<ProductDto.product> list = productService.list();
        return ResponseEntity.status(200).body(list);
    }
}