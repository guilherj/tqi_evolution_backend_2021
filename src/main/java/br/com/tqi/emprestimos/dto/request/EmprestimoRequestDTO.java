package br.com.tqi.emprestimos.dto.request;

import java.time.LocalDate;

import javax.validation.constraints.Max;

import br.com.tqi.emprestimos.entities.Cliente;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmprestimoRequestDTO {
	
	private Double valor;
	
	private LocalDate dataPrimeiraParcela;
	
	@Max(60)
	private Integer qtdParcelas;
	
	private Cliente cliente;
	
	
	

}
