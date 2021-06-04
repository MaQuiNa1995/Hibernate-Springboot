package maquina.hibernate.repository;

import maquina.hibernate.dominio.one2many.TecnicaKi;

public class TecnicaKiRepositoryTest extends JpaRepositoryImplTest<Long, TecnicaKi> {

	@Override
	public TecnicaKi getInstanceDeE() {
		TecnicaKi tecnicaKi = new TecnicaKi();
		tecnicaKi.setNombre("Robar");

		return tecnicaKi;
	}

	@Override
	public Long getClavePrimariaNoExistente() {
		return Long.MAX_VALUE;
	}

}
