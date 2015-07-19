package br.lumi.server.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "marca")
public class MarcaModel {

	@Id
	Integer id;
	String descricao;
	Long pontos;
	
}
