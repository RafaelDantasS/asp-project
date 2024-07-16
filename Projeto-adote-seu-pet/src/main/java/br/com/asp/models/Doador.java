package br.com.asp.models;

import java.util.List;
import java.util.Objects;

import br.com.asp.models.redes_sociais.RedesDoador;
import jakarta.persistence.CascadeType;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.OneToMany;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "type")
public  class Doador extends Person{

	private static final long serialVersionUID = 1L;
	
	@OneToMany(mappedBy = "doador", cascade = CascadeType.ALL)
	private List<RedesDoador> midias;
	
	@OneToMany(mappedBy = "doador", cascade = CascadeType.ALL)
	private List<Pet> pets;

	public List<RedesDoador> getMidias() {
		return midias;
	}

	public List<Pet> getPets() {
		return pets;
	}

	public void setMidias(List<RedesDoador> midias) {
		this.midias = midias;
	}

	public void setPets(List<Pet> pets) {
		this.pets = pets;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(midias, pets);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Doador other = (Doador) obj;
		return Objects.equals(midias, other.midias) && Objects.equals(pets, other.pets);
	}
	
	
	
}
