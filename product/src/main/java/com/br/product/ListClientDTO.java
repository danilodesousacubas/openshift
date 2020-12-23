package com.br.product;

import java.util.ArrayList;
import java.util.List;

public class ListClientDTO {
	List<ClientDTO> clients = new ArrayList<>();

	public List<ClientDTO> getClients() {
		return clients;
	}

	public void setClients(List<ClientDTO> clients) {
		this.clients = clients;
	}
}
