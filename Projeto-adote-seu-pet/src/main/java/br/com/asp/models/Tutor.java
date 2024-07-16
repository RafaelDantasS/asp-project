package br.com.asp.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tutor")
public class Tutor extends Person{

	private static final long serialVersionUID = 1L;
	
//	@OneToMany(mappedBy = "tutor", cascade = CascadeType.ALL)
//	private List<Favorito> favoritos;
//
//	public List<Favorito> getFavoritos() {
//		return favoritos;
//	}
//
//	public void setFavoritos(List<Favorito> favoritos) {
//		this.favoritos = favoritos;
//	}
	
	
}
