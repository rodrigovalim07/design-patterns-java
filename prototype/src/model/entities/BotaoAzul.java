package model.entities;

import model.enums.TipoBordaEnum;

public class BotaoAzul extends Botao {

	public BotaoAzul() {
		setCor("Azul");
		setAltura(35);
		setLargura(125);
		setTipoBorda(TipoBordaEnum.TRASSEJADA);
	}
}
