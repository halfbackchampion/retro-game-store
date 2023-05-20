package com.springboot.retrostore.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Component;

import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.stream.Collectors;

import com.springboot.retrostore.models.Product;

@Component
public class DAO {
  @Autowired
  JdbcTemplate jdbcTemplate;

  public void createTable(){
    System.out.println("creating tables");

    /*
    jdbcTemplate.execute("DROP TABLE products IF EXISTS");
    jdbcTemplate.execute("CREATE TABLE products(" + 
      "id SERIAL PRIMARY KEY, price DOUBLE, quantity BIGINT)");


    KeyHolder keyholder = new GeneratedKeyHolder();

    Product newProduct = new Product(9.99, 180);

    jdbcTemplate.update(connection -> {
      PreparedStatement ps = connection
        .prepareStatement("INSERT into products (price, quantity) values (?, ?)", Statement.RETURN_GENERATED_KEYS);
        ps.setDouble(1, newProduct.getPrice());
        ps.setLong(2, newProduct.getQuantity());
        return ps;
    }, keyholder);

    System.out.println(keyholder.getKey());
    */
  }

}
