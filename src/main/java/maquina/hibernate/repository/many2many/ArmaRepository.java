package maquina.hibernate.repository.many2many;

import org.springframework.data.jpa.repository.JpaRepository;

import maquina.hibernate.dominio.many2many.Arma;

public interface ArmaRepository extends JpaRepository<Arma, Long> {

}
