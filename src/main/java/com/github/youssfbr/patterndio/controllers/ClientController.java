package com.github.youssfbr.patterndio.controllers;

import com.github.youssfbr.patterndio.dtos.ClientResponseDTO;
import com.github.youssfbr.patterndio.dtos.ClientResquestDTO;
import com.github.youssfbr.patterndio.services.IClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("clients")
@RequiredArgsConstructor
public class ClientController {

    private final IClientService clientService;

    @GetMapping
    public List<ClientResponseDTO> listAll() {
        return clientService.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ClientResponseDTO create(@RequestBody ClientResquestDTO client) {
        return clientService.create(client);
    }

}
