package com.sapiens.springboot.springsecurity.service;

import java.util.List;

import com.sapiens.springboot.springsecurity.model.Client;

public interface ClientService {

	List<Client> getAllClients();

	Client save(Client client);

}
