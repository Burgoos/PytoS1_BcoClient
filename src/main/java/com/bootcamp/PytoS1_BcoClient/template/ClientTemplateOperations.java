package com.bootcamp.PytoS1_BcoClient.template;

import com.bootcamp.PytoS1_BcoClient.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class ClientTemplateOperations {

    @Autowired
    ReactiveMongoTemplate template;

    public Mono<Client> save(Mono<Client> client){
        return  template.save(client);
    }

}
