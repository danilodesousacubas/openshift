package br.com.clients;

import java.util.Arrays;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.clients.dto.ClientDTO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/clients")
public class ClientController {

	@GetMapping("{id}")
	public ClientDTO getById(@PathParam("id") Long id) {
		log.info("Client get by id:{}", id);
		return ClientDTO.builder().name("Soldado 01").email("marcos.uau@gmail.com").phone("99982-22232").build();
	}
	
	@GetMapping
	public List<ClientDTO> get() {
		ClientDTO c1 = ClientDTO.builder().name("Soldado 01").email("marcos.uau@gmail.com").phone("99982-22232").build();
		ClientDTO c2 = ClientDTO.builder().name("Soldado 02").email("marcos.aiaio@gmail.com").phone("99982-22232").build();
		ClientDTO c3 = ClientDTO.builder().name("Soldado 03").email("camila.fugiu@gmail.com").phone("99982-11111").build();
		return Arrays.asList(c1, c2, c3);
	}
}