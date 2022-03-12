package com.bootcamp.PytoS1_BcoClient;

import com.mongodb.reactivestreams.client.MongoClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;

@SpringBootApplication
public class PytoS1BcoClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(PytoS1BcoClientApplication.class, args);
	}


}
