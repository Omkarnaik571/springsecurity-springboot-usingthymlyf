package com.sapiens.springboot.springsecurity.service;

import java.util.List;

import com.sapiens.springboot.springsecurity.model.Policy;

public interface PolicyService {

	List<Policy> getAllPolicy();

	Policy save(Policy policy);

	Policy remove(Long policy);

}
