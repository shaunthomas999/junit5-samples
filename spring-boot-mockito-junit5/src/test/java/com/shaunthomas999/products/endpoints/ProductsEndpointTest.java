package com.shaunthomas999.products.endpoints;

import com.shaunthomas999.products.services.ProductsService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(ProductsEndpoint.class)
class ProductsEndpointTest {

  @Autowired
  private MockMvc mockMvc;

  @MockBean
  private ProductsService productsService;

  @ParameterizedTest
  @DisplayName("Test /products GET method with different invalid inputs")
  @ValueSource(strings = {"", "$haun", "#67"})
  void testProductsGetEndpoint01(String input) throws Exception {
    mockMvc.perform(get("/products?name=" + input))
        .andExpect(status().isBadRequest());
  }

  @ParameterizedTest
  @DisplayName("Test /products GET method with different valid inputs")
  @ValueSource(strings = {"onePlus", "OnePlus", "one Plus", "one Plus 7", " one Plus 7", "one Plus 7 "})
  void testProductsGetEndpoint02(String input) throws Exception {
    mockMvc.perform(get("/products?name=" + input))
        .andExpect(status().isNotFound());
  }
}
