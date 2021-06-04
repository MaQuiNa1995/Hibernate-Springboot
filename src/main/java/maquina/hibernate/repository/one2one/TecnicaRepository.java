package maquina.hibernate.repository.one2one;

import org.springframework.data.jpa.repository.JpaRepository;

import maquina.hibernate.dominio.one2one.Tecnica;

public interface TecnicaRepository extends JpaRepository<Tecnica, Long> {

}