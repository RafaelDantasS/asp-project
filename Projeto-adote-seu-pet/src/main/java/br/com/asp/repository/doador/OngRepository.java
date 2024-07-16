package br.com.asp.repository.doador;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.asp.models.doador.Ong;

@Repository
public interface OngRepository extends JpaRepository<Ong, Long>{

}
