package com.bootcamp.PytoS1_BcoClient.controller;

import com.bootcamp.PytoS1_BcoClient.model.Client;
import com.bootcamp.PytoS1_BcoClient.service.ClientServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private ClientServiceImpl clientServiceImpl;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addClient(@RequestBody Client client){
        clientServiceImpl.addClient(client);
    }


}
