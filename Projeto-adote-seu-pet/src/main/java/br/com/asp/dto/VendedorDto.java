package br.com.asp.dto;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import br.com.asp.models.redes_sociais.RedesVendedor;

public class VendedorDto implements Serializable {

		private static final long serialVersionUID = 1L;
		private long id;
		
		private String nomeEmpresa;
		private String cnpj;
		private String servicoPrestado;
		private String descricao;
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
			VendedorDto other = (VendedorDto) obj;
			return Objects.equals(cnpj, other.cnpj) && Objects.equals(descricao, other.descricao) && id == other.id
					&& Objects.equals(midias, other.midias) && Objects.equals(nomeEmpresa, other.nomeEmpresa)
					&& Objects.equals(servicoPrestado, other.servicoPrestado);
		}
		
}
