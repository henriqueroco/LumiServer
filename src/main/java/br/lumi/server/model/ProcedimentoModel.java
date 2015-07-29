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
@Table(name = ProcedimentoModel.TABELA)
public class ProcedimentoModel implements Serializable  {

	static final String TABELA = "procedimento";
	static final String ATRIBUTO_ID = "id";
	private static final String SEQUENCE_ID = "seq_id_procedimento";
	private static final String ATRIBUTO_DESCRICAO = "descricao";
	private static final String ATRIBUTO_TEMPO = "tempo";
	private static final String ATRIBUTO_COMPLEMENTO = "complemento";
	
	@Id
	@GeneratedValue(generator = ProcedimentoModel.SEQUENCE_ID)
	@GenericGenerator(name = ProcedimentoModel.SEQUENCE_ID, 
		strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {
			@Parameter(name = "sequence_name", value = ProcedimentoModel.SEQUENCE_ID),
			@Parameter(name = "optimizer", value = "hilo"),
			@Parameter(name = "increment_size", value = "1") })
	@Column(name = ATRIBUTO_ID, nullable = false, unique = true)
	private Integer id;
	
	@Column(name = ATRIBUTO_DESCRICAO, nullable = false)
	private String descricao;
	
	@Column(name = ATRIBUTO_TEMPO, nullable = false)
	private Long tempo;
	
	@Column(name = ATRIBUTO_COMPLEMENTO, nullable = false)
	private String complemento;

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

	public Long getTempo() {
		return tempo;
	}

	public void setTempo(Long tempo) {
		this.tempo = tempo;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
}
