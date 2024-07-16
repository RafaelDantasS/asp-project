package br.com.asp.models.redes_sociais;

import br.com.asp.models.RedesSociais;
import br.com.asp.models.Vendedor;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
@Entity
@Table(name = "redes_vendedor")
public class RedesVendedor extends RedesSociais {

	private static final long serialVersionUID = 1L;
	@ManyToOne 
	@JoinColumn(name = "vendedor_id")
	private Vendedor vendedor;

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}
	
	
}
