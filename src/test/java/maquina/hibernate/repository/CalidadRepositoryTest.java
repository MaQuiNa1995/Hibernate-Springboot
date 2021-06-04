package maquina.hibernate.repository;

import java.util.Arrays;

import maquina.hibernate.dominio.many2many.Arma;
import maquina.hibernate.dominio.many2many.Calidad;

public class CalidadRepositoryTest extends JpaRepositoryImplTest<Long, Calidad> {

	/**
	 * Al ser la parte esclava de la relación no se puede persistir un objeto
	 * {@link Arma} que tenga asociado un {@link Calidad} si queremos asociarles
	 * deberemos persistir previamente un {@link Calidad} y luego al persistir el
	 * {@link Arma} enlazarles
	 * <p>
	 * Lo primero deberíamos hacer el persist de un {@link Arma} y luego persistir
	 * el objeto {@link Calidad} habiendo previamente hecho el
	 * {@link Calidad#setArmas(java.util.List)}
	 */
	@Override
	public Calidad getInstanceDeE() {
		Calidad calidad = new Calidad();
		calidad.setNombre("Estropeado");

		return calidad;
	}

	@Override
	public Long getClavePrimariaNoExistente() {
		return Long.MAX_VALUE;
	}

	@Override
	public Calidad getInstanceDeTParaModificar(Long clave) {
		Calidad calidad = super.getInstanceDeTParaModificar(clave);

		Arma arma = new Arma();
		arma.setNombre("Excalibur");

		calidad.setArmas(Arrays.asList(arma));

		return calidad;
	}

}
