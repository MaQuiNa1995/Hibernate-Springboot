package maquina.hibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import maquina.hibernate.dominio.Elementalista;
import maquina.hibernate.dominio.ElementalistaPk;

public interface ElementalistaRepository extends JpaRepository<Elementalista, ElementalistaPk> {

}