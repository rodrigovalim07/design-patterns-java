package adapter;

import java.math.BigDecimal;

public class ClientJarOperacoesContaCorrenteAdapter {


	private JarOperacoesContaCorrenteAdapter jarAdapter;

	public ClientJarOperacoesContaCorrenteAdapter(JarOperacoesContaCorrenteAdapter jarAdapter) {
		this.jarAdapter = jarAdapter;
	}
	
	public void saca(BigDecimal valor) {
		jarAdapter.saca(valor);
	}
	
	public void deposita(BigDecimal valor) {
		jarAdapter.deposita(valor);
	}
}
