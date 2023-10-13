package com.github.youssfbr.patterndio.services;

import com.github.youssfbr.patterndio.dtos.ClientResponseDTO;
import com.github.youssfbr.patterndio.dtos.ClientResquestDTO;
import com.github.youssfbr.patterndio.entities.Client;
import com.github.youssfbr.patterndio.repositories.IClientRepository;
import com.github.youssfbr.patterndio.services.exceptions.ClientNotFoundException;
import com.github.youssfbr.patterndio.services.exceptions.InternalServerErrorException;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.CachePut;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClientService implements IClientService {

    private final IClientRepository clientRepository;

    @Override
    @Transactional(readOnly = true)
    @CachePut(unless = "#result.size()<3")
    public List<ClientResponseDTO> findAll() {
        try {
            return clientRepository
                    .findAll()
                    .stream()
                    .map(ClientResponseDTO::new)
                    .toList();
        }
        catch (Exception e) {
            throw new InternalServerErrorException();
        }
    }

    @Override
    @CachePut(key = "#id")
    @Transactional(readOnly = true)
    public ClientResponseDTO findById(Long id) {
        try {
            return clientRepository
                    .findById(id)
                    .map(ClientResponseDTO::new)
                    .orElseThrow(() -> new ClientNotFoundException(id));
        }
        catch (ClientNotFoundException e) {
            throw e;
        }
        catch (Exception e) {
            throw new InternalServerErrorException();
        }
    }

    @Override
    @Transactional
    public ClientResponseDTO create(ClientResquestDTO clientResquestDTO) {
        Client client = new Client(clientResquestDTO);
        Client clientSaved = clientRepository.save(client);
        return new ClientResponseDTO(clientSaved);
    }

    private Client verifyIfClientExists(Long id) {
        return clientRepository
                .findById(id)
                .orElseThrow(() -> new ClientNotFoundException(id));
    }

}
