package com.springboot.retrostore.models;

import java.time.LocalDateTime;

public class Promotion {
  private long id;
  private String name;
  private double discount_rate;
  private LocalDateTime start_date;
  private LocalDateTime end_date;

  public Promotion(long id, String name, double discount_rate, LocalDateTime start_date, LocalDateTime end_date) {
    this.id = id;
    this.name = name;
    this.discount_rate = discount_rate;
    this.start_date = start_date;
    this.end_date = end_date;
  }

  public Promotion(String name, double discount_rate, LocalDateTime start_date, LocalDateTime end_date) {
    this.name = name;
    this.discount_rate = discount_rate;
    this.start_date = start_date;
    this.end_date = end_date;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getDiscount_rate() {
    return discount_rate;
  }

  public void setDiscount_rate(double discount_rate) {
    this.discount_rate = discount_rate;
  }

  public LocalDateTime getStart_date() {
    return start_date;
  }

  public void setStart_date(LocalDateTime start_date) {
    this.start_date = start_date;
  }

  public LocalDateTime getEnd_date() {
    return end_date;
  }

  public void setEnd_date(LocalDateTime end_date) {
    this.end_date = end_date;
  }
  
}
