
package br.com.asp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.asp.dto.PetDto;
import br.com.asp.exceptions.ResourceNotFoundEXception;
import br.com.asp.models.Pet;
import br.com.asp.repository.PetRepository;
import br.com.asp.util.Mapper;

@Service
public class PetService {
	@Autowired
	private PetRepository repo;
	@Autowired
	private Mapper mapper;

	public PetDto findById(Long id) {

		var dto = mapper.parseObject(repo.findById(id), PetDto.class);
		return dto;
	}

	public List<PetDto> findAll() {

		var dto = mapper.parseListObject(repo.findAll(), PetDto.class);
		return dto;
	}

	public PetDto create(PetDto pet) {
		
		var entity =mapper.parseObject(pet, Pet.class);
		var dto =  mapper.parseObject(repo.save(entity), PetDto.class);
		return dto;
	}
	
	public PetDto update(PetDto pet) {
		var ent = repo.findById(pet.getCodPet())
				.orElseThrow(() -> new ResourceNotFoundEXception("No records found for this name."));
		ent.setEspecie(pet.getEspecie());
		ent.setIdade(pet.getIdade());
		ent.setNome(pet.getNome());
		ent.setRaca(pet.getRaca());
		
		var dto =  mapper.parseObject(repo.save(ent), PetDto.class);
		
		return dto;
	}
	
	public void delete(Long id) {
		var ent = repo.findById(id)
				.orElseThrow(() -> new ResourceNotFoundEXception("No records found for this name."));
		repo.delete(ent);
		}
	
	
}
