package app;

import entities.VeiculoParaReparo;
import services.ReparaVeiculoComumService;
import services.ReparaVeiculoDeLuxoService;
import templateMethod.ReparaVeiculoComumServiceComTemplate;
import templateMethod.ReparaVeiculoLuxoServiceComTemplate;
import templateMethod.ReparoVeiculoService;

public class Programa {

	public static void main(String[] args) {
		System.out.println("------------------ LUXO ------------------");

		VeiculoParaReparo veiculoDeluxo = new VeiculoParaReparo();
		veiculoDeluxo.setPorcentagemDano(50);
		
		ReparaVeiculoDeLuxoService rpl = new ReparaVeiculoDeLuxoService(veiculoDeluxo);
		
		rpl.repararVeiculo();
		
		System.out.println("----------------- COMUM -------------------");
		
		VeiculoParaReparo veiculoComum = new VeiculoParaReparo();
		veiculoComum.setPorcentagemDano(71);
		
		ReparaVeiculoComumService rpc = new ReparaVeiculoComumService(veiculoComum);
		
		rpc.repararVeiculo();
		
		System.out.println();
		System.out.println("--------------- Com Template Method -------------------");
		System.out.println();
		
		System.out.println("----------------- LUXO -------------------");
		
		VeiculoParaReparo veiculoDeluxo2 = new VeiculoParaReparo();
		veiculoDeluxo2.setPorcentagemDano(15);
		
		ReparoVeiculoService rpl2 = new ReparaVeiculoLuxoServiceComTemplate(veiculoDeluxo2);
		
		rpl2.repararVeiculo();
		
		System.out.println("----------------- COMUM -------------------");
		
		VeiculoParaReparo veiculoComum2 = new VeiculoParaReparo();
		veiculoComum2.setPorcentagemDano(80);
		
		ReparoVeiculoService rpc2 = new ReparaVeiculoComumServiceComTemplate(veiculoComum2);
		
		rpc2.repararVeiculo();
	}
}
