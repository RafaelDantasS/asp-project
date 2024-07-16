package br.com.asp.dto.redesSociasDto;

import com.fasterxml.jackson.annotation.JsonIgnore;

import br.com.asp.dto.RedesSociaisDto;
import br.com.asp.dto.VendedorDto;

public class RedesVendedorDto extends RedesSociaisDto {
private static final long serialVersionUID = 1L;
	
	@JsonIgnore
	private VendedorDto vendedor;

	public VendedorDto getVendedor() {
		return vendedor;
	}

	public void setVendedor(VendedorDto vendedor) {
		this.vendedor = vendedor;
	}

	
	
}
