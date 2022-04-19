package com.sapiens.springboot.springsecurity.repository;

import java.util.List;

import com.sapiens.springboot.springsecurity.model.Client;

public interface ClientRepository {

	List<Client> getAllClients();
	
	Client save(Client client);

}
