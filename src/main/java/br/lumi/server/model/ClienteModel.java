package br.lumi.server.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Entity;

import br.lumi.server.enuns.EEstadoCivil;
import br.lumi.server.enuns.EUf;

@Entity
@Table(name = "cliente")
public class ClienteModel {
	
	@Id
	@Column(name = "cpf", nullable = false)
	String cpf;
	String nome;
	Date dataNascimento;
	Integer idade;
	Integer sexo;
	Date dataCadastro;
	String telefone;
	String celular;
	LogradouroModel logradouro;
	String ocupacao;
	EEstadoCivil estadoCivil;
	String nomeAvisoEmergencia;
	String telefoneEmergencia;
	
}
