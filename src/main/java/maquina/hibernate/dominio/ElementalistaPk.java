package maquina.hibernate.dominio;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * Clase que representa el id compuesto de la clase {@link Elementalista}
 * 
 * @author MaQuiNa1995
 *
 */
@Embeddable
@Getter
@Setter
@EqualsAndHashCode
public class ElementalistaPk implements Serializable {

	private Long poder;
	private String elemento;

}
