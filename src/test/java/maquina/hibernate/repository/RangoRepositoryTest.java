package maquina.hibernate.repository;

import maquina.hibernate.dominio.one2one.Rango;
import maquina.hibernate.dominio.one2one.Tecnica;

class RangoRepositoryTest extends JpaRepositoryImplTest<Long, Rango> {

	@Override
	public Rango getInstanceDeE() {
		Rango rango = new Rango();
		rango.setNombre("Línea Recta");

		Tecnica tecnica = new Tecnica();
		tecnica.setNombre("Imitar");

		rango.setTecnica(tecnica);

		return rango;
	}

	@Override
	public Long getClavePrimariaNoExistente() {
		return Long.MAX_VALUE;
	}

	@Override
	public Rango getInstanceDeTParaModificar(Long clave) {
		Rango rango = super.getInstanceDeTParaModificar(clave);

		rango.getTecnica()
		        .setNombre("Lluvia De Puños");

		return rango;
	}

}
