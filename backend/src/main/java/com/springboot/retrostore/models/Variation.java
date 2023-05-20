package com.springboot.retrostore.models;

public class Variation {
  private long id;
  private long category_id;
  private String name;
  
  public Variation(long id, long category_id, String name) {
    this.id = id;
    this.category_id = category_id;
    this.name = name;
  }
  
  public Variation(long category_id, String name) {
    this.category_id = category_id;
    this.name = name;
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
  
}
