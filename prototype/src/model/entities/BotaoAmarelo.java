package model.entities;

import model.enums.TipoBordaEnum;

public class BotaoAmarelo extends Botao {

	public BotaoAmarelo() {
		setCor("Amarelo");
		setAltura(40);
		setLargura(100);
		setTipoBorda(TipoBordaEnum.GROSSA);
	}
}
