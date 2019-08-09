package com.shaunthomas999.products.repository;

import com.shaunthomas999.products.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductsRepository extends JpaRepository<Product, String> {
  Optional<Product> findOneByNameIgnoreCaseContaining(String name);
}
