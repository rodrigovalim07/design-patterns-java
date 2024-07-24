package repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.logging.Logger;

import entities.Pessoa;

public class PessoaRepositoryProxy extends PessoaRepository {

	private static Logger log = Logger.getLogger(PessoaRepositoryProxy.class.getName());
	private Map<Long, Pessoa> cache = new HashMap<>();
	
	public void save(Pessoa pessoa) {
		log.info("Iniciando chamada do método save...");
		super.save(pessoa);
		log.info("Chamada do método save finalizada.");
	}
	
	public Pessoa findById(Long id) {
		log.info("Iniciando chamada do método findById...");
		long inicio = System.currentTimeMillis();
		
		Pessoa pessoa = null;
		if (Objects.nonNull(cache.get(id))) {
			log.info("Está pegando do cache");
			pessoa = cache.get(id);
		} else {
			log.info("Está pegando do PessoaRepository");
			pessoa = super.findById(id);
			cache.put(id, pessoa);
		}
		
		log.info("Chamada do método findById finalizada.");
		long fim = System.currentTimeMillis();
		log.info("Tempo gasto na chamada: " + (fim - inicio));
		return pessoa;
	}
	
}
