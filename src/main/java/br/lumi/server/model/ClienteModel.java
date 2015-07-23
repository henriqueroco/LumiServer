package br.lumi.server.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Entity;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import br.lumi.server.enuns.EEstadoCivil;

@Entity
@Table(name = ClienteModel.TABELA)
public class ClienteModel {
	
	static final String TABELA = "cliente";
	static final String ATRIBUTO_ID = "cpf_id";
	private static final String SEQUENCE_ID = "seq_id_cliente";
	private static final String ATRIBUTO_DATA_CADASTRO = "data_cadastro";
	
	@Id
	@GeneratedValue(generator = ClienteModel.SEQUENCE_ID)
	@GenericGenerator(name = ClienteModel.SEQUENCE_ID, 
		strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {
			@Parameter(name = "sequence_name", value = ClienteModel.SEQUENCE_ID),
			@Parameter(name = "optimizer", value = "hilo"),
			@Parameter(name = "increment_size", value = "1") })
	@Column(name = ATRIBUTO_ID, nullable = false, unique = true)
	String cpf;
	
	String nome;
	
	Date dataNascimento;
	
	Integer idade;
	
	Integer sexo;
	
	@Temporal(TemporalType.DATE)
	@Column(name = ATRIBUTO_DATA_CADASTRO, nullable = false)
	Date dataCadastro;
	
	String telefone;
	
	String celular;
	
	@OneToOne(mappedBy = "convenio", cascade = CascadeType.ALL, orphanRemoval = true)
	LogradouroModel logradouro;
	
	String ocupacao;
	
	EEstadoCivil estadoCivil;
	
	String nomeAvisoEmergencia;
	
	String telefoneEmergencia;
	
}
