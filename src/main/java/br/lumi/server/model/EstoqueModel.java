package br.lumi.server.model;

import java.util.Date;

public class EstoqueModel {

	Integer id;
	ProdutoModel produto;
	Double quantidade;
	Date dataEntrada;
	Date dataUltimaMovimentacao;
	Date dataVencimento;
	
}
