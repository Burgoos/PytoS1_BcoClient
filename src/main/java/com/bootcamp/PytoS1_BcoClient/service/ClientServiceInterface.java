package com.bootcamp.PytoS1_BcoClient.service;

import com.bootcamp.PytoS1_BcoClient.model.Client;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ClientServiceInterface {

    void addClient(Client client);

    Mono<Client> findClientById(Integer id);

    Flux<Client> findAllClient();

    Mono<Client> updateClient(Client client);

    Mono<Void> deleteClient(Integer id);
}
