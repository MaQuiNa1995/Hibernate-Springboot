package maquina.hibernate.repository;

import maquina.hibernate.dominio.one2one.Mago;

public class MagoRepositoryTest extends JpaRepositoryImplTest<Long, Mago> {

	@Override
	public Mago getInstanceDeE() {
		Mago mago = new Mago();
		mago.setNombre("Natsu");
		return mago;
	}

	@Override
	public Long getClavePrimariaNoExistente() {
		return Long.MAX_VALUE;
	}

}
