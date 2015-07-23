package br.lumi.server.model;

import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

public class LogradouroModel {

	private static final String ATRIBUTO_ID = "id";
	
	String cep;
	String endereco;
	Integer numero;
	String complemento;
	CidadeModel cidade;
	String bairro;
	
	@OneToOne(optional = false)
	@JoinColumn(name = LogradouroModel.ATRIBUTO_ID, nullable = false)
	@MapsId("idCliente")
	ClienteModel clietne;
	
}
