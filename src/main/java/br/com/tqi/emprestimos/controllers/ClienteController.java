package br.com.tqi.emprestimos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.tqi.emprestimos.dto.response.ClienteResponseDTO;
import br.com.tqi.emprestimos.dto.response.MensagemResponseDTO;
import br.com.tqi.emprestimos.entities.Cliente;
import br.com.tqi.emprestimos.services.ClienteService;

@RestController
@RequestMapping("cliente")
public class ClienteController {
	
	@Autowired
	private ClienteService service;
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public MensagemResponseDTO cadastrarCliente(@RequestBody Cliente cliente) {
		return service.cadastrarCliente(cliente);
	}
	
	@GetMapping
	public List<ClienteResponseDTO> findAll() {
		return service.findAll();
	}
	
	@GetMapping("/{id}")
	public ClienteResponseDTO findById(@PathVariable Long id) {
		return service.findById(id);
	}
	
	
	
	

}
