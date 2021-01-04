package com.br.product;

import java.util.Arrays;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/products")
public class ProductController {

	
	@GetMapping("{id}")
	public ProductDTO getById(@PathParam("id") Long id) {
		log.info("Product get by id:{}", id);
		return ProductDTO.builder().id(1002L).name("product3").build();
	}
	
	@GetMapping
	public List<ProductDTO> get() {
		
		ProductDTO p1 = ProductDTO.builder().id(1L).name("product1").build();
		ProductDTO p2 = ProductDTO.builder().id(2L).name("product2").build();
		
		return Arrays.asList(p1, p2);
	}
	
	@PostMapping("/clients")
	public ClientDTO clients() {
		log.info("Products Client By Service Name 111");
		
		RestTemplate restTemplate = new RestTemplate();
//		String url = "http://clients-sample-java.192.168.99.100.nip.io";
		String url = "http://clients:8080";
		ClientDTO client = restTemplate.getForObject(url + "/clients/1", ClientDTO.class);
		
		return client;
	}
}
