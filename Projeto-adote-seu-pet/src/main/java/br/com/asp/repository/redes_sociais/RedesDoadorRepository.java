package br.com.asp.repository.redes_sociais;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.asp.models.Doador;
import br.com.asp.models.redes_sociais.RedesDoador;

@Repository
public interface RedesDoadorRepository extends JpaRepository<RedesDoador,Long>{
	
	@Query("SELECT r from RedesDoador r where r.doador = :doador")
	List<RedesDoador> findByDoador(@Param("doador") Doador doador);
}
