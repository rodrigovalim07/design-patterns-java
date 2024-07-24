package jar;

import java.math.BigDecimal;

public class ClientJarOperacoesContaCorrente {

	private JarOperacoesContaCorrente jocc;

	public ClientJarOperacoesContaCorrente(JarOperacoesContaCorrente jocc) {
		this.jocc = jocc;
	}
	
	public boolean validaSaldo(BigDecimal valor) {
		return jocc.validaSaldo(valor);
	}
	
	public void saca(BigDecimal valor) {
		jocc.saca(valor);
	}
	
	public void deposita(BigDecimal valor) {
		jocc.deposita(valor);
	}
}
