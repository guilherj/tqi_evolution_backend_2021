package br.com.tqi.emprestimos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.tqi.emprestimos.dto.request.EmprestimoRequestDTO;
import br.com.tqi.emprestimos.dto.response.ClienteResponseDTO;
import br.com.tqi.emprestimos.dto.response.EmprestimoDetalhesResponseDTO;
import br.com.tqi.emprestimos.dto.response.EmprestimoListagemResponseDTO;
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
	
	@GetMapping(value = "/listagem/cliente")
	public List<EmprestimoListagemResponseDTO> listarEmprestimos(@RequestParam Long id) {
		return service.listagemEmprestimos(id);
	}
	
	@GetMapping("/detalhe/{id}")
	public EmprestimoDetalhesResponseDTO findById(@PathVariable Long id) {
		return service.findById(id);
	}

}
