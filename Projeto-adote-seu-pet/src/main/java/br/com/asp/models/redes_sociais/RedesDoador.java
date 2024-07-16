package br.com.asp.models.redes_sociais;

import br.com.asp.models.Doador;
import br.com.asp.models.RedesSociais;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "redes_doador")
public class RedesDoador extends RedesSociais{

	private static final long serialVersionUID = 1L;
	@ManyToOne @JoinColumn(name = "doador_id")
	private Doador doador;

	public Doador getDoador() {
		return doador;
	}

	public void setDoador(Doador doador) {
		this.doador = doador;
	}
	
	
	
}
