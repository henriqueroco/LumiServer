package br.lumi.server.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Entity;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import br.lumi.server.enuns.ETipoMovimentacao;

@Entity
@Table(name = MovimentoEstoqueModel.TABELA)
public class MovimentoEstoqueModel implements Serializable {

	static final String TABELA = "movimento_estoque";
	static final String ATRIBUTO_ID = "id";
	private static final String SEQUENCE_ID = "seq_id_movimento";
	private static final String ATRIBUTO_DATA_MOVIMENTACAO = "data_movimentacao";
	private static final String ATRIBUTO_TIPO = "tipo";
	
	@Id
	@GeneratedValue(generator = MovimentoEstoqueModel.SEQUENCE_ID)
	@GenericGenerator(name = MovimentoEstoqueModel.SEQUENCE_ID, 
		strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {
			@Parameter(name = "sequence_name", value = MovimentoEstoqueModel.SEQUENCE_ID),
			@Parameter(name = "optimizer", value = "hilo"),
			@Parameter(name = "increment_size", value = "1") })
	@Column(name = ATRIBUTO_ID, nullable = false, unique = true)
	private Integer id;
	
	@Column(name = ATRIBUTO_TIPO, nullable = false)
	private ETipoMovimentacao tipo;
	
	@Temporal(TemporalType.DATE)
	@Column(name = ATRIBUTO_DATA_MOVIMENTACAO, nullable = false)
	private Date dataMovimentacao;
	
	
	private ProdutoModel produto;
	
	private AtendimentoModel atendimento;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public ETipoMovimentacao getTipo() {
		return tipo;
	}

	public void setTipo(ETipoMovimentacao tipo) {
		this.tipo = tipo;
	}

	public Date getDataMovimentacao() {
		return dataMovimentacao;
	}

	public void setDataMovimentacao(Date dataMovimentacao) {
		this.dataMovimentacao = dataMovimentacao;
	}

	public ProdutoModel getProduto() {
		return produto;
	}

	public void setProduto(ProdutoModel produto) {
		this.produto = produto;
	}

	public AtendimentoModel getAtendimento() {
		return atendimento;
	}

	public void setAtendimento(AtendimentoModel atendimento) {
		this.atendimento = atendimento;
	}
}
