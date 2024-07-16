package br.com.asp.dto.doador;

import br.com.asp.dto.DoadorDto;

public class OngDto extends DoadorDto{

	private static final long serialVersionUID = 1L;

	private String numRegistro; 
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
