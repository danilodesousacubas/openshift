package br.com.minishift.java.minishiftjava;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/client/")
@Slf4j
public class ClientController {

	@GetMapping("hello")
	public String hello() {
		log.info("Hello Client!! ");
		return "Hello Open Shift!";
	}
}
