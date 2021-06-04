package maquina.hibernate.repository;

import java.util.Optional;

import javax.transaction.Transactional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import maquina.hibernate.dominio.Elementalista;
import maquina.hibernate.dominio.ElementalistaPk;

@DataJpaTest
@EnableJpaRepositories
@ComponentScan(value = "maquina.hibernate.repository")
class ElementalistaRepositoryTest {

	@Autowired
	private TestEntityManager entityManager;

	private Elementalista elementalista;

	@Autowired
	private JpaRepository<Elementalista, ElementalistaPk> rut;

	@BeforeEach
	public void setUp() {

		this.elementalista = new Elementalista();
		this.elementalista.setNombre("Natsu");

		ElementalistaPk id = new ElementalistaPk();
		id.setElemento("Fuego");
		id.setPoder(100L);

		this.elementalista.setId(id);

	}

	@Test
	@Transactional
	void createTest() {

		rut.save(elementalista);

		Optional<Elementalista> elementalistaBd = rut.findById(this.elementalista.getId());
		Assertions.assertTrue(elementalistaBd.isPresent());
		Assertions.assertEquals(elementalistaBd.get(), this.elementalista);
	}

	@Test
	@Transactional
	void readByPkTest() {
		Assertions.assertFalse(rut.findById(this.elementalista.getId())
		        .isPresent());

		entityManager.persist(this.elementalista);

		Optional<Elementalista> elementalistaBd = rut.findById(this.elementalista.getId());

		Assertions.assertTrue(elementalistaBd.isPresent());
		Assertions.assertEquals(elementalistaBd.get(), this.elementalista);

	}

	@Test
	@Transactional
	void findAllTest() {
		entityManager.persist(this.elementalista);

		Assertions.assertEquals(1, rut.findAll()
		        .size());
	}

	@Test
	@Transactional
	void updateTest() {
		entityManager.persist(this.elementalista);

		ElementalistaPk idAnterior = this.elementalista.getId();

		ElementalistaPk id = new ElementalistaPk();
		id.setElemento("Agua");
		id.setPoder(50L);

		this.elementalista.setId(id);

		rut.save(this.elementalista);

		Assertions.assertNotEquals(this.elementalista.getId(), idAnterior);

	}

	@Test
	@Transactional
	void deleteTest() {

		entityManager.persist(this.elementalista);

		Assertions.assertEquals(1, rut.findAll()
		        .size());

		rut.delete(this.elementalista);

		Assertions.assertTrue(rut.findAll()
		        .isEmpty());

	}

}
