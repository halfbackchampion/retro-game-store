package com.springboot.retrostore.models;

public class Product {
  private long id;
  private long category_id;
  private String name;
  private String product_image;
  
  public Product(long id, long category_id, String name, String product_image) {
    this.id = id;
    this.category_id = category_id;
    this.name = name;
    this.product_image = product_image;
  }

  public Product(long category_id, String name, String product_image) {
    this.category_id = category_id;
    this.name = name;
    this.product_image = product_image;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getCategory_id() {
    return category_id;
  }

  public void setCategory_id(long category_id) {
    this.category_id = category_id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getProduct_image() {
    return product_image;
  }

  public void setProduct_image(String product_image) {
    this.product_image = product_image;
  }
  
  
}