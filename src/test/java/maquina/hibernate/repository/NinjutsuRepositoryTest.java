package maquina.hibernate.repository;

import maquina.hibernate.dominio.one2one.Ninjutsu;

public class NinjutsuRepositoryTest extends JpaRepositoryImplTest<Long, Ninjutsu> {

	@Override
	public Ninjutsu getInstanceDeE() {
		Ninjutsu ninjutsu = new Ninjutsu();
		ninjutsu.setNombre("Ultima Pesadilla");

		return ninjutsu;
	}

	@Override
	public Long getClavePrimariaNoExistente() {
		return Long.MAX_VALUE;
	}

}
