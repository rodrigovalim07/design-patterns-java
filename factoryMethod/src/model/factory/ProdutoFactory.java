package model.factory;

import model.entities.Produto;
import model.entities.ProdutoDigital;
import model.entities.ProdutoFisico;
import model.enums.TipoProdutoEnum;

public class ProdutoFactory {

	public static Produto getInstance(TipoProdutoEnum tipoProdutoEnum) {
		
		switch (tipoProdutoEnum) {
		
			case FISICO:
				ProdutoFisico produtoFisico = new ProdutoFisico();
				produtoFisico.setPossuiDimensoesFisicas(true);
				return produtoFisico;
				
			case DIGITAL:
				ProdutoDigital produtoDigital = new ProdutoDigital();
				produtoDigital.setPossuiDimensoesFisicas(false);
				return produtoDigital;
				
			default:
				throw new IllegalArgumentException("Tipo de produto desconhecido.");
		}
	}
}
