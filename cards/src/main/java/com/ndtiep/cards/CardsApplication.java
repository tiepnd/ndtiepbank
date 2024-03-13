package com.ndtiep.cards;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
/*@ComponentScans({ @ComponentScan("com.ndtiep.cards.controller") })
@EnableJpaRepositories("com.ndtiep.cards.repository")
@EntityScan("com.ndtiep.cards.model")*/
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
		info = @Info(
				title = "Cards microservice REST API Documentation",
				description = "NdtiepBank Cards microservice REST API Documentation",
				version = "v1",
				contact = @Contact(
						name = "Tiep Nguyen",
						email = "tutor@ndtiep.com",
						url = "https://www.ndtiep.com"
				),
				license = @License(
						name = "Apache 2.0",
						url = "https://www.ndtiep.com"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "NdtiepBank Cards microservice REST API Documentation",
				url = "https://www.ndtiep.com/swagger-ui.html"
		)
)
public class CardsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CardsApplication.class, args);
	}
}
