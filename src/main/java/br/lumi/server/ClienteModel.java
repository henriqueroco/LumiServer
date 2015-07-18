package br.lumi.server;

import javax.persistence.Table;

import org.hibernate.annotations.Entity;

@Entity
@Table(name = "cliente")
public class ClienteModel {

	
	String cpf;
	String nome;
	String telefone;
	int sexo;
	String cidade;
	EUf uf;
	String logradouro;

}
