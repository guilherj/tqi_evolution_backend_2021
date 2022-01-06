package br.com.tqi.emprestimos.dto.response;

import java.time.LocalDate;

import br.com.tqi.emprestimos.entities.Cliente;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmprestimoDetalhesResponse {
	
	private Long id;
	
	private Double valor;
	
	private LocalDate dataPrimeiraParcela;
	
	private Integer qtdParcelas;
	
	private Cliente cliente;

}
