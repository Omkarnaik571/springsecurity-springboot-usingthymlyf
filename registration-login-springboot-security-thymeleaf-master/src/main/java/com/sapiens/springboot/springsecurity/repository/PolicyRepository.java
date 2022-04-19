package com.sapiens.springboot.springsecurity.repository;

import java.util.List;

import com.sapiens.springboot.springsecurity.model.Policy;

public interface PolicyRepository {

	List<Policy> getAllPolicy();

	Policy save(Policy policy);

	Policy remove(Long policy);
	
}
