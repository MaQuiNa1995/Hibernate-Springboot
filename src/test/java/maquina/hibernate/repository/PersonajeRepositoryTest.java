package maquina.hibernate.repository;

import maquina.hibernate.dominio.one2one.Oficio;
import maquina.hibernate.dominio.one2one.Personaje;

public class PersonajeRepositoryTest extends JpaRepositoryImplTest<Long, Personaje> {

	@Override
	public Personaje getInstanceDeE() {
		Personaje personaje = new Personaje();
		personaje.setNombre("MaQuiNa1995");

		Oficio oficio = new Oficio();
		oficio.setNombre("Paladín");

		personaje.setOficio(oficio);
		return personaje;
	}

	@Override
	public Long getClavePrimariaNoExistente() {
		return Long.MAX_VALUE;
	}

	@Override
	protected Personaje getInstanceDeTParaModificar(Long id) {
		Personaje personaje = super.getInstanceDeTParaModificar(id);

		personaje.getOficio()
		        .setNombre("Ilusionista");

		return personaje;
	}

}
