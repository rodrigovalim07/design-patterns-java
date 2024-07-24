package repository;

import java.util.HashMap;
import java.util.Map;

import entities.Pessoa;

public class PessoaRepository {

	private Map<Long, Pessoa> banco = new HashMap<>();
	private static Long countId = 1L;
	
	public void save(Pessoa pessoa) {
		banco.put(countId++, pessoa);
	}
	
	public Pessoa findById(Long id) {
		try {
			Thread.sleep(1500);
		} catch (Exception e) {
			throw new RuntimeException();
		}
		return banco.get(id);
	}
}
