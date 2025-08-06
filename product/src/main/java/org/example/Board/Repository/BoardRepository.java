package org.example.Board.Repository;

import org.example.product.Product.model.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BoardRepository extends JpaRepository<ProductEntity, Integer> {
    List<ProductEntity> findByName(String name);
    List<ProductEntity> findByDetail(String detail);
    List<ProductEntity> findByPrice(Integer price);

}
