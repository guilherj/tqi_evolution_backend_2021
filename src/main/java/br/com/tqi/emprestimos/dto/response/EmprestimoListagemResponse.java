package br.com.tqi.emprestimos.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmprestimoListagemResponse {
	
	private Long id;
	
	private Double valor;
	
	private Integer qtdParcelas;
	
	
	
}
