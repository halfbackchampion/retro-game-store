package com.springboot.retrostore.models;

public class Variation_Option {
  private long id;
  private long variation_id;
  private String value;
  
  public Variation_Option(long id, long variation_id, String value) {
    this.id = id;
    this.variation_id = variation_id;
    this.value = value;
  }
  public Variation_Option(long variation_id, String value) {
    this.variation_id = variation_id;
    this.value = value;
  }

  public long getId() {
    return id;
  }
  
  public void setId(long id) {
    this.id = id;
  }

  public long getVariation_id() {
    return variation_id;
  }

  public void setVariation_id(long variation_id) {
    this.variation_id = variation_id;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }
  
}
