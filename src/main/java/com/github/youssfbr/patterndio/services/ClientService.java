package com.github.youssfbr.patterndio.services;

import com.github.youssfbr.patterndio.entities.Client;
import com.github.youssfbr.patterndio.repositories.IClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClientService implements IClientService {

    private final IClientRepository clientRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Client> findAll() {
        return clientRepository.findAll();
    }

    @Override
    @Transactional
    public Client create(Client client) {
        return clientRepository.save(client);
    }

}
