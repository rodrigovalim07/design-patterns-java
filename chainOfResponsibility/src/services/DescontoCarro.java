package services;

import java.math.BigDecimal;

import entities.Carro;

public abstract class DescontoCarro {

	protected DescontoCarro proximoDesconto;

	public DescontoCarro(DescontoCarro proximoDesconto) {
		this.proximoDesconto = proximoDesconto;
	}
	
	public abstract BigDecimal aplicaDesconto(Carro carro);
}
