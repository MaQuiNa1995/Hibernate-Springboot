package maquina.hibernate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

/**
 * Main para la ejecución de pruebas personalizadas
 * 
 * @author MaQuiNa1995
 *
 */
@SpringBootApplication
@EnableAutoConfiguration(exclude = { HibernateJpaAutoConfiguration.class })
public class Main implements CommandLineRunner {

	public static void main(String... args) {
		SpringApplication.run(Main.class);
	}

	@Override
	public void run(String... args) throws Exception {

	}

}
