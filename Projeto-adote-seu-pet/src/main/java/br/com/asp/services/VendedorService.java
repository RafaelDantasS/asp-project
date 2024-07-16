package br.com.asp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.asp.dto.VendedorDto;
import br.com.asp.exceptions.ResourceNotFoundEXception;
import br.com.asp.models.Vendedor;
import br.com.asp.repository.VendedorRepository;
import br.com.asp.util.Mapper;
@Service
public class VendedorService {
	@Autowired
	private VendedorRepository repo;
	@Autowired
	private Mapper mapper;

	public VendedorDto findById(Long id) {

		var dto = mapper.parseObject(repo.findById(id), VendedorDto.class);
		return dto;
	}

	public List<VendedorDto> findAll() {

		var dto = mapper.parseListObject(repo.findAll(), VendedorDto.class);
		return dto;
	}

	public VendedorDto create(VendedorDto vendedor) {
		
		var entity =mapper.parseObject(vendedor, Vendedor.class);
		var dto =  mapper.parseObject(repo.save(entity), VendedorDto.class);
		return dto;
	}
	
	public VendedorDto update(VendedorDto v) {
		var ent = repo.findById(v.getId())
				.orElseThrow(() -> new ResourceNotFoundEXception("No records found for this name."));
		ent.setCnpj(v.getCnpj());
		ent.setMidias(v.getMidias());
		ent.setServicoPrestado(v.getServicoPrestado());
		ent.setNomeEmpresa(v.getNomeEmpresa());
		
		var dto =  mapper.parseObject(repo.save(ent), VendedorDto.class);
		
		return dto;
	}
	
	public void delete(Long id) {
		var ent = repo.findById(id)
				.orElseThrow(() -> new ResourceNotFoundEXception("No records found for this name."));
		repo.delete(ent);
		}
}
