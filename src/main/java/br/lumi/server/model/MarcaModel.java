package br.lumi.server.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name = MarcaModel.TABELA)
public class MarcaModel implements Serializable {

	static final String TABELA = "marca";
	static final String ATRIBUTO_ID = "id";
	private static final String SEQUENCE_ID = "seq_id_marca";
	private static final String ATRIBUTO_PONTOS = "pontos";
	private static final String ATRIBUTO_DESCRICAO = "descricao";
	
	@Id
	@GeneratedValue(generator = MarcaModel.SEQUENCE_ID)
	@GenericGenerator(name = MarcaModel.SEQUENCE_ID, 
		strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {
			@Parameter(name = "sequence_name", value = MarcaModel.SEQUENCE_ID),
			@Parameter(name = "optimizer", value = "hilo"),
			@Parameter(name = "increment_size", value = "1") })
	@Column(name = ATRIBUTO_ID, nullable = false, unique = true)
	private Integer id;
	
	@Column(name = ATRIBUTO_DESCRICAO, nullable = false)
	private String descricao;
	
	@Column(name = ATRIBUTO_PONTOS)
	private Long pontos;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Long getPontos() {
		return pontos;
	}

	public void setPontos(Long pontos) {
		this.pontos = pontos;
	}
}
