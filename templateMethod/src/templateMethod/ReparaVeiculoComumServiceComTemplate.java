package templateMethod;

import entities.VeiculoParaReparo;

public class ReparaVeiculoComumServiceComTemplate extends ReparoVeiculoService {

	private VeiculoParaReparo veiculoParaReparo;

	public ReparaVeiculoComumServiceComTemplate(VeiculoParaReparo veiculoParaReparo) {
		this.veiculoParaReparo = veiculoParaReparo;
	}

	@Override
	protected boolean veiculoParaReparo() {
		return veiculoParaReparo.getPorcentagemDano() <= 70;
	}

	@Override
	protected void notificarPerdaTotalParaSeguradora() {
		System.out.println("Infelizmente, o seu carro popular não irá mais andar.");;
	}


}
