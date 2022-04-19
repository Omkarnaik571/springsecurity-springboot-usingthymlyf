package com.sapiens.springboot.springsecurity.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.sapiens.springboot.springsecurity.model.Client;

@Repository
public class ClientRepositoryImpl implements ClientRepository {

	@PersistenceUnit
	EntityManagerFactory entityManagerFactory;

	@Override
	public List<Client> getAllClients() {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		String viewall = "from Client";
		Query query = entityManager.createQuery(viewall);
		try {
			List<Client> result = query.getResultList();
			return result;
		} catch (Exception e) {
		}
		return null;
	}

	@Override
	public Client save(Client client) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();

		transaction.begin();
		entityManager.persist(client);
		transaction.commit();

		return client;

	}

}
