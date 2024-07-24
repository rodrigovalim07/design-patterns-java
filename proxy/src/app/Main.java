package app;

import java.time.LocalDate;

import entities.Pessoa;
import repository.PessoaRepositoryProxy;
import service.PessoaService;

public class Main {

	public static void main(String[] args) {
		PessoaService servico = new PessoaService(new PessoaRepositoryProxy());
		Pessoa pessoa = new Pessoa.PessoaBuilder()
				.sobrenome("Tesla")
				.dataNascimento(LocalDate.of(1892, 2, 17))
				.nome("Nikola")
				.email("nikolatestinha@hotmail.com")
				.apelido("Teslinha")
				.documento("356595754515")
				.build();
		
		servico.save(pessoa);
		
		Pessoa pessoaRetornada = servico.findById(1L);
		System.out.println(pessoaRetornada);

		// pessoa com proxy
		
		Pessoa pessoa2 = new Pessoa.PessoaBuilder()
				.sobrenome("Roberval")
				.dataNascimento(LocalDate.of(1985, 8, 23))
				.nome("da Silva")
				.email("valval@hotmail.com")
				.apelido("cabeça")
				.documento("134679852")
				.build();
		
		servico.save(pessoa2);
		
		Pessoa pessoaRetornada2 = servico.findById(2L);
		System.out.println(pessoaRetornada2);
		Pessoa pessoaRetornadaCache = servico.findById(2L);
		System.out.println(pessoaRetornadaCache);
	}

}
