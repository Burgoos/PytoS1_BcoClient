package com.bootcamp.PytoS1_BcoClient.beans.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ClientDTO {
    private List<ClientItemDTO> list;

    public ClientDTO(){

    }
}
