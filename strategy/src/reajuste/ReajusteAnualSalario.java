package reajuste;

import java.math.BigDecimal;

import entities.Funcionario;
import enums.TipoContratacaoEnum;

public class ReajusteAnualSalario {

	public void calcularReajusteAnual(Funcionario funcionario) {
		
		if (TipoContratacaoEnum.CLT.name().equals(funcionario.getTipoContratacao().name())) {
			BigDecimal salario = funcionario.getSalario();
			funcionario.setSalario(salario.add(salario.multiply(new BigDecimal(0.10))));
		}
		else if (TipoContratacaoEnum.PJ.name().equals(funcionario.getTipoContratacao().name())) {
			BigDecimal salario = funcionario.getSalario();
			funcionario.setSalario(salario.add(salario.multiply(new BigDecimal(0.05))));
		}
		else if (TipoContratacaoEnum.ESTAGIO.name().equals(funcionario.getTipoContratacao().name())) {
			BigDecimal salario = funcionario.getSalario();
			funcionario.setSalario(salario.add(salario.multiply(new BigDecimal(0.02))));
		}
	}
}
