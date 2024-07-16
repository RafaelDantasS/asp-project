package br.com.asp.controllers.redes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import br.com.asp.dto.redesSociasDto.RedesDoadorDto;
import br.com.asp.services.redes_sociais.RedesDoadorService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api/asp/v1/redes/doador")
public class RedesDoadorController {
	
	@Autowired
	private RedesDoadorService req;
	
	@GetMapping(value = "/{id}")
	public RedesDoadorDto getById(@PathVariable(name = "id") Long id){
		
		return req.findById(id);
	}
	
	@GetMapping
	public List<RedesDoadorDto> getAll(){
		
		return req.findAll();
	}
	
	@PutMapping
	public RedesDoadorDto update(@RequestBody RedesDoadorDto pet) {
		
		return req.update(pet);
	}
	
	@PostMapping
	public RedesDoadorDto create(@RequestBody RedesDoadorDto pet) {
		
		return req.create(pet);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> delete(@PathVariable(value = "id") Long id){
		req.delete(id);
		return ResponseEntity.noContent().build();
	}

}
