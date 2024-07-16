package br.com.asp.services.redes_sociais;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.asp.dto.redesSociasDto.RedesDoadorDto;
import br.com.asp.exceptions.ResourceNotFoundEXception;
import br.com.asp.models.redes_sociais.RedesDoador;
import br.com.asp.repository.redes_sociais.RedesDoadorRepository;
import br.com.asp.util.Mapper;
@Service
public class RedesDoadorService {
	
	@Autowired
	private RedesDoadorRepository repo;
	@Autowired
	private Mapper mapper;

	public RedesDoadorDto findById(Long id) {

		var dto = mapper.parseObject(repo.findById(id), RedesDoadorDto.class);
		return dto;
	}

	public List<RedesDoadorDto> findAll() {

		var dto = mapper.parseListObject(repo.findAll(), RedesDoadorDto.class);
		return dto;
	}

	public RedesDoadorDto create(RedesDoadorDto Doador) {
		
		var entity =mapper.parseObject(Doador, RedesDoador.class);
		var dto =  mapper.parseObject(repo.save(entity), RedesDoadorDto.class);
		return dto;
	}
	
	public RedesDoadorDto update(RedesDoadorDto rv) {
		var ent = repo.findById(rv.getId())
				.orElseThrow(() -> new ResourceNotFoundEXception("No records found for this name."));
		ent.setLink(rv.getLink());
		ent.setName(rv.getName());
		
		
		var dto =  mapper.parseObject(repo.save(ent), RedesDoadorDto.class);
		
		return dto;
	}
	
	public void delete(Long id) {
		var ent = repo.findById(id)
				.orElseThrow(() -> new ResourceNotFoundEXception("No records found for this name."));
		repo.delete(ent);
		}
}
