package br.com.asp.models;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import br.com.asp.models.redes_sociais.RedesVendedor;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "vendedor")
public class Vendedor implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column
	private String nomeEmpresa;
	@Column
	private String cnpj;
	@Column
	private String servicoPrestado;
	@Column
	private String descricao;
	
//	@OneToMany(mappedBy = "vendedor", cascade = CascadeType.ALL)
//	private List<Produto> produtos;
	
	@OneToMany(mappedBy = "vendedor", cascade = CascadeType.ALL)
	private List<RedesVendedor> midias;
	
	public List<RedesVendedor> getMidias() {
		return midias;
	}

	public long getId() {
		return id;
	}

	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public String getCnpj() {
		return cnpj;
	}

	public String getServicoPrestado() {
		return servicoPrestado;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public void setMidias(List<RedesVendedor> midias) {
		this.midias = midias;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public void setServicoPrestado(String servicoPrestado) {
		this.servicoPrestado = servicoPrestado;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cnpj, descricao, id, midias, nomeEmpresa, servicoPrestado);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vendedor other = (Vendedor) obj;
		return Objects.equals(cnpj, other.cnpj) && Objects.equals(descricao, other.descricao) && id == other.id
				&& Objects.equals(midias, other.midias) && Objects.equals(nomeEmpresa, other.nomeEmpresa)
				&& Objects.equals(servicoPrestado, other.servicoPrestado);
	}
	
	
}
