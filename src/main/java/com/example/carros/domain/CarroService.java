package com.example.carros.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Collectors;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import com.example.carros.api.exception.ObjectNotFoundException;
import com.example.carros.domain.dto.CarroDTO;

@Service
public class CarroService<X> {
	
	@Autowired
	private CarroRepository rep;
	
	public List<CarroDTO> getCarros(){
		
		return rep.findAll().stream().map(CarroDTO::create).collect(Collectors.toList());
		
		
		/*
		 * List<CarroDTO> list = new ArrayList<>();
		 * 
		 * for (Carro c : carros) { list.add(new CarroDTO(c)); }
		 * 
		 * return list;
		 */
	}
	
	/*
	 * public List<Carro> getCarrosFake(){ List<Carro> carros = new ArrayList<>();
	 * 
	 * carros.add(new Carro(1L,"Audi A4")); carros.add(new Carro(2L,"Ford Fusion"));
	 * carros.add(new Carro(3L,"Honda Civic"));
	 * 
	 * return carros; }
	 */

	public CarroDTO getCarroById(Long id) {	
		Optional<Carro> carro = rep.findById(id);
		return carro.map(CarroDTO::create).orElseThrow(() -> new ObjectNotFoundException("Carro não encontrado"));
	}

	public List<CarroDTO> getCarroByTipo(String tipo) {
		return rep.findByTipo(tipo).stream().map(CarroDTO::create).collect(Collectors.toList());
	}

	public CarroDTO insert(Carro carro) {
		Assert.isNull(carro.getId(), "Nao foi possivel inserir o registro");
		return CarroDTO.create(rep.save(carro));
		
	}

	public CarroDTO update(Carro carro, Long id) {
		Assert.notNull(carro, "Não foi possível atualizar o registro");
		
		Optional<Carro> optional = rep.findById(id);
		if (optional.isPresent()) {
			Carro db = optional.get();
			db.setNome(carro.getNome());
			db.setTipo(carro.getTipo());
			System.out.println("Carro id " + db.getId());
			
			rep.save(db);
			return CarroDTO.create(db);
		}
		else {
			throw new RuntimeException("Não foi possível atualizar o registro");
		}
		
	}

	public void delete(Long id) {
		
			rep.deleteById(id);
		
	}

	

}
