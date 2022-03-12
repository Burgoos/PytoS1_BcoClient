package com.bootcamp.PytoS1_BcoClient.controllers;

import com.bootcamp.PytoS1_BcoClient.beans.domain.ClientItem;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/client")
public class ClientController {

    @PostMapping
    public void addClient(@RequestBody ClientItem clientItem){
        log.info(clientItem.getName());
    }


}
