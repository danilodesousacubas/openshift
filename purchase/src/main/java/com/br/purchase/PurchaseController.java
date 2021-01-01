package com.br.purchase;

import java.util.Arrays;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/purchases")
public class PurchaseController {
	
	@GetMapping("{id}")
	public PurchaseDTO getById(@PathParam("id") Long id) {
		log.info("Purchase get by id:{}", id);
		return PurchaseDTO.builder().id(1002L).totalValue(new Double(223.32)).clientId(78L).build();
	}
	
	@GetMapping
	public List<PurchaseDTO> get() {
		
		PurchaseDTO p1 = PurchaseDTO.builder().id(1002L).totalValue(new Double(223.32)).clientId(1L).build();
		PurchaseDTO p2 = PurchaseDTO.builder().id(1088L).totalValue(new Double(781.91)).clientId(2L).build();
		PurchaseDTO p3 = PurchaseDTO.builder().id(1088L).totalValue(new Double(888.91)).clientId(2L).build();

		return Arrays.asList(p1, p2, p3);
	}
	
}
