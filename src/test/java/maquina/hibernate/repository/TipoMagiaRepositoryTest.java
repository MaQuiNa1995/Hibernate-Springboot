package maquina.hibernate.repository;

import maquina.hibernate.dominio.one2one.Mago;
import maquina.hibernate.dominio.one2one.TipoMagia;

public class TipoMagiaRepositoryTest extends JpaRepositoryImplTest<Long, TipoMagia> {

	@Override
	public TipoMagia getInstanceDeE() {
		TipoMagia tipoMagia = new TipoMagia();
		tipoMagia.setNombre("Magia Roja");

		Mago mago = new Mago();
		mago.setNombre("Mago Rojo");

		tipoMagia.setMago(mago);

		return tipoMagia;
	}

	@Override
	public Long getClavePrimariaNoExistente() {
		return Long.MAX_VALUE;
	}

	@Override
	public TipoMagia getInstanceDeTParaModificar(Long clave) {
		TipoMagia tipoMagia = super.getInstanceDeTParaModificar(clave);

		tipoMagia.getMago()
		        .setNombre("Mago Blanco");

		return tipoMagia;
	}

}
