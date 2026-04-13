package com.atividadededac.multidatabase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableJpaRepositories(basePackages = "com.atividadededac.multidatabase.repository.postgres")
@EnableMongoRepositories(basePackages = "com.atividadededac.multidatabase.repository.mongo")
@EntityScan(basePackages = "com.atividadededac.multidatabase.model")
@SpringBootApplication
public class MultidatabaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(MultidatabaseApplication.class, args);
	}

}
