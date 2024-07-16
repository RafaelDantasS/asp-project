package br.com.asp.dto.redesSociasDto;

import com.fasterxml.jackson.annotation.JsonIgnore;

import br.com.asp.dto.DoadorDto;
import br.com.asp.dto.RedesSociaisDto;

public class RedesDoadorDto extends RedesSociaisDto{

	private static final long serialVersionUID = 1L;
	
	@JsonIgnore
	private DoadorDto doador;

	public DoadorDto getDoador() {
		return doador;
	}

	public void setDoador(DoadorDto doador) {
		this.doador = doador;
	}
	
	
}
