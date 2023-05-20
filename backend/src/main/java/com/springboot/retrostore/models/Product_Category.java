package com.springboot.retrostore.models;

public class Product_Category {
  private long id;
  private long parent_category_id;
  // Video Game, Hardware, Genre
  private String name;

  public Product_Category(long id, long parent_category_id, String name) {
    this.id = id;
    this.parent_category_id = parent_category_id;
    this.name = name;
  }

  public Product_Category(long parent_category_id, String name) {
    this.parent_category_id = parent_category_id;
    this.name = name;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getParent_category_id() {
    return parent_category_id;
  }

  public void setParent_category_id(long parent_category_id) {
    this.parent_category_id = parent_category_id;
  }

  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }

  
}
