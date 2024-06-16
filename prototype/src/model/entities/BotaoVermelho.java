package model.entities;

import model.enums.TipoBordaEnum;

public class BotaoVermelho extends Botao {

	public BotaoVermelho() {
		setCor("Vermelho");
		setAltura(30);
		setLargura(100);
		setTipoBorda(TipoBordaEnum.FINA);
	}
}
