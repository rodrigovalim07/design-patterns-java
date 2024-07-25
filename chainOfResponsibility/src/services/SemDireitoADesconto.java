package services;

import java.math.BigDecimal;

import entities.Carro;

public class SemDireitoADesconto extends DescontoCarro {

	public SemDireitoADesconto(DescontoCarro proximoDesconto) {
		super(proximoDesconto);
	}

	@Override
	public BigDecimal aplicaDesconto(Carro carro) {
		return BigDecimal.ZERO;
	}

}
