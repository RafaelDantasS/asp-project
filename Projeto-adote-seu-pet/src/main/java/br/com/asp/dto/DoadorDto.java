package br.com.asp.dto;

import java.util.List;

import br.com.asp.dto.redesSociasDto.RedesDoadorDto;

public class DoadorDto extends PersonDto{

	private static final long serialVersionUID = 1L;
	private List<RedesDoadorDto> midias;
	private List<PetDto> pets;
	
	public List<RedesDoadorDto> getMidias() {
		return midias;
	}

	public List<PetDto> getPets() {
		return pets;
	}

	public void setMidias(List<RedesDoadorDto> midias) {
		this.midias = midias;
	}

	public void setPets(List<PetDto> pets) {
		this.pets = pets;
	}
	
	

	
}
