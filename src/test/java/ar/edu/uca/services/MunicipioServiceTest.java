package ar.edu.uca.services;

import ar.edu.uca.entities.Municipio;
import ar.edu.uca.repositories.MunicipioRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.Assert.assertNotNull;


@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@WebAppConfiguration
public class MunicipioServiceTest {

	@Autowired
	private PaisService paisService;
	@Autowired
	private ProvinciaService provinciaService;
	@Autowired
	private MunicipioService municipioService;


	@Before
	public void setUp() {

	}

	@Test
	public void createProvinciaTest() {
		assertNotNull(paisService.crearPais("Argentina"));
		assertNotNull(provinciaService.createProvincia("Argentina", "Buenos Aires"));
		assertNotNull(municipioService.crearMunicipio("San Isidro", "Buenos Aires", "Argentina"));
		assertNotNull(municipioService.crearMunicipio("San Isidro", "Buenos Aires", "Argentina"));

	}
}