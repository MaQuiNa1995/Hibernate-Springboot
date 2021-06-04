package maquina.hibernate.repository;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import maquina.hibernate.dominio.many2many.Arma;
import maquina.hibernate.dominio.many2many.Calidad;

public class ArmaRepositoryTest extends JpaRepositoryImplTest<Long, Arma> {

	@Override
	public Arma getInstanceDeE() {
		Arma arma = new Arma();
		arma.setNombre("Excalibur");

		Calidad calidad = new Calidad();
		calidad.setNombre("Quimera");

		arma.setCalidades(Stream.of(calidad)
		        .collect(Collectors.toSet()));

		return arma;
	}

	@Override
	public Long getClavePrimariaNoExistente() {
		return Long.MAX_VALUE;
	}

	@Override
	public Arma getInstanceDeTParaModificar(Long clave) {
		Arma arma = super.getInstanceDeTParaModificar(clave);

		Calidad calidad = new Calidad();
		calidad.setNombre("Legendario");

		arma.getCalidades()
		        .clear();
		arma.getCalidades()
		        .add(calidad);

		return arma;
	}

}
