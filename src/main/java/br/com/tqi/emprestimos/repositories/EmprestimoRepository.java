package br.com.tqi.emprestimos.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.tqi.emprestimos.entities.Emprestimo;

@Repository
public interface EmprestimoRepository extends JpaRepository<Emprestimo, Long> {
	

		public List<Emprestimo> findByCliente_Id(Long id);
		
	
}
