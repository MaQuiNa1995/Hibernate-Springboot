package maquina.hibernate.dominio;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * Esta clase es la representacion de una entidad con una pk compuesta
 * {@link ElementalistaPk}
 * 
 * @author MaQuiNa1995
 *
 */
@Entity
@Getter
@Setter
@EqualsAndHashCode
public class Elementalista implements Serializable {

	@EmbeddedId
	private ElementalistaPk id;
	private String nombre;

}
