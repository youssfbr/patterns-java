package com.github.youssfbr.patterndio.services;

import com.github.youssfbr.patterndio.entities.Client;

import java.util.List;

public interface IClientService {
    List<Client> findAll();
    Client create(Client client);

}
