package br.com.asp.repository.redes_sociais;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.asp.models.Vendedor;
import br.com.asp.models.redes_sociais.RedesVendedor;

@Repository
public interface RedesVendedorRepository extends JpaRepository<RedesVendedor, Long>{
	
	@Query("SELECT r from RedesVendedor r where r.vendedor = :vendedor")
	List<RedesVendedor> findByVendedor(@Param("vendedor") Vendedor vendedor);

}
 