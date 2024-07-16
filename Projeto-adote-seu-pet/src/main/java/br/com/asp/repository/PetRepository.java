package br.com.asp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.asp.models.Doador;
import br.com.asp.models.Pet;

@Repository
public interface PetRepository extends JpaRepository<Pet, Long> {
	
	@Query("SELECT p FROM Pet p WHERE p.doador =:doador")
	List<Pet> findByDoador(@Param("doador") Doador doador);
	
}
