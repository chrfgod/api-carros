//package com.example.carros;
//
//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertFalse;
//import static org.junit.Assert.assertNotNull;
//import static org.junit.Assert.assertNull;
//import static org.junit.Assert.assertTrue;
//
//import java.util.List;
//import java.util.Optional;
//
//import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import com.example.carros.domain.Carro;
//import com.example.carros.domain.CarroService;
//import com.example.carros.domain.dto.CarroDTO;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//class CarrosApplicationTests {
//	
//	@Autowired
//	private CarroService service;
//
//	@Test
//	void testInsert() {
//		Carro carro = new Carro();
//		carro.setNome("Ferrari");
//		carro.setTipo("esportivos");
//		
//		CarroDTO c = service.insert(carro);
//		
//		assertNotNull(c);
//		Long id = c.getId();
//		assertNotNull(id);
//		
//		//Buscar o objeto
//		c = service.getCarroById(id);
//		assertNotNull(c);
//		
//		assertEquals("Ferrari", c.getNome());
//		assertEquals("esportivos", c.getTipo());
//		
//		//Deletar o objeto
//		service.delete(id);
//		
//		//Verificar se deletou
//		
//		assertNull(service.getCarroById(id));
//		
//	}
//	
//	@Test
//	void testList() {
//		List<CarroDTO> carros = service.getCarros();
//		assertEquals(32, carros.size());
//	}
//
//}
