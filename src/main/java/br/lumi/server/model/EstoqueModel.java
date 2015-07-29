package br.lumi.server.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name = EstoqueModel.TABELA)
public class EstoqueModel implements Serializable {

	static final String TABELA = "estoque";
	static final String ATRIBUTO_ID = "id";
	private static final String SEQUENCE_ID = "seq_id_estoque";
	private static final String ATRIBUTO_ID_PRODUTO = "id_produto";
	private static final String ATRIBUTO_QUANTIDADE = "quantidade";
	private static final String ATRIBUTO_DATA_ENTRADA = "data_entrada";
	private static final String ATRIBUTO_DATA_ULTIMA_MOVIMENTACAO = "date_ultima_movimentacao";
	private static final String ATRIBUTO_DATA_VENCIMENTO = "data_vencimento";

	@Id
	@GeneratedValue(generator = EstoqueModel.SEQUENCE_ID)
	@GenericGenerator(name = EstoqueModel.SEQUENCE_ID, strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {
			@Parameter(name = "sequence_name", value = EstoqueModel.SEQUENCE_ID),
			@Parameter(name = "optimizer", value = "hilo"),
			@Parameter(name = "increment_size", value = "1") })
	@Column(name = ATRIBUTO_ID, nullable = false, unique = true)
	private Integer id;
	
	@OneToOne(optional = false)
	@JoinColumn(name = ATRIBUTO_ID_PRODUTO, nullable = false)
	@MapsId("id_produto")
	private ProdutoModel produto;
	
	@Column(name = ATRIBUTO_QUANTIDADE, nullable = false)
	private Double quantidade;
	
	@Temporal(TemporalType.DATE)
	@Column(name = ATRIBUTO_DATA_ENTRADA, nullable = false)
	private Date dataEntrada;
	
	@Temporal(TemporalType.DATE)
	@Column(name = ATRIBUTO_DATA_ULTIMA_MOVIMENTACAO, nullable = false)
	private Date dataUltimaMovimentacao;
	
	@Temporal(TemporalType.DATE)
	@Column(name = ATRIBUTO_DATA_VENCIMENTO)
	private Date dataVencimento;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public ProdutoModel getProduto() {
		return produto;
	}

	public void setProduto(ProdutoModel produto) {
		this.produto = produto;
	}

	public Double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Double quantidade) {
		this.quantidade = quantidade;
	}

	public Date getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(Date dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public Date getDataUltimaMovimentacao() {
		return dataUltimaMovimentacao;
	}

	public void setDataUltimaMovimentacao(Date dataUltimaMovimentacao) {
		this.dataUltimaMovimentacao = dataUltimaMovimentacao;
	}

	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
}
