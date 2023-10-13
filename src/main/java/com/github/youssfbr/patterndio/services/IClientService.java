package com.github.youssfbr.patterndio.services;

import com.github.youssfbr.patterndio.dtos.ClientResponseDTO;
import com.github.youssfbr.patterndio.dtos.ClientResquestDTO;

import java.util.List;

public interface IClientService {
    List<ClientResponseDTO> findAll();
    ClientResponseDTO create(ClientResquestDTO clientResquestDTO);

}
