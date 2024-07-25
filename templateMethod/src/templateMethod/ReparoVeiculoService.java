package templateMethod;

public abstract class ReparoVeiculoService {
	
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
	
	protected void notificarPerdaTotalParaSeguradora() {
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

	protected abstract boolean veiculoParaReparo();
}
