package maquina.hibernate.repository.one2many;

import org.springframework.data.jpa.repository.JpaRepository;

import maquina.hibernate.dominio.one2many.Pocion;

public interface PocionRepository extends JpaRepository<Pocion, Long> {

}