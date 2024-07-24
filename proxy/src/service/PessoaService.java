package service;

import entities.Pessoa;
import repository.PessoaRepositoryProxy;

public class PessoaService {

	private PessoaRepositoryProxy pessoaRepository;

	public PessoaService(PessoaRepositoryProxy pessoaRepository) {
		this.pessoaRepository = pessoaRepository;
	}
	
	public void save(Pessoa pessoa) {
		pessoaRepository.save(pessoa);
	}
	
	public Pessoa findById(Long id) {
		return pessoaRepository.findById(id);
	}
}
