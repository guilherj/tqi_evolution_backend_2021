package br.com.tqi.emprestimos.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.tqi.emprestimos.entities.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

	Optional<Cliente> findByEmail(String email);
	Optional<Cliente> findBySenha(String senha);
	Cliente findByCpf(String cpf);
}
