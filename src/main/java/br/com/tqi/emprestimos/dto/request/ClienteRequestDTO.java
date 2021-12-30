package br.com.tqi.emprestimos.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClienteRequestDTO {
	
    private String nome;
	
	private String email;
	
	private String cpf;
	
	private String rg;
	
	private String logradouro;
	
	private Integer numero;
	
	private String complemento;
	
	private String cidade;
	
	private String estado;
	
	private String pais;
	
	private String cep;
	
	private Double renda;
	
	private String senha;

}
