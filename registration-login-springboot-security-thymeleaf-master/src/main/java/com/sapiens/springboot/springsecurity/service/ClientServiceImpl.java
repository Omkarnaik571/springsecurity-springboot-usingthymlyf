package com.sapiens.springboot.springsecurity.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sapiens.springboot.springsecurity.model.Client;
import com.sapiens.springboot.springsecurity.repository.ClientRepository;

@Service
public class ClientServiceImpl implements ClientService {

	@Autowired
	ClientRepository clientRepository;

	@Override
	public List<Client> getAllClients() {
		return clientRepository.getAllClients();
	}

	@Override
	public Client save(Client client) {
		return clientRepository.save(client);
	}

}
