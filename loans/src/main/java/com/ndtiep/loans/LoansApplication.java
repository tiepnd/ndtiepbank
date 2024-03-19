package com.ndtiep.loans;

import com.ndtiep.loans.dto.LoansContactInfoDto;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
/*@ComponentScans({ @ComponentScan("com.ndtiep.loans.controller") })
@EnableJpaRepositories("com.ndtiep.loans.repository")
@EntityScan("com.ndtiep.loans.model")*/
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@EnableConfigurationProperties(LoansContactInfoDto.class)
@OpenAPIDefinition(
        info = @Info(
                title = "Loans microservice REST API Documentation",
                description = "NdtiepBank Loans microservice REST API Documentation",
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
                description = "NdtiepBank Loans microservice REST API Documentation",
                url = "https://www.ndtiep.com/swagger-ui.html"
        )
)
public class LoansApplication {

    public static void main(String[] args) {
        SpringApplication.run(LoansApplication.class, args);
    }
}
