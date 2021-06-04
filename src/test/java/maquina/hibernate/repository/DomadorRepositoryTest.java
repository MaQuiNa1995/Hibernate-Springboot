package maquina.hibernate.repository;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import maquina.hibernate.dominio.many2many.Bestia;
import maquina.hibernate.dominio.many2many.Domador;

public class DomadorRepositoryTest extends JpaRepositoryImplTest<Long, Domador> {

	@Override
	public Domador getInstanceDeE() {
		Domador domador = new Domador();
		domador.setNombre("Domador Sepulcrador");

		Bestia bestia = new Bestia();
		bestia.setNombre("Quimera");

		domador.setBestias(Stream.of(bestia)
		        .collect(Collectors.toSet()));

		return domador;
	}

	@Override
	public Long getClavePrimariaNoExistente() {
		return Long.MAX_VALUE;
	}

	@Override
	public Domador getInstanceDeTParaModificar(Long clave) {
		Domador domador = super.getInstanceDeTParaModificar(clave);

		domador.getBestias()
		        .forEach(e -> e.setNombre("Antoleón"));

		return domador;
	}

}
