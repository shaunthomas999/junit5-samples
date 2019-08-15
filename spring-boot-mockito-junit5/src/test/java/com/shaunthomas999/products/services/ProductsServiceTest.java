package com.shaunthomas999.products.services;

import com.shaunthomas999.products.model.Product;
import com.shaunthomas999.products.repository.ProductsRepository;
import lombok.val;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ProductsServiceTest {

  @Test
  @DisplayName("Should return Product if product name is matched")
  void getProductsByName(@Mock ProductsRepository productsRepository) {

    val product = new Product(1L,"iPhone XS Max", "Mobile Phone", 1099.99, 5);

    when(productsRepository.findOneByNameIgnoreCaseContaining(eq("iphone"))).thenReturn(Optional.of(product));

    val productsService = new ProductsService(productsRepository);

    Optional<Product> result = productsService.getProductsByName("iphone");

    assertThat(result).isNotEmpty();
  }
}
