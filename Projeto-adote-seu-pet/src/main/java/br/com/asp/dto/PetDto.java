package br.com.asp.dto;

import java.io.Serializable;
import java.util.Objects;

import br.com.asp.models.Doador;

public class PetDto implements Serializable{

	private static final long serialVersionUID = 1L;

	private long codPet;
	
	private String nome;
	private int idade;
	private String especie;
	private String raca;
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
		PetDto other = (PetDto) obj;
		return codPet == other.codPet && Objects.equals(doador, other.doador) && Objects.equals(especie, other.especie)
				&& idade == other.idade && Objects.equals(nome, other.nome) && Objects.equals(raca, other.raca);
	}
	
	

}
