package com.shaunthomas999.products.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Data
@Entity
@Table(name="PRODUCTS")
@AllArgsConstructor
@NoArgsConstructor
public class Product {

  @Id
  private Long id;

  @NotNull
  private String name;

  private String category;

  @NotNull
  private Double price;

  private Integer count;
}
