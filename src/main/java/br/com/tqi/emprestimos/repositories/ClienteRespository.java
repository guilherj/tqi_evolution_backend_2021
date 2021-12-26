package br.com.tqi.emprestimos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.tqi.emprestimos.entities.Cliente;

@Repository
public interface ClienteRespository extends JpaRepository<Cliente, Long> {

}
