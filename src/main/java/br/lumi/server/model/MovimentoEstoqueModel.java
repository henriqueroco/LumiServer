package br.lumi.server.model;

import java.util.Date;

import br.lumi.server.enuns.ETipoMovimentacao;

public class MovimentoEstoqueModel {

	Integer id;
	ETipoMovimentacao tipo;
	Date dataMovimentacao;
	ProdutoModel produto;
	AtendimentoModel atendimento;
	
}
