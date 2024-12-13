package co.edu.ue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = {"co.edu.ue.model"})
@EnableJpaRepositories(basePackages = {"co.edu.ue.repository"})
@ComponentScan(basePackages = {"co.edu.ue.service","co.edu.ue.controller","co.edu.ue.repository","co.edu.ue.security",
		"co.edu.ue"})
public class Oop2SportConnectApplication {

	public static void main(String[] args) {
		SpringApplication.run(Oop2SportConnectApplication.class, args);
	}

}
