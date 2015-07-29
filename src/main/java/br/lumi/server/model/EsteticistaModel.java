package br.lumi.server.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import br.lumi.server.enuns.ESituacao;

@Entity
@Table(name = EsteticistaModel.TABELA)
public class EsteticistaModel implements Serializable {

	static final String TABELA = "esteticista";
	static final String ATRIBUTO_ID = "id";
	private static final String SEQUENCE_ID = "seq_id_esteticista";
	private static final String ATRIBUTO_NOME = "nome";
	private static final String ATRIBUTO_TELEFONE = "telefone";
	private static final String ATRIBUTO_SITAUCAO = "situacao";
	
	@Id
	@GeneratedValue(generator = EsteticistaModel.SEQUENCE_ID)
	@GenericGenerator(name = EsteticistaModel.SEQUENCE_ID, 
		strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {
			@Parameter(name = "sequence_name", value = EsteticistaModel.SEQUENCE_ID),
			@Parameter(name = "optimizer", value = "hilo"),
			@Parameter(name = "increment_size", value = "1") })
	@Column(name = ATRIBUTO_ID, nullable = false, unique = true)
	private Integer id;
	
	@Column(name = ATRIBUTO_NOME, nullable = false)
	private String nome;
	
	@Column(name = ATRIBUTO_TELEFONE, nullable = false)
	private String telefone;
	
	@Column(name = ATRIBUTO_SITAUCAO, nullable = false)
	private ESituacao situacao;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public ESituacao getSituacao() {
		return situacao;
	}

	public void setSituacao(ESituacao situacao) {
		this.situacao = situacao;
	}
}
