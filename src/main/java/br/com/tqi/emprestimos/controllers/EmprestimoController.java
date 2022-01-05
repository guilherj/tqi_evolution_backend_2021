package br.com.tqi.emprestimos.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.tqi.emprestimos.dto.request.EmprestimoRequestDTO;
import br.com.tqi.emprestimos.dto.response.MensagemResponseDTO;
import br.com.tqi.emprestimos.services.EmprestimoService;

@RestController
@RequestMapping("emprestimo")
public class EmprestimoController {
	
	@Autowired
	private EmprestimoService service;
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public MensagemResponseDTO cadastrarEmprestimo(@RequestBody EmprestimoRequestDTO emprestimoRequestDTO) {
		return service.cadastrarEmprestimo(emprestimoRequestDTO);
	}
	
	@GetMapping
	public String test() {
		return "Teste emprestimo";
	}

}
