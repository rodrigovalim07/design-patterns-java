package app;

import model.entities.Produto;
import model.enums.TipoProdutoEnum;
import model.factory.ProdutoFactory;

public class Programa {

	public static void main(String[] args) {
		
		// a factory ja faz o set no tipo do produto
		Produto produtoFisico = ProdutoFactory.getInstance(TipoProdutoEnum.FISICO);
		Produto produtoDigital = ProdutoFactory.getInstance(TipoProdutoEnum.DIGITAL);

		System.out.println(produtoFisico);
		System.out.println(produtoDigital);
	}

}
