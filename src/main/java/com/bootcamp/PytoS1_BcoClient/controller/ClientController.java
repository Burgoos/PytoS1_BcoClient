package com.bootcamp.PytoS1_BcoClient.controller;

import com.bootcamp.PytoS1_BcoClient.model.Client;
import com.bootcamp.PytoS1_BcoClient.service.ClientServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

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

    @GetMapping
    @ResponseBody
    public Flux<Client> findAll(){
        return clientServiceImpl.findAllClient();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Mono<Client>> findClientById(@PathVariable("id") Integer id){
        Mono<Client> client = clientServiceImpl.findClientById(id);
        return new ResponseEntity<Mono<Client>>(client, client != null ? HttpStatus.OK : HttpStatus.NOT_FOUND);
    }
    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public Mono<Client> update(@RequestBody Client client){
        return clientServiceImpl.updateClient(client);
    }
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable("id") Integer id){
        clientServiceImpl.deleteClient(id).subscribe();
    }



}
