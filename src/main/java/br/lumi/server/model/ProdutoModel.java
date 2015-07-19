package br.lumi.server.model;

import br.lumi.server.enuns.ESituacao;
import br.lumi.server.enuns.EUnidadeMedida;

public class ProdutoModel {

	Integer id;
	Integer marca;
	String descricao;
	EUnidadeMedida unidadeMedida;
	Boolean controlaVencimento;
	ESituacao situacao;
	
}
