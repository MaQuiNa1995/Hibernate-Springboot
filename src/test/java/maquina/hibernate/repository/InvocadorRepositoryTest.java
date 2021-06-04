package maquina.hibernate.repository;

import maquina.hibernate.dominio.one2many.Invocador;

public class InvocadorRepositoryTest extends JpaRepositoryImplTest<Long, Invocador> {

	@Override
	public Invocador getInstanceDeE() {
		Invocador invocador = new Invocador();
		invocador.setNombre("MaKy1995");

		return invocador;
	}

	@Override
	public Long getClavePrimariaNoExistente() {
		return Long.MAX_VALUE;
	}

}
