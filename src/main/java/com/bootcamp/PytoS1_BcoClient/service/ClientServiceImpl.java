package com.bootcamp.PytoS1_BcoClient.service;

import com.bootcamp.PytoS1_BcoClient.dao.ClientRepository;
import com.bootcamp.PytoS1_BcoClient.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl implements ClientServiceInterface{

    @Autowired
    ClientRepository clientRepository;

    @Override
    public void addClient(Client client) {
        clientRepository.save(client).subscribe();
    }
}
