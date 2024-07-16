package br.com.asp.repository.doador;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.asp.models.doador.PessoaFisica;

@Repository
public interface PessoaFisRepository extends JpaRepository<PessoaFisica, Long>{
	
}
