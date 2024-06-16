package app;

import java.time.LocalDate;

import entidades.Pessoa;

public class Programa {

	public static void main(String[] args) {
		// Pessoa pessoa = new Pessoa("Amarildo", "da Silva", "152362-52", "amarildo@gmail.com", "opala", LocalDate.of(1975, 6, 25));
		
		// atributos não precisam ser na order
		// mais fácil para lembrar dos atributos
		Pessoa pessoa2 = new Pessoa.PessoaBuilder()
				.nome("Cleiton")
				.sobrenome("Oliveira")
				.apelido("cleitinho")
				.dataNascimento(LocalDate.of(1982, 8, 30))
				.email("cleitinho@hotmail.com")
				.documento("172598-56")
				.build();

		System.out.println(pessoa2);
		
		StringBuilder sb = new StringBuilder()
				.append("o Java também usa ")
				.append("Design Patterns nativo");
		System.out.println(sb);
	}

}
