package br.com.clients.controller;

import java.util.Arrays;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.clients.domain.Client;
import br.com.clients.dto.ClientDTO;
import br.com.clients.service.ClientService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/clients")
public class ClientController {

	@Autowired
	ClientService service;
	
	@GetMapping("{id}")
	public ClientDTO getById(@PathParam("id") Long id) {
		log.info("Client get by id:{}", id);
		return ClientDTO.builder().name("Soldado 01").email("marcos.uau@gmail.com").phone("99982-22232").build();
	}
	
	@GetMapping
	public List<ClientDTO> get() {
		ClientDTO c1 = ClientDTO.builder().name("Soldado 01").email("marcos.uau@gmail.com").phone("99982-22232").build();
		ClientDTO c3 = ClientDTO.builder().name("Soldado 03").email("camila.fugiu@gmail.com").phone("99982-11111").build();
		ClientDTO c4 = ClientDTO.builder().name("Soldado 04").email("ana.novo@gmail.com").phone("9999-2222").build();
		ClientDTO c5 = ClientDTO.builder().name("Flavio").email("flavio@retail.com.br").phone("9999-1111").build();
		
		return Arrays.asList(c1, c3, c4, c5);
	}
	
	@PostMapping
	public void save() {
		System.out.println("saving");
		Client c = new Client();
		c.setName("Name1");
		service.save(c);
	}
}
