package com.springboot.retrostore;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.springboot.retrostore.dao.DAO;

@SpringBootApplication
public class RetrostoreApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(RetrostoreApplication.class, args);

		DAO dao = applicationContext.getBean(DAO.class);
		dao.createTable();
	}

}
