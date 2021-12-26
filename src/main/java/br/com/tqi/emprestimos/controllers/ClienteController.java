package br.com.tqi.emprestimos.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tqi.emprestimos.dto.ClienteDTO;
import br.com.tqi.emprestimos.services.ClienteService;

@RestController
@RequestMapping("cliente")
public class ClienteController {
	
	@Autowired
	private ClienteService service;
	
	@GetMapping
	public String test() {
		return "API Funcionando";
	}
	
	@GetMapping("/{id}")
	public ClienteDTO findById(@PathVariable Long id) {
		return service.findById(id);
	}
	
	
	
	

}
