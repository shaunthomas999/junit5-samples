package com.shaunthomas999.products.endpoints;

import com.shaunthomas999.products.endpoints.exceptions.ResourceNotFoundException;
import com.shaunthomas999.products.model.Product;
import com.shaunthomas999.products.services.ProductsService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@AllArgsConstructor
@RestController
@RequestMapping("/products")
@Validated
public class ProductsEndpoint {

  private final ProductsService productsService;

  @GetMapping
  public ResponseEntity<Product> getProductsByName(@Valid
                                                   @Pattern(regexp = "^[a-zA-Z0-9\\s]*$")
                                                   @RequestParam
                                                   @NotBlank final String name) throws ResourceNotFoundException {
    return productsService.getProductsByName(name)
        .map(ResponseEntity::ok)
        .orElseThrow(() -> new ResourceNotFoundException(name + " not found"));
  }
}
