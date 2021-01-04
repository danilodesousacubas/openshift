package br.com.clients.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.clients.domain.Client;
import br.com.clients.repository.ClientRepository;

@Service
public class ClientService {

	@Autowired
	private ClientRepository repository;

	public void save(Client client) {
		System.out.println("save");
		repository.save(client);
	}
}
