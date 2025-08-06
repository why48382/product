package org.example.product.product.cotroller.Repository;

import org.example.product.product.cotroller.model.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<ProductEntity, Integer> {
    List<ProductEntity> findByName(String name);
    List<ProductEntity> findByDetail(String detail);
    List<ProductEntity> findByPrice(Integer price);

}
