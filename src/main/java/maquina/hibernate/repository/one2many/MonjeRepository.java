package maquina.hibernate.repository.one2many;

import org.springframework.data.jpa.repository.JpaRepository;

import maquina.hibernate.dominio.one2many.Monje;

public interface MonjeRepository extends JpaRepository<Monje, Long> {

}