package br.com.asp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.asp.models.Vendedor;

@Repository
public interface VendedorRepository extends JpaRepository<Vendedor, Long>{
	
}
