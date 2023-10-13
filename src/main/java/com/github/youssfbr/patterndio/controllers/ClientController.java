package com.github.youssfbr.patterndio.controllers;

import com.github.youssfbr.patterndio.dtos.ClientResponseDTO;
import com.github.youssfbr.patterndio.dtos.ClientResquestDTO;
import com.github.youssfbr.patterndio.dtos.Response;
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

    @GetMapping("{id}")
    public Response<ClientResponseDTO> findById(@PathVariable Long id) {

        Response<ClientResponseDTO> response = new Response<>();
        response.setData(clientService.findById(id));

        return response;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ClientResponseDTO create(@RequestBody ClientResquestDTO clientResquestDTO) {
        return clientService.create(clientResquestDTO);
    }

    @PutMapping
    public Response<ClientResponseDTO> updateClient(@RequestBody ClientResquestDTO clientResquestDTO) {

        Response<ClientResponseDTO> response = new Response<>();
        response.setData(clientService.updateClient(clientResquestDTO));

        return response;
    }

}
