package br.com.treinaweb.twclientes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.treinaweb.twclientes.model.cliente;

public interface ClienteRepository extends JpaRepository<cliente, Long> {
        
}
