package com.testjpa.controller;

import com.testjpa.service.ClientService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test-jpa")
public class TestController {
    private final ClientService clientService;

    public TestController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping
    public ResponseEntity test() {
        clientService.saveNewClients();
        return new ResponseEntity(HttpStatus.OK);
    }
}
