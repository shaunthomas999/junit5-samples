package com.shaunthomas999.products.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name="PRODUCTS")
public class Product {

  @Id
  private Long id;
  private String name;
  private String category;
  private Double price;
  private Integer count;
}
