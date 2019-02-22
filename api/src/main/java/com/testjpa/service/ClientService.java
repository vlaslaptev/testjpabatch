package com.testjpa.service;

import com.testjpa.entity.Client;
import com.testjpa.repository.ClientRepository;
import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
public class ClientService {

    private final ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Transactional
    public void saveNewClients() {
        List<Client> clientList = new ArrayList<>();
        for (int i = 0; i < 200; i++) {
            Client client = new Client();
            client.setPhone("" + (996650000 + i));
            client.setEmail("test" + i + "@gmail.com");
            clientList.add(client);
        }
        clientRepository.saveAll(clientList);
    }
}
