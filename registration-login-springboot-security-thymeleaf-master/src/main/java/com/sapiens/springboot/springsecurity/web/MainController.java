package com.sapiens.springboot.springsecurity.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sapiens.springboot.springsecurity.model.Client;
import com.sapiens.springboot.springsecurity.model.Policy;
import com.sapiens.springboot.springsecurity.service.ClientService;
import com.sapiens.springboot.springsecurity.service.PolicyService;

@Controller
public class MainController {

	@Autowired
	ClientService clientService;

	@Autowired
	PolicyService policyService;

	@GetMapping("/")
	public String root() {
		return "index";
	}

	@GetMapping("/allclients")
	public String allClients(Model model) {
		List<Client> clientList = clientService.getAllClients();
		model.addAttribute("clientList", clientList);
		return "allclients";
	}

	@GetMapping("/create-client")
	public String createClientForm(Model model) {
		model.addAttribute("client", new Client());
		return "create-client";
	}

	@PostMapping("/save-client")
	public String createclient(Model model, @ModelAttribute Client client) {
		clientService.save(client);
		return "result";
	}

	@GetMapping("/allpolicy")
	public String allpolicy(Model model) {
		List<Policy> policyList = policyService.getAllPolicy();
		model.addAttribute("policyList", policyList);
		return "allpolicy";
	}

	@GetMapping("/create-policy")
	public String createPolicyForm(Model model) {
		model.addAttribute("policy", new Policy());
		List<Client> clientList = clientService.getAllClients();
		List<String> clientNameList = new ArrayList<String>();
		clientList.stream().forEach(client -> {
			clientNameList.add(client.getName());
		});
		model.addAttribute("clientNameList", clientNameList);
		return "create-policy";
	}

	@PostMapping("/save-policy")
	public String createPolicy(@ModelAttribute Policy policy) {
		policyService.save(policy);
		return "result";
	}

	@PostMapping("/delete")
	public String deletePolicy(@RequestParam long id) {
		System.out.println("\nID of policy = " + id);
		policyService.remove(id);
		return "result";
	}

	@GetMapping("/login")
	public String login(Model model) {
		return "login";
	}

	@GetMapping("/user")
	public String userIndex() {
		return "user/index";
	}
}
