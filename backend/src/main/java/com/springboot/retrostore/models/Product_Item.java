package com.springboot.retrostore.models;

public class Product_Item {
  private long id;
  // FK of the Product table
  private long product_id;
  private long quantity;
  private double price;
  private String product_image;

  public Product_Item(long id, long product_id, long quantity, double price, String product_image) {
    this.id = id;
    this.product_id = product_id;
    this.quantity = quantity;
    this.price = price;
    this.product_image = product_image;
  }

  public Product_Item(long product_id, long quantity, double price, String product_image) {
    this.product_id = product_id;
    this.quantity = quantity;
    this.price = price;
    this.product_image = product_image;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getProduct_id() {
    return product_id;
  }

  public void setProduct_id(long product_id) {
    this.product_id = product_id;
  }

  public long getQuantity() {
    return quantity;
  }
  public void setQuantity(long quantity) {
    this.quantity = quantity;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public String getProduct_image() {
    return product_image;
  }

  public void setProduct_image(String product_image) {
    this.product_image = product_image;
  }
  
}
