package br.com.tqi.emprestimos.dto;

import br.com.tqi.emprestimos.entities.Cliente;
import br.com.tqi.emprestimos.entities.Endereco;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClienteDTO {
	
	private Long id;
	
	private String nome;
	
	private String email;
	
	private String cpf;
	
	private String rg;
	
	private Double renda;
	
	private String senha;
	
	private Endereco endereco;
	
	public ClienteDTO(Cliente cliente) {
		id = cliente.getId();
		nome = cliente.getNome();
		email = cliente.getEmail();
		cpf = cliente.getCpf();
		rg = cliente.getRg();
		renda = cliente.getRenda();
		senha = "**********";
		endereco = cliente.getEndereco();
	}
	
	

}
