package com.bootcamp.PytoS1_BcoClient.dao;

import com.bootcamp.PytoS1_BcoClient.model.Client;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends ReactiveMongoRepository<Client, Integer> {
}
