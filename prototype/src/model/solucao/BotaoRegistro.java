package model.solucao;

import java.util.LinkedHashMap;
import java.util.Map;

import model.entities.Botao;
import model.enums.TipoBordaEnum;

public class BotaoRegistro {
	
	private static Map<String, Botao> REGISTRY = new LinkedHashMap<>();
	
	static {
		Botao botaoAmarelo = new Botao();
		botaoAmarelo.setCor("Amarelo");
		botaoAmarelo.setAltura(40);
		botaoAmarelo.setLargura(100);
		botaoAmarelo.setTipoBorda(TipoBordaEnum.GROSSA);
		
		Botao botaoVermelho = new Botao();
		botaoVermelho.setCor("Vermelho");
		botaoVermelho.setAltura(30);
		botaoVermelho.setLargura(100);
		botaoVermelho.setTipoBorda(TipoBordaEnum.FINA);
		
		Botao botaoAzul = new Botao();
		botaoAzul.setCor("Azul");
		botaoAzul.setAltura(35);
		botaoAzul.setLargura(125);
		botaoAzul.setTipoBorda(TipoBordaEnum.TRASSEJADA);
		
		REGISTRY.put("BOTAO_AMARELO", botaoAmarelo);
		REGISTRY.put("BOTAO_VERMELHO", botaoVermelho);
		REGISTRY.put("BOTAO_AZUL", botaoAzul);
	}
	
	public static Botao getBotao(String chave) {
		return BotaoFactory.getInstance(REGISTRY.get(chave));
	}

	public static void addRegistry(String chave, Botao botao) {
		REGISTRY.put(chave, botao);
	}
}
