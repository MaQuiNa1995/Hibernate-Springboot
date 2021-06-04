package maquina.hibernate.repository.many2many;

import org.springframework.data.jpa.repository.JpaRepository;

import maquina.hibernate.dominio.many2many.Domador;

public interface DomadorRepository extends JpaRepository<Domador, Long> {

}
