package ch.makery.address.model;

import java.time.LocalDate;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * Classe Model para uma Person (pessoa).
 * 
 * @author WEIBER
 *
 */
public class Person {

    private final StringProperty nome;
    private final StringProperty sobrenome;
    private final StringProperty endereco;
    private final IntegerProperty cep;
    private final StringProperty cidade;
    private final ObjectProperty<LocalDate> nacimento;

    /**
     *  Construtor padrão.
     */
    public Person() {
        this(null, null);
    }

    /**
     * Construtor com alguns dados iniciais.
     * 
     * @param firstName Primeiro nome da Pessoa.
     * @param lastName Sobrenome da Pessoa.
     */
    public Person(String firstName, String lastName) {
        this.nome = new SimpleStringProperty(firstName);
        this.sobrenome = new SimpleStringProperty(lastName);

        // Alguns dados de exemplo, apenas para testes.
        this.endereco = new SimpleStringProperty("some street");
        this.cep = new SimpleIntegerProperty(1234);
        this.cidade = new SimpleStringProperty("some city");
        this.nacimento = new SimpleObjectProperty<LocalDate>(LocalDate.of(1999, 2, 21));
    }

	public final StringProperty nomeProperty() {
		return this.nome;
	}

	public final java.lang.String getNome() {
		return this.nomeProperty().get();
	}

	public final void setNome(final java.lang.String nome) {
		this.nomeProperty().set(nome);
	}

	public final StringProperty sobrenomeProperty() {
		return this.sobrenome;
	}

	public final java.lang.String getSobrenome() {
		return this.sobrenomeProperty().get();
	}

	public final void setSobrenome(final java.lang.String sobrenome) {
		this.sobrenomeProperty().set(sobrenome);
	}

	public final StringProperty enderecoProperty() {
		return this.endereco;
	}

	public final java.lang.String getEndereco() {
		return this.enderecoProperty().get();
	}

	public final void setEndereco(final java.lang.String endereco) {
		this.enderecoProperty().set(endereco);
	}

	public final IntegerProperty cepProperty() {
		return this.cep;
	}

	public final int getCep() {
		return this.cepProperty().get();
	}

	public final void setCep(final int cep) {
		this.cepProperty().set(cep);
	}

	public final StringProperty cidadeProperty() {
		return this.cidade;
	}

	public final java.lang.String getCidade() {
		return this.cidadeProperty().get();
	}

	public final void setCidade(final java.lang.String cidade) {
		this.cidadeProperty().set(cidade);
	}

	public final ObjectProperty<LocalDate> nacimentoProperty() {
		return this.nacimento;
	}

	public final java.time.LocalDate getNacimento() {
		return this.nacimentoProperty().get();
	}

	public final void setNacimento(final java.time.LocalDate nacimento) {
		this.nacimentoProperty().set(nacimento);
	}

}