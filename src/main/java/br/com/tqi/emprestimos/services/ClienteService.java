package br.com.tqi.emprestimos.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tqi.emprestimos.dto.ClienteDTO;
import br.com.tqi.emprestimos.entities.Cliente;
import br.com.tqi.emprestimos.repositories.ClienteRespository;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRespository repository;
	
	public ClienteDTO findById(Long id) {
		Cliente entity = repository.findById(id).get();
		ClienteDTO dto = new ClienteDTO(entity);
		return dto;
	}

}
