package br.lumi.server.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import br.lumi.server.enuns.ESituacaoAtendimento;

@Entity
@Table(name = "atendimento")
public class AtendimentoModel {

	@id
	Integer id;
	Date dataAtendimento;
	Integer horaInicio;
	Integer horaFim;
	ClienteModel cliente;
	ProcedimentoModel procedimento;
	EsteticistaModel esteticista;
	ESituacaoAtendimento situacao;
	
}
