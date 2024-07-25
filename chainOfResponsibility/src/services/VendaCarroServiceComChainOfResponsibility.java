package services;

import java.math.BigDecimal;

import entities.Carro;

public class VendaCarroServiceComChainOfResponsibility {

	public BigDecimal calcularValorVenda(Carro carro) {
		DescontoCarro desconto =
				new DescontoCarroFIAT
					(new DescontoCarroFORD
						(new DescontoCarroMaiorQueCemMil
							(new SemDireitoADesconto(null))));
		
		return desconto.aplicaDesconto(carro);
	}
}
