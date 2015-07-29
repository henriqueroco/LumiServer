package br.lumi.server.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Entity;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import br.lumi.server.enuns.EPais;
import br.lumi.server.enuns.EUf;

@Entity
@Table(name = CidadeModel.TABELA)
public class CidadeModel implements Serializable {

	static final String TABELA = "cidade";
	static final String ATRIBUTO_ID = "id";
	private static final String SEQUENCE_ID = "seq_id_cidade";
	private static final String ATRIBUTO_NOME = "nome";
	private static final String ATRIBUTO_ESTADO = "estado";
	private static final String ATRIBUTO_PAIS = "pais";
	
	@Id
	@GeneratedValue(generator = CidadeModel.SEQUENCE_ID)
	@GenericGenerator(name = CidadeModel.SEQUENCE_ID, 
		strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {
			@Parameter(name = "sequence_name", value = CidadeModel.SEQUENCE_ID),
			@Parameter(name = "optimizer", value = "hilo"),
			@Parameter(name = "increment_size", value = "1") })
	@Column(name = ATRIBUTO_ID, nullable = false, unique = true)
	private Integer id;
	
	@Column(name = ATRIBUTO_NOME, nullable = false)
	private String nome;
	
	@Column(name = ATRIBUTO_ESTADO, nullable = false)
	private EUf estado;
	
	@Column(name = ATRIBUTO_PAIS, nullable = false)
	private EPais pais;

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

	public EUf getEstado() {
		return estado;
	}

	public void setEstado(EUf estado) {
		this.estado = estado;
	}

	public EPais getPais() {
		return pais;
	}

	public void setPais(EPais pais) {
		this.pais = pais;
	}
}
