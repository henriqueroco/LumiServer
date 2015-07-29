package br.lumi.server.model;

/**
 * @author WEIBER
 */
import java.io.Serializable;
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
import br.lumi.server.enuns.ESexo;

@Entity
@Table(name = ClienteModel.TABELA)
public class ClienteModel implements Serializable {
	
	static final String TABELA = "cliente";
	static final String ATRIBUTO_ID = "cpf_id";
	private static final String SEQUENCE_ID = "seq_id_cliente";
	private static final String ATRIBUTO_DATA_CADASTRO = "data_cadastro";
	private static final String ATRIBUTO_NOME = "nome";
	private static final String ATRIBUTO_DATA_NACIMENTO = "data_nacimento";
	private static final String ATRIBUTO_IDADE = "idade";
	private static final String ATRIBUTO_SEXO = "sexo";
	private static final String ATRIBUTO_TELEFONE = "telefone";
	private static final String ATRIBUTO_CELULAR = "celular";
	private static final String ATRIBUTO_OCUPACAO = "ocupacao";
	private static final String ATRIBUTO_ESTADO_CIVIL = "estado_civil";
	private static final String ATRIBUTO_NOME_AVISO_EMERGENCIA = "avisar";
	private static final String ATRIBUTO_TELEFONE_EMERGENCIA = "telefone_avisar";
	
	@Id
	@GeneratedValue(generator = ClienteModel.SEQUENCE_ID)
	@GenericGenerator(name = ClienteModel.SEQUENCE_ID, 
		strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {
			@Parameter(name = "sequence_name", value = ClienteModel.SEQUENCE_ID),
			@Parameter(name = "optimizer", value = "hilo"),
			@Parameter(name = "increment_size", value = "1") })
	@Column(name = ATRIBUTO_ID, nullable = false, unique = true)
	private String cpf;
	
	@Column(name = ATRIBUTO_NOME, nullable = false)
	private String nome;
	
	@Temporal(TemporalType.DATE)
	@Column(name = ATRIBUTO_DATA_NACIMENTO, nullable = false)
	private Date dataNacimento;
	
	@Column(name = ATRIBUTO_IDADE, nullable = false)
	private Integer idade;
	
	@Column(name = ATRIBUTO_SEXO, nullable = false)
	private ESexo sexo;
	
	@Temporal(TemporalType.DATE)
	@Column(name = ATRIBUTO_DATA_CADASTRO, nullable = false)
	private Date dataCadastro;
	
	@Column(name = ATRIBUTO_TELEFONE)
	private String telefone;
	
	@Column(name = ATRIBUTO_CELULAR, nullable = false)
	private String celular;
	
	@Column(name = ATRIBUTO_OCUPACAO)
	private String ocupacao;
	
	@Column(name = ATRIBUTO_ESTADO_CIVIL, nullable = false)
	private EEstadoCivil estadoCivil;
	
	@Column(name = ATRIBUTO_NOME_AVISO_EMERGENCIA)
	private String nomeAvisoEmergencia;
	
	@Column(name = ATRIBUTO_TELEFONE_EMERGENCIA)
	private String telefoneEmergencia;
	
	@OneToOne(mappedBy = "convenio", cascade = CascadeType.ALL, orphanRemoval = true)
	private LogradouroModel logradouro;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNacimento() {
		return dataNacimento;
	}

	public void setDataNacimento(Date dataNacimento) {
		this.dataNacimento = dataNacimento;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public ESexo getSexo() {
		return sexo;
	}

	public void setSexo(ESexo sexo) {
		this.sexo = sexo;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getOcupacao() {
		return ocupacao;
	}

	public void setOcupacao(String ocupacao) {
		this.ocupacao = ocupacao;
	}

	public EEstadoCivil getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(EEstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getNomeAvisoEmergencia() {
		return nomeAvisoEmergencia;
	}

	public void setNomeAvisoEmergencia(String nomeAvisoEmergencia) {
		this.nomeAvisoEmergencia = nomeAvisoEmergencia;
	}

	public String getTelefoneEmergencia() {
		return telefoneEmergencia;
	}

	public void setTelefoneEmergencia(String telefoneEmergencia) {
		this.telefoneEmergencia = telefoneEmergencia;
	}

	public LogradouroModel getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(LogradouroModel logradouro) {
		this.logradouro = logradouro;
	}
}