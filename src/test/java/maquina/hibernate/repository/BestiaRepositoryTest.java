package maquina.hibernate.repository;

import maquina.hibernate.dominio.many2many.Bestia;

public class BestiaRepositoryTest extends JpaRepositoryImplTest<Long, Bestia> {

	@Override
	public Bestia getInstanceDeE() {
		Bestia bestia = new Bestia();
		bestia.setNombre("Gran Molbo");

		return bestia;
	}

	@Override
	public Long getClavePrimariaNoExistente() {
		return Long.MAX_VALUE;
	}

}
