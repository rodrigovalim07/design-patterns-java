package reajuste;

import entities.Funcionario;

public class ReajusteAnualSalarioComStrategy {

	public void calcularReajusteAnual(Funcionario funcionario, CalculadorReajusteAnualSalario calculador) {
		calculador.calcularReajusteAnual(funcionario);
	}
}
