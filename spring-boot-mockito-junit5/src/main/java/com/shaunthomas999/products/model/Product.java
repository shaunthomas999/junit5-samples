package com.shaunthomas999.products.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Data
@Entity
@Table(name="PRODUCTS")
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
