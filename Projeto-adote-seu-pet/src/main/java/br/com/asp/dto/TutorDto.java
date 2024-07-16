package br.com.asp.dto;

import java.util.List;

import br.com.asp.models.tutor.Favorito;

public class TutorDto extends PersonDto{

	private static final long serialVersionUID = 1L;
	
	private List<Favorito> favoritos;

	public List<Favorito> getFavoritos() {
		return favoritos;
	}

	public void setFavoritos(List<Favorito> favoritos) {
		this.favoritos = favoritos;
	}

}
