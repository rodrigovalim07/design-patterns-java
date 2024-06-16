package app;

import model.entities.Botao;
import model.enums.TipoBordaEnum;
import model.solucao.BotaoRegistro;

public class Programa {

	public static void main(String[] args) {

		Botao botaoVermelho = BotaoRegistro.getBotao("BOTAO_VERMELHO");
		System.out.println(botaoVermelho);
		
		Botao botaoAzul = BotaoRegistro.getBotao("BOTAO_AZUL");
		System.out.println(botaoAzul);
		
		Botao botaoAmarelo = BotaoRegistro.getBotao("BOTAO_AMARELO");
		System.out.println(botaoAmarelo);		
		botaoAmarelo.setLargura(200);
		System.out.println(botaoAmarelo);

		Botao botaoAmarelo2 = BotaoRegistro.getBotao("BOTAO_AMARELO");
		System.out.println(botaoAmarelo2);
		
		String chave = "BOTAO_PRETO";
		Botao botaoPreto = new Botao();
		botaoPreto.setCor("Preto");
		botaoPreto.setAltura(50);
		botaoPreto.setLargura(300);
		botaoPreto.setTipoBorda(TipoBordaEnum.GROSSA);
		BotaoRegistro.addRegistry(chave, botaoPreto);
		
		Botao botaoPretoClone = BotaoRegistro.getBotao("BOTAO_PRETO");
		System.out.println(botaoPretoClone);
	}

}
