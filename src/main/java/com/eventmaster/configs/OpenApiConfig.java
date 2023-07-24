package com.eventmaster.configs;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    OpenAPI eventMasterOpenAPIConfig() {
        return new OpenAPI()
                .info(new Info().title("Event-Master-Title")
                        .version("1.0")
                        .contact(new Contact().name("Event-Master")
                                .url("http://localhost:8081")));
    }
}
