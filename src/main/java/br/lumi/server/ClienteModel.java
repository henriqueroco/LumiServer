package br.lumi.server;

import org.hibernate.annotations.Entity;
import org.hibernate.annotations.Table;
import org.hibernate.annotations.Tables;

@Entity
@Tables(name = "cliente")
public class ClienteModel {

	
	String cpf;
	String nome;
	String telefone;
	int sexo;
	String cidade;
	EUf uf;
	String logradouro;

}
