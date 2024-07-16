package br.com.asp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.asp.models.Doador;

public interface DoadorRepository extends JpaRepository<Doador, Long> {

}
