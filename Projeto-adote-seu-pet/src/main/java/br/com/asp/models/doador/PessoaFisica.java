package br.com.asp.models.doador;

import br.com.asp.models.Doador;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
@Entity
@Table(name = "pessoa_fisica")
public class PessoaFisica extends Doador{

	private static final long serialVersionUID = 1L;

}
