package maquina.hibernate.repository.one2one;

import org.springframework.data.jpa.repository.JpaRepository;

import maquina.hibernate.dominio.one2one.Personaje;

public interface PersonajeRepository extends JpaRepository<Personaje, Long> {

}