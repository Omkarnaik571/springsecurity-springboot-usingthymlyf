package com.sapiens.springboot.springsecurity.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sapiens.springboot.springsecurity.model.Policy;
import com.sapiens.springboot.springsecurity.repository.PolicyRepository;

@Service
public class PolicyServiceImpl implements PolicyService {

	@Autowired
	PolicyRepository policyRepository;

	@Override
	public List<Policy> getAllPolicy() {
		return policyRepository.getAllPolicy();
	}

	@Override
	public Policy save(Policy policy) {
		return policyRepository.save(policy);
	}

	@Override
	public Policy remove(Long policy) {
		return policyRepository.remove(policy);
	}
}
