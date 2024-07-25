package templateMethod;

import entities.VeiculoParaReparo;

public class ReparaVeiculoLuxoServiceComTemplate extends ReparoVeiculoService {

	private VeiculoParaReparo veiculoParaReparo;

	public ReparaVeiculoLuxoServiceComTemplate(VeiculoParaReparo veiculoParaReparo) {
		this.veiculoParaReparo = veiculoParaReparo;
	}

	@Override
	protected boolean veiculoParaReparo() {
		return veiculoParaReparo.getPorcentagemDano() <= 50;
	}
}
