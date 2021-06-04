package maquina.hibernate.repository;

import maquina.hibernate.dominio.one2many.InvocacionSuprema;
import maquina.hibernate.dominio.one2many.Invocador;

class InvocacionSupremaRepositoryTest extends JpaRepositoryImplTest<Long, InvocacionSuprema> {

	/**
	 * Al ser la parte esclava de la relación no se puede persistir un objeto
	 * {@link InvocacionSuprema} que tenga asociado un {@link Invocador} si queremos
	 * asociarles deberemos persistir previamente un {@link Invocador} y luego al
	 * persistir el {@link InvocacionSuprema} enlazarles como muestro en el método
	 */
	@Override
	public InvocacionSuprema getInstanceDeE() {

		InvocacionSuprema invocacionSuprema = new InvocacionSuprema();
		invocacionSuprema.setNombre("Bahamut");

		Invocador invocador = new Invocador();
		invocador.setNombre("MaKy1995");
		entityManager.persist(invocador);

		invocacionSuprema.setInvocador(invocador);

		return invocacionSuprema;
	}

	@Override
	public Long getClavePrimariaNoExistente() {
		return Long.MAX_VALUE;
	}

	@Override
	protected InvocacionSuprema getInstanceDeTParaModificar(Long id) {
		InvocacionSuprema invocacionSuprema = super.getInstanceDeTParaModificar(id);

		invocacionSuprema.getInvocador()
		        .setNombre("MaQui1995");

		return invocacionSuprema;
	}

}
