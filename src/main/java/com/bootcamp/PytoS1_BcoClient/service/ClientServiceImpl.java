package com.bootcamp.PytoS1_BcoClient.service;

import com.bootcamp.PytoS1_BcoClient.dao.ClientRepository;
import com.bootcamp.PytoS1_BcoClient.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ClientServiceImpl implements ClientServiceInterface{

    @Autowired
    ClientRepository clientRepository;

    @Override
    public void addClient(Client client) {
        clientRepository.save(client).subscribe();
    }

    @Override
    public Mono<Client> findClientById(Integer id) {
        return clientRepository.findById(id);
    }

    @Override
    public Flux<Client> findAllClient() {
        return clientRepository.findAll();
    }

    @Override
    public Mono<Client> updateClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public Mono<Void> deleteClient(Integer id) {
        return clientRepository.deleteById(id);
    }
}
