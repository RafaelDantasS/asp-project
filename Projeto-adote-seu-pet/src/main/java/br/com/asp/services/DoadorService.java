package br.com.asp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.asp.dto.PetDto;
import br.com.asp.dto.redesSociasDto.RedesDoadorDto;
import br.com.asp.models.Doador;
import br.com.asp.repository.DoadorRepository;
import br.com.asp.repository.PetRepository;
import br.com.asp.repository.redes_sociais.RedesDoadorRepository;
import br.com.asp.util.Mapper;

@Service
public class DoadorService {
	@Autowired
	private RedesDoadorRepository redesRepo;
	@Autowired
	private PetRepository petRepo;
	@Autowired
	private DoadorRepository repo;
	@Autowired
	private Mapper mapper;
	
	public List<PetDto> findAllPetsById(Long id){
		Optional<Doador> doadorOptional = repo.findById(id);
		Doador doador = doadorOptional.get();
		var dto = mapper.parseListObject(petRepo.findByDoador(doador),PetDto.class);
		return dto;
	}
	public List<RedesDoadorDto> findAllRedesById(Long id){
		Optional<Doador> doadorOptional = repo.findById(id);
		Doador doador = doadorOptional.get();
		var dto = mapper.parseListObject(redesRepo.findByDoador(doador), RedesDoadorDto.class);
		return dto;
	}
	
	
}
