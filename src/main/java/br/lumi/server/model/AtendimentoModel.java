package br.lumi.server.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import br.lumi.server.enuns.ESituacaoAtendimento;

@Entity
@Table(name = AtendimentoModel.TABELA)
public class AtendimentoModel implements Serializable {

	static final String TABELA = "atendimento";
	static final String ATRIBUTO_ID = "id";
	private static final String SEQUENCE_ID = "seq_id_atendimento";
	private static final String ATRIBUTO_SITUACAO = "situacao";
	private static final String ATRIBUTO_ESTETICISTA = "id_esteticista";
	private static final String ATRIBUTO_PROCEDIMENTO = "_id_procedimento";
	private static final String ATRIBUTO_CLIENTE = "is_cliente";
	private static final String ATRIBUTO_HORAFIM = "hora_fim";
	private static final String ATRIBUTO_HORAINICIO = "hora_inicio";
	private static final String ATRIBUTO_DATA = "data";

	@Id
	@GeneratedValue(generator = AtendimentoModel.SEQUENCE_ID)
	@GenericGenerator(name = AtendimentoModel.SEQUENCE_ID, strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {
			@Parameter(name = "sequence_name", value = AtendimentoModel.SEQUENCE_ID),
			@Parameter(name = "optimizer", value = "hilo"),
			@Parameter(name = "increment_size", value = "1") })
	@Column(name = ATRIBUTO_ID, nullable = false, unique = true)
	private Integer id;

	@Temporal(TemporalType.DATE)
	@Column(name = ATRIBUTO_DATA, nullable = false)
	private Date dataAtendimento;

	@Column(name = ATRIBUTO_HORAINICIO, nullable = false)
	private Integer horaInicio;

	@Column(name = ATRIBUTO_HORAFIM, nullable = false)
	private Integer horaFim;

	@Column(name = ATRIBUTO_CLIENTE, nullable = false)
	private ClienteModel cliente;

	@Column(name = ATRIBUTO_PROCEDIMENTO, nullable = false)
	private ProcedimentoModel procedimento;

	@Column(name = ATRIBUTO_ESTETICISTA, nullable = false)
	private EsteticistaModel esteticista;

	@Column(name = ATRIBUTO_SITUACAO, nullable = false)
	private ESituacaoAtendimento situacao;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDataAtendimento() {
		return dataAtendimento;
	}

	public void setDataAtendimento(Date dataAtendimento) {
		this.dataAtendimento = dataAtendimento;
	}

	public Integer getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(Integer horaInicio) {
		this.horaInicio = horaInicio;
	}

	public Integer getHoraFim() {
		return horaFim;
	}

	public void setHoraFim(Integer horaFim) {
		this.horaFim = horaFim;
	}

	public ClienteModel getCliente() {
		return cliente;
	}

	public void setCliente(ClienteModel cliente) {
		this.cliente = cliente;
	}

	public ProcedimentoModel getProcedimento() {
		return procedimento;
	}

	public void setProcedimento(ProcedimentoModel procedimento) {
		this.procedimento = procedimento;
	}

	public EsteticistaModel getEsteticista() {
		return esteticista;
	}

	public void setEsteticista(EsteticistaModel esteticista) {
		this.esteticista = esteticista;
	}

	public ESituacaoAtendimento getSituacao() {
		return situacao;
	}

	public void setSituacao(ESituacaoAtendimento situacao) {
		this.situacao = situacao;
	}
}
