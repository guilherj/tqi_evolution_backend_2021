package br.com.tqi.emprestimos.services;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tqi.emprestimos.dto.request.EmprestimoRequestDTO;
import br.com.tqi.emprestimos.dto.response.ClienteResponseDTO;
import br.com.tqi.emprestimos.dto.response.EmprestimoDetalhesResponseDTO;
import br.com.tqi.emprestimos.dto.response.EmprestimoListagemResponseDTO;
import br.com.tqi.emprestimos.dto.response.MensagemResponseDTO;
import br.com.tqi.emprestimos.entities.Cliente;
import br.com.tqi.emprestimos.entities.Emprestimo;
import br.com.tqi.emprestimos.repositories.EmprestimoRepository;

@Service
public class EmprestimoService {

	@Autowired
	private EmprestimoRepository repository;

	@Autowired
	private ModelMapper modelMapper;

	public MensagemResponseDTO cadastrarEmprestimo(EmprestimoRequestDTO emprestimoRequestDTO) {
		String msg;
		Emprestimo emprestimo = modelMapper.map(emprestimoRequestDTO, Emprestimo.class);
		LocalDate dataLimite = LocalDate.now().plusMonths(3);

		if ((emprestimoRequestDTO.getDataPrimeiraParcela().isBefore(dataLimite))
				|| (emprestimoRequestDTO.getDataPrimeiraParcela().equals(dataLimite))) {

			if ((emprestimoRequestDTO.getQtdParcelas() <= 60) && (emprestimoRequestDTO.getQtdParcelas() >= 1)) {

				msg = "Emprestimo Criado com sucesso!";
				repository.save(emprestimo);

			} else
				msg = "A quantidade máxima de parcelas é 60";

		} else
			msg = "Data da primeira parcela não pode ser maior que 60 dias";

		return MensagemResponseDTO.builder().mensagem(msg).build();

	}

	public List<EmprestimoListagemResponseDTO> listagemEmprestimos(Long id) {

		List<Emprestimo> emprestimos = repository.findByCliente_Id(id);
		List<EmprestimoListagemResponseDTO> EmpListagem = new ArrayList<>();

		for (Emprestimo e : emprestimos) {
			EmprestimoListagemResponseDTO emprestimo = modelMapper.map(e, EmprestimoListagemResponseDTO.class);
			EmpListagem.add(emprestimo);
		}

		return EmpListagem;
	}

	public EmprestimoDetalhesResponseDTO findById(Long id) {
		
		Emprestimo emprestimo = repository.findById(id).get();
		return modelMapper.map(emprestimo, EmprestimoDetalhesResponseDTO.class);

	}

}
