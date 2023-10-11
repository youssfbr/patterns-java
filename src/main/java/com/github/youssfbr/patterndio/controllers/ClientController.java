package com.github.youssfbr.patterndio.controllers;

import com.github.youssfbr.patterndio.entities.Client;
import com.github.youssfbr.patterndio.services.IClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("clients")
@RequiredArgsConstructor
public class ClientController {

    private final IClientService clientService;

    @GetMapping
    public List<Client> listAll() {
        return clientService.findAll();
    }
    
}
