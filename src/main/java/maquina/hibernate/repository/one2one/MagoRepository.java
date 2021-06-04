package maquina.hibernate.repository.one2one;

import org.springframework.data.jpa.repository.JpaRepository;

import maquina.hibernate.dominio.one2one.Mago;

public interface MagoRepository extends JpaRepository<Mago, Long> {

}