package maquina.hibernate.repository;

import maquina.hibernate.dominio.one2one.Rango;
import maquina.hibernate.dominio.one2one.Tecnica;

public class TecnicaRepositoryTest extends JpaRepositoryImplTest<Long, Tecnica> {

	@Override
	public Tecnica getInstanceDeE() {
		Tecnica tecnica = new Tecnica();
		tecnica.setNombre("Robar");

		Rango rango = new Rango();
		rango.setNombre("Línea Recta");

		tecnica.setRango(rango);

		return tecnica;
	}

	@Override
	public Long getClavePrimariaNoExistente() {
		return Long.MAX_VALUE;
	}

	@Override
	public Tecnica getInstanceDeTParaModificar(Long clave) {
		Tecnica tecnica = super.getInstanceDeTParaModificar(clave);

		tecnica.getRango()
		        .setNombre("Arco Frontal");

		return tecnica;
	}

}
