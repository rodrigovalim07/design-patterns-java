package app;

import java.math.BigDecimal;

import adapter.ClientJarOperacoesContaCorrenteAdapter;
import adapter.JarOperacoesContaCorrenteAdapter;
import jar.JarOperacoesContaCorrente;

public class Programa {

	public static void main(String[] args) {
//		JarOperacoesContaCorrente jarConta = new JarOperacoesContaCorrente();
//		ClientJarOperacoesContaCorrente client = new ClientJarOperacoesContaCorrente(jarConta);
//		
//		BigDecimal valorPretendidoSaque = new BigDecimal(1000);
//		if(client.validaSaldo(valorPretendidoSaque)) {
//			client.saca(valorPretendidoSaque);
//		}
//		
//		client.deposita(new BigDecimal(500));
		
		// com adapter
		
		JarOperacoesContaCorrente jarConta = new JarOperacoesContaCorrente();
		JarOperacoesContaCorrenteAdapter jarContaAdapter = new JarOperacoesContaCorrenteAdapter(jarConta);
		ClientJarOperacoesContaCorrenteAdapter client = new ClientJarOperacoesContaCorrenteAdapter(jarContaAdapter);
		
		BigDecimal valorPretendidoSaque = new BigDecimal(1000);
		
		client.saca(valorPretendidoSaque);
		
		client.deposita(new BigDecimal(500));
	}
}
