package br.com.asp.services.redes_sociais;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.asp.dto.redesSociasDto.RedesVendedorDto;
import br.com.asp.exceptions.ResourceNotFoundEXception;
import br.com.asp.models.redes_sociais.RedesVendedor;
import br.com.asp.repository.redes_sociais.RedesVendedorRepository;
import br.com.asp.util.Mapper;

@Service
public class RedesVendedorService {
	
	@Autowired
	private RedesVendedorRepository repo;
	@Autowired
	private Mapper mapper;

	public RedesVendedorDto findById(Long id) {

		var dto = mapper.parseObject(repo.findById(id), RedesVendedorDto.class);
		return dto;
	}

	public List<RedesVendedorDto> findAll() {

		var dto = mapper.parseListObject(repo.findAll(), RedesVendedorDto.class);
		return dto;
	}

	public RedesVendedorDto create(RedesVendedorDto vendedor) {
		
		var entity =mapper.parseObject(vendedor, RedesVendedor.class);
		var dto =  mapper.parseObject(repo.save(entity), RedesVendedorDto.class);
		return dto;
	}
	
	public RedesVendedorDto update(RedesVendedorDto rv) {
		var ent = repo.findById(rv.getId())
				.orElseThrow(() -> new ResourceNotFoundEXception("No records found for this name."));
		ent.setLink(rv.getLink());
		ent.setName(rv.getName());
		
		
		var dto =  mapper.parseObject(repo.save(ent), RedesVendedorDto.class);
		
		return dto;
	}
	
	public void delete(Long id) {
		var ent = repo.findById(id)
				.orElseThrow(() -> new ResourceNotFoundEXception("No records found for this name."));
		repo.delete(ent);
		}
}
