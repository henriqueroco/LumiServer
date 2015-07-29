package br.lumi.server.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import br.lumi.server.enuns.ESituacao;
import br.lumi.server.enuns.EUnidadeMedida;

@Entity
@Table(name = ProdutoModel.TABELA)
public class ProdutoModel implements Serializable {

	static final String TABELA = "produto";
	static final String ATRIBUTO_ID = "id";
	private static final String SEQUENCE_ID = "seq_id_produto";
	private static final String ATRIBUTO_MARCA = "id_marca";
	private static final String ATRIBUTO_DESCRICAO = "descricao";
	private static final String ATRIBUTO_UNIDADE_MEDIDA = "unidade_medida";
	private static final String ATRIBUTO_CONTROLA_VENCIMENTO = "controla_vencimento";
	private static final String ATRIBUTO_SITUACAO = "sitaucao";

	@Id
	@GeneratedValue(generator = ProdutoModel.SEQUENCE_ID)
	@GenericGenerator(name = ProdutoModel.SEQUENCE_ID, strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {
			@Parameter(name = "sequence_name", value = ProdutoModel.SEQUENCE_ID),
			@Parameter(name = "optimizer", value = "hilo"),
			@Parameter(name = "increment_size", value = "1") })
	@Column(name = ATRIBUTO_ID, nullable = false, unique = true)
	private Integer id;

	@Column(name = ATRIBUTO_MARCA, nullable = false)
	private MarcaModel marca;

	@Column(name = ATRIBUTO_DESCRICAO, nullable = false)
	private String descricao;

	@Column(name = ATRIBUTO_UNIDADE_MEDIDA, nullable = false)
	private EUnidadeMedida unidadeMedida;

	@Column(name = ATRIBUTO_CONTROLA_VENCIMENTO, nullable = false)
	private Boolean controlaVencimento;

	@Column(name = ATRIBUTO_SITUACAO, nullable = false)
	private ESituacao situacao;
	
	@OneToOne(mappedBy = "produto", cascade = CascadeType.ALL, orphanRemoval = true)
	private EstoqueModel estoque;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public MarcaModel getMarca() {
		return marca;
	}

	public void setMarca(MarcaModel marca) {
		this.marca = marca;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public EUnidadeMedida getUnidadeMedida() {
		return unidadeMedida;
	}

	public void setUnidadeMedida(EUnidadeMedida unidadeMedida) {
		this.unidadeMedida = unidadeMedida;
	}

	public Boolean getControlaVencimento() {
		return controlaVencimento;
	}

	public void setControlaVencimento(Boolean controlaVencimento) {
		this.controlaVencimento = controlaVencimento;
	}

	public ESituacao getSituacao() {
		return situacao;
	}

	public void setSituacao(ESituacao situacao) {
		this.situacao = situacao;
	}
}
