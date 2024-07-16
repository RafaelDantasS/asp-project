package br.com.asp.services.doador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.asp.dto.doador.OngDto;
import br.com.asp.exceptions.ResourceNotFoundEXception;
import br.com.asp.models.Pet;
import br.com.asp.models.doador.Ong;
import br.com.asp.models.redes_sociais.RedesDoador;
import br.com.asp.repository.doador.OngRepository;
import br.com.asp.util.Mapper;

@Service
public class OngService {
	@Autowired
	private OngRepository repo;
	@Autowired
	private Mapper mapper;

	public OngDto findById(Long id) {

		var dto = mapper.parseObject(repo.findById(id), OngDto.class);
		return dto;
	}

	public List<OngDto> findAll() {

		var dto = mapper.parseListObject(repo.findAll(), OngDto.class);
		return dto;
	}

	public OngDto create(OngDto ong) {
		
		var entity =mapper.parseObject(ong, Ong.class);
		var dto =  mapper.parseObject(repo.save(entity), OngDto.class);
		return dto;
	}
	
	public OngDto update(OngDto ong) {
		var ent = repo.findById(ong.getId())
				.orElseThrow(() -> new ResourceNotFoundEXception("No records found for this name."));
		
		ent.setNome(ong.getNome());
		ent.setEmail(ong.getEmail());
		ent.setTel(ong.getTel());
		ent.setMidias(mapper.parseListObject(ong.getMidias(), RedesDoador.class));
		ent.setPets(mapper.parseListObject(ong.getPets(), Pet.class));
		ent.setInformacoes(ong.getInformacoes());
		ent.setNumRegistro(ong.getNumRegistro());
		
		var dto =  mapper.parseObject(repo.save(ent), OngDto.class);
		
		return dto;
	}
	
	public void delete(Long id) {
		var ent = repo.findById(id)
				.orElseThrow(() -> new ResourceNotFoundEXception("No records found for this name."));
		repo.delete(ent);
		}
	
}
