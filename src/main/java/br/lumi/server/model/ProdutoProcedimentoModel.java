package br.lumi.server.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = ProdutoProcedimentoModel.TABELA)
public class ProdutoProcedimentoModel implements Serializable{

	static final String TABELA = "produto_por_procedimento";

	private static final String ATRIBUTO_PRODUTO = "id_produto";
	private static final String ATRIBUTO_PROCEDIMENTO = "id_procedimento";
	private static final String ATRIBUTO_QUANTIDADE_SUGERIDA = "quantidade_sugerida";
	
	
	
	private ProdutoModel produto;
	
	private ProcedimentoModel procedimento;
	
	@Column(name = ATRIBUTO_QUANTIDADE_SUGERIDA, nullable = false)
	private Double quantidadeSugerida;
	
}
