package br.com.tqi.emprestimos.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tqi.emprestimos.dto.request.LoginClienteDTO;
import br.com.tqi.emprestimos.dto.response.MensagemResponseDTO;
import br.com.tqi.emprestimos.exception.ClienteException;
import br.com.tqi.emprestimos.services.ClienteService;

@RestController
@RequestMapping("login")
public class LoginController {
	
	@Autowired
	private ClienteService service;
	
	@GetMapping
	public MensagemResponseDTO login(@RequestBody LoginClienteDTO loginClienteDTO) throws ClienteException {
		
			return service.login(loginClienteDTO);
		
	}

}
