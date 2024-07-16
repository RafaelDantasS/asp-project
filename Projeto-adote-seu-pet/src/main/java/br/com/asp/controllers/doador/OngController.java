package br.com.asp.controllers.doador;

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

import br.com.asp.dto.doador.OngDto;
import br.com.asp.services.doador.OngService;

@RestController
@RequestMapping("api/asp/v1/ong")
public class OngController {

	@Autowired
	private OngService req;
	
	@GetMapping(value = "/{id}")
	public OngDto getById(@PathVariable(name = "id") Long id){
		
		return req.findById(id);
	}
	
	@GetMapping
	public List<OngDto> getAll(){
		
		return req.findAll();
	}
	
	@PutMapping
	public OngDto update(@RequestBody OngDto pet) {
		
		return req.update(pet);
	}
	
	@PostMapping
	public OngDto create(@RequestBody OngDto pet) {
		
		return req.create(pet);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> delete(@PathVariable(value = "id") Long id){
		req.delete(id);
		return ResponseEntity.noContent().build();
	}
	
}
