package services;

import java.math.BigDecimal;

import entities.Carro;

public class DescontoCarroMaiorQueCemMil extends DescontoCarro {

	public DescontoCarroMaiorQueCemMil(DescontoCarro proximoDesconto) {
		super(proximoDesconto);
	}

	@Override
	public BigDecimal aplicaDesconto(Carro carro) {
		BigDecimal valorVenda = carro.getPreco();
		if (carro.getPreco().compareTo(new BigDecimal(100000)) > 0) {
			return valorVenda.subtract(new BigDecimal(10000));
		}
		return proximoDesconto.aplicaDesconto(carro);
	}
}
