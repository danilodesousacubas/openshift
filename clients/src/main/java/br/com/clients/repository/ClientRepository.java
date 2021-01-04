package br.com.clients.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.clients.domain.Client;

public interface ClientRepository extends CrudRepository<Client, Long> {

}
