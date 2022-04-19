package com.sapiens.springboot.springsecurity.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.sapiens.springboot.springsecurity.model.Policy;

@Repository
public class PolicyRepositoryImpl implements PolicyRepository {

	@PersistenceUnit
	EntityManagerFactory entityManagerFactory;

	@Override
	public List<Policy> getAllPolicy() {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		String viewall = "from Policy";
		Query query = entityManager.createQuery(viewall);
		try {
			List<Policy> result = query.getResultList();
			return result;
		} catch (Exception e) {
		}
		return null;
	}

	@Override
	public Policy save(Policy policy) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();

		transaction.begin();
		entityManager.persist(policy);
		transaction.commit();

		return policy;
	}

	@Override
	public Policy remove(Long id) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();

		transaction.begin();
		Policy policy = entityManager.find(Policy.class, id);
		entityManager.remove(policy);
		transaction.commit();

		return policy;

	}

}
