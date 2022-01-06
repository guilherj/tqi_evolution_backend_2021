package br.com.tqi.emprestimos.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClienteEmpDetalhesResponseDTO {
	
	private String emailCliente;
	
	private Double rendaCliente;

}
