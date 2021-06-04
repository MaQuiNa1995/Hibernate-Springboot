package maquina.hibernate.repository.one2one;

import org.springframework.data.jpa.repository.JpaRepository;

import maquina.hibernate.dominio.one2one.Ninjutsu;

public interface NinjutsuRepository extends JpaRepository<Ninjutsu, Long> {

}