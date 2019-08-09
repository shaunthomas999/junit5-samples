package com.shaunthomas999.products.services;

import com.shaunthomas999.products.repository.ProductsRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import com.shaunthomas999.products.model.Product;

import java.util.Optional;

@Slf4j
@AllArgsConstructor
@Service
public class ProductsService {

  private final ProductsRepository productsRepository;

  public Optional<Product> getProductsByName(final String name) {
    return productsRepository.findOneByNameIgnoreCaseContaining(name);
  }
}
