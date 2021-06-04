package maquina.hibernate.repository;

import maquina.hibernate.dominio.one2one.Ninja;
import maquina.hibernate.dominio.one2one.Ninjutsu;

class NinjaRepositoryTest extends JpaRepositoryImplTest<Long, Ninja> {

	@Override
	public Ninja getInstanceDeE() {
		Ninja ninja = new Ninja();
		ninja.setNombre("Ninja Sepulcrador");

		Ninjutsu ninjutsu = new Ninjutsu();
		ninjutsu.setNombre("Última pesadilla");

		ninja.setNinjutsu(ninjutsu);
		return ninja;
	}

	@Override
	public Long getClavePrimariaNoExistente() {
		return Long.MAX_VALUE;
	}

	@Override
	public Ninja getInstanceDeTParaModificar(Long clave) {
		Ninja ninja = super.getInstanceDeTParaModificar(clave);

		ninja.getNinjutsu()
		        .setNombre("Puño Sombrío");

		return ninja;
	}

}
