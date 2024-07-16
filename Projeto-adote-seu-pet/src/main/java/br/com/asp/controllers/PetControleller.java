package br.com.asp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.asp.dto.PetDto;
import br.com.asp.services.PetService;


@RestController
@RequestMapping("api/asp/v1/pet")
public class PetControleller {
	
	@Autowired
	private PetService req;
	
	@GetMapping(value = "/{id}")
	public PetDto getById(@PathVariable(name = "id") Long id){
		
		return req.findById(id);
	}
	
	@GetMapping
	public List<PetDto> getAll(){
		
		return req.findAll();
	}
	
	@PutMapping
	public PetDto update(@RequestBody PetDto pet) {
		
		return req.update(pet);
	}
	
	@PostMapping
	public PetDto create(@RequestBody PetDto pet) {
		
		return req.create(pet);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> delete(@PathVariable(value = "id") Long id){
		req.delete(id);
		return ResponseEntity.noContent().build();
	}
}
