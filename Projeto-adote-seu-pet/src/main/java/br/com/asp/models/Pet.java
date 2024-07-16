package br.com.asp.models;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "pet")
public class Pet implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private long codPet;
	
	@Column
	private String nome;
	@Column
	private int idade;
	@Column
	private String especie;
	@Column
	private String raca;
	@ManyToOne @JoinColumn(name = "doador_id")
	private Doador doador;
	public long getCodPet() {
		return codPet;
	}
	public String getNome() {
		return nome;
	}
	public int getIdade() {
		return idade;
	}
	public String getEspecie() {
		return especie;
	}
	public String getRaca() {
		return raca;
	}
	public Doador getDoador() {
		return doador;
	}
	public void setCodPet(long codPet) {
		this.codPet = codPet;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public void setDoador(Doador doador) {
		this.doador = doador;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codPet, doador, especie, idade, nome, raca);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pet other = (Pet) obj;
		return codPet == other.codPet && Objects.equals(doador, other.doador) && Objects.equals(especie, other.especie)
				&& idade == other.idade && Objects.equals(nome, other.nome) && Objects.equals(raca, other.raca);
	}
	
	
}
