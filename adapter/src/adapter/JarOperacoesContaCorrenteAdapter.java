package adapter;

import java.math.BigDecimal;

import jar.JarOperacoesContaCorrente;

public class JarOperacoesContaCorrenteAdapter {

	private JarOperacoesContaCorrente jarConta;

	public JarOperacoesContaCorrenteAdapter(JarOperacoesContaCorrente jarConta) {
		this.jarConta = jarConta;
	}
	
	public void saca(BigDecimal valor) {
		if (jarConta.validaSaldo(valor)) {
			jarConta.saca(valor);			
		} else {
			throw new IllegalArgumentException("Valor para saque não permitido.");
		}
	}
	
	public void deposita(BigDecimal valor) {
		jarConta.deposita(valor);
	}
}
