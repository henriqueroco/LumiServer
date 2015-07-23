package br.lumi.server.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name = LogradouroModel.TABELA)
public class LogradouroModel {

	static final String TABELA = "logradouro";
	static final String ATRIBUTO_ID = "id";
	private static final String SEQUENCE_ID = "seq_id_logradouro";
	private static final String ATRIBUTO_CEP = "";
	private static final String ATRIBUTO_ENDERECO = "";
	private static final String ATRIBUTO_NUMERO = "";
	private static final String ATRIBUTO_COMPLEMENTO = "";
	private static final String ATRIBUTO_BAIRRO = "";
	
	@Id
	@GeneratedValue(generator = LogradouroModel.SEQUENCE_ID)
	@GenericGenerator(name = LogradouroModel.SEQUENCE_ID, 
		strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {
			@Parameter(name = "sequence_name", value = LogradouroModel.SEQUENCE_ID),
			@Parameter(name = "optimizer", value = "hilo"),
			@Parameter(name = "increment_size", value = "1") })
	@Column(name = ATRIBUTO_ID, nullable = false, unique = true)
	Integer id;
	
	@Column(name = ATRIBUTO_CEP, nullable = false)
	String cep;
	
	@Column(name = ATRIBUTO_ENDERECO)
	String endereco;
	
	@Column(name = ATRIBUTO_NUMERO)
	Integer numero;
	
	@Column(name = ATRIBUTO_COMPLEMENTO)
	String complemento;
	
	@Column(name = ATRIBUTO_BAIRRO)
	String bairro;
	
	@OneToOne(optional = false)
	@JoinColumn(name = LogradouroModel.ATRIBUTO_ID, nullable = false)
	@MapsId("idCliente")
	ClienteModel clietne;
	
//	@Column(name = ATRIBUTO_
	CidadeModel cidade;
}
