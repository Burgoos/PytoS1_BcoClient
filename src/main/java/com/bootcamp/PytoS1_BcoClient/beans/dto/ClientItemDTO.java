package com.bootcamp.PytoS1_BcoClient.beans.dto;

import com.bootcamp.PytoS1_BcoClient.beans.domain.ClientItem;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClientItemDTO {

    private String id;
    private String name;
    private String identifier;
    private String type;

    public ClientItemDTO(){

    }

    public ClientItemDTO(ClientItem client) {
        this.id = client.getId();
        this.name = client.getName();
        this.identifier = client.getIdentifier() ;
        this.type = client.getType();
    }
}
