package maquina.hibernate.repository.one2many;

import org.springframework.data.jpa.repository.JpaRepository;

import maquina.hibernate.dominio.one2many.InvocacionSuprema;

public interface InvocacionSupremaRepository extends JpaRepository<InvocacionSuprema, Long> {

	InvocacionSuprema findByNombre(String nombre);

}