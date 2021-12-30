package br.com.tqi.emprestimos.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginClienteDTO {
	
	private String email;
	
	private String senha;

}
