package services;

import entities.VeiculoParaReparo;

public class ReparaVeiculoComumService {

	private VeiculoParaReparo veiculoParaReparo;

	public ReparaVeiculoComumService(VeiculoParaReparo veiculoParaReparo) {
		this.veiculoParaReparo = veiculoParaReparo;
	}
	
	public void repararVeiculo() {
		entradaOficina();
		analisarDanos();
		if (veiculoParaReparo()) {
			reparaVeiculo();
			notificarReparoParaSeguradora();
		} else {
			notificarPerdaTotalParaSeguradora();
		}
	}
	
	private void notificarPerdaTotalParaSeguradora() {
		System.out.println("Notificando perda total para seguradora...");
	}

	private void notificarReparoParaSeguradora() {
		System.out.println("Notificando reparo para seguradora...");
	}

	private void reparaVeiculo() {
		System.out.println("Reparando veículo...");
	}

	private void analisarDanos() {
		System.out.println("Analisando danos...");
	}

	private void entradaOficina() {
		System.out.println("Veículo entrando na oficina...");
	}

	private boolean veiculoParaReparo() {
		return veiculoParaReparo.getPorcentagemDano() <= 70;
	}

	public VeiculoParaReparo getVeiculoParaReparo() {
		return veiculoParaReparo;
	}

	public void setVeiculoParaReparo(VeiculoParaReparo veiculoParaReparo) {
		this.veiculoParaReparo = veiculoParaReparo;
	}
}
