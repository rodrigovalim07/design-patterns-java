package app;

import java.math.BigDecimal;

import entities.Funcionario;
import enums.TipoContratacaoEnum;
import reajuste.CalculadorReajusteAnualSalarioCLT;
import reajuste.CalculadorReajusteAnualSalarioCooperativa;
import reajuste.CalculadorReajusteAnualSalarioEstagio;
import reajuste.CalculadorReajusteAnualSalarioPJ;
import reajuste.ReajusteAnualSalario;
import reajuste.ReajusteAnualSalarioComStrategy;

public class Programa {

	public static void main(String[] args) {
		ReajusteAnualSalario reajusteAnualSalario = new ReajusteAnualSalario();

		Funcionario funcionarioCLT = new Funcionario();
		funcionarioCLT.setNome("Vitor");
		funcionarioCLT.setTipoContratacao(TipoContratacaoEnum.CLT);
		funcionarioCLT.setSalario(new BigDecimal(5000));

		Funcionario funcionarioPJ = new Funcionario();
		funcionarioPJ.setNome("Rafael");
		funcionarioPJ.setTipoContratacao(TipoContratacaoEnum.PJ);
		funcionarioPJ.setSalario(new BigDecimal(10000));

		Funcionario funcionarioEstagio = new Funcionario();
		funcionarioEstagio.setNome("Osvaldo");
		funcionarioEstagio.setTipoContratacao(TipoContratacaoEnum.ESTAGIO);
		funcionarioEstagio.setSalario(new BigDecimal(15000));
		
		Funcionario funcionarioCooperativa = new Funcionario();
		funcionarioCooperativa.setNome("Georgina");
		funcionarioCooperativa.setTipoContratacao(TipoContratacaoEnum.COOPERATIVA);
		funcionarioCooperativa.setSalario(new BigDecimal(7500));

		reajusteAnualSalario.calcularReajusteAnual(funcionarioCLT);
		reajusteAnualSalario.calcularReajusteAnual(funcionarioPJ);
		reajusteAnualSalario.calcularReajusteAnual(funcionarioEstagio);

		System.out.println(funcionarioCLT);
		System.out.println(funcionarioPJ);
		System.out.println(funcionarioEstagio);

		// com strategy

		ReajusteAnualSalarioComStrategy reajusteSalarioStrategy = new ReajusteAnualSalarioComStrategy();

		reajusteSalarioStrategy.calcularReajusteAnual(funcionarioCLT, new CalculadorReajusteAnualSalarioCLT());
		reajusteSalarioStrategy.calcularReajusteAnual(funcionarioPJ, new CalculadorReajusteAnualSalarioPJ());
		reajusteSalarioStrategy.calcularReajusteAnual(funcionarioEstagio, new CalculadorReajusteAnualSalarioEstagio());
		reajusteSalarioStrategy.calcularReajusteAnual(funcionarioCooperativa, new CalculadorReajusteAnualSalarioCooperativa());

		System.out.println(funcionarioCLT);
		System.out.println(funcionarioPJ);
		System.out.println(funcionarioEstagio);
		System.out.println(funcionarioCooperativa);
	}
}
