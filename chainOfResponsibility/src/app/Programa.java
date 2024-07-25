package app;

import java.math.BigDecimal;

import entities.Carro;
import enums.Marca;
import services.VendaCarroService;
import services.VendaCarroServiceComChainOfResponsibility;

public class Programa {

	public static void main(String[] args) {
		VendaCarroService vendaCarroService = new VendaCarroService();

		Carro carro1 = new Carro();
		carro1.setMarca(Marca.FORD);
		carro1.setModelo("Fusion");
		carro1.setPreco(new BigDecimal(90000));

		BigDecimal valorVenda1 = vendaCarroService.calcularValorVenda(carro1);
		System.out.println("Valor de venda Fusion: " + carro1.getPreco());
		System.out.println("Valor de venda Fusion com desconto: " + valorVenda1);
		System.out.println();

		Carro carro2 = new Carro();
		carro2.setMarca(Marca.FIAT);
		carro2.setModelo("Uno");
		carro2.setPreco(new BigDecimal(40000));

		BigDecimal valorVenda2 = vendaCarroService.calcularValorVenda(carro2);
		System.out.println("Valor de venda Uno: " + carro2.getPreco());
		System.out.println("Valor de venda Uno com desconto: " + valorVenda2);
		System.out.println();

		Carro carro3 = new Carro();
		carro3.setMarca(Marca.CHEVROLET);
		carro3.setModelo("Camaro");
		carro3.setPreco(new BigDecimal(200000));

		BigDecimal valorVenda3 = vendaCarroService.calcularValorVenda(carro3);
		System.out.println("Valor de venda Camaro: " + carro3.getPreco());
		System.out.println("Valor de venda Camaro com desconto: " + valorVenda3);
		System.out.println("-------------------------------------------");

		// com chain of responsibility

		VendaCarroServiceComChainOfResponsibility vendaCarroService2 = new VendaCarroServiceComChainOfResponsibility();

		Carro carro11 = new Carro();
		carro11.setMarca(Marca.FORD);
		carro11.setModelo("Fiesta");
		carro11.setPreco(new BigDecimal(90000));

		BigDecimal valorVenda11 = vendaCarroService2.calcularValorVenda(carro11);
		System.out.println("Valor de venda Fiesta: " + carro11.getPreco());
		System.out.println("Valor de venda Fiesta com desconto: " + valorVenda11);
		System.out.println();

		Carro carro22 = new Carro();
		carro22.setMarca(Marca.FIAT);
		carro22.setModelo("Palio");
		carro22.setPreco(new BigDecimal(40000));

		BigDecimal valorVenda22 = vendaCarroService2.calcularValorVenda(carro22);
		System.out.println("Valor de venda Palio: " + carro22.getPreco());
		System.out.println("Valor de venda Palio com desconto: " + valorVenda22);
		System.out.println();

		Carro carro33 = new Carro();
		carro33.setMarca(Marca.CHEVROLET);
		carro33.setModelo("Celta");
		carro33.setPreco(new BigDecimal(200000));

		BigDecimal valorVenda33 = vendaCarroService2.calcularValorVenda(carro33);
		System.out.println("Valor de venda Celta: " + carro33.getPreco());
		System.out.println("Valor de venda Celta com desconto: " + valorVenda33);
	}
}
