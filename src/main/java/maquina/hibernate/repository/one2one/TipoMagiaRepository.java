package maquina.hibernate.repository.one2one;

import org.springframework.data.jpa.repository.JpaRepository;

import maquina.hibernate.dominio.one2one.TipoMagia;

public interface TipoMagiaRepository extends JpaRepository<TipoMagia, Long> {

}