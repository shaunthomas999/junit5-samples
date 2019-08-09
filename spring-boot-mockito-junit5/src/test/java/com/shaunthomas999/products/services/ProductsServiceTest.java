package com.shaunthomas999.products.services;

import com.shaunthomas999.products.repository.ProductsRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class ProductsServiceTest {

  private final ProductsRepository productsRepository = Mockito.mock(ProductsRepository.class);
  private final ProductsService productsService = new ProductsService(productsRepository);

  @Test
  @DisplayName("Should return Product if product name is matched")
  void getProductsByName() {

  }
}
