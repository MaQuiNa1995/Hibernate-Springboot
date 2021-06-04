package maquina.hibernate.repository;

import maquina.hibernate.dominio.one2many.Monje;

public class MonjeRepositoryTest extends JpaRepositoryImplTest<Long, Monje> {

	@Override
	public Monje getInstanceDeE() {
		Monje monje = new Monje();
		monje.setNombre("MaKy1995");

		return monje;
	}

	@Override
	public Long getClavePrimariaNoExistente() {
		return Long.MAX_VALUE;
	}

}
