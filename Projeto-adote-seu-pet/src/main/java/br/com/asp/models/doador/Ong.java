package br.com.asp.models.doador;

import br.com.asp.models.Doador;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
@Entity
@Table(name = "ong")
public class Ong extends Doador{

	private static final long serialVersionUID = 1L;
	@Column
	private String numRegistro;
	@Column
	private String informacoes;
	
	public String getNumRegistro() {
		return numRegistro;
	}
	public String getInformacoes() {
		return informacoes;
	}
	public void setNumRegistro(String numRegistro) {
		this.numRegistro = numRegistro;
	}
	public void setInformacoes(String informacoes) {
		this.informacoes = informacoes;
	}
	
	
}
