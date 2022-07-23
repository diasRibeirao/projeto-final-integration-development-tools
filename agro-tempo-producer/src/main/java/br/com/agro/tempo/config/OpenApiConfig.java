package br.com.agro.tempo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class OpenApiConfig {
	
	@Bean
	public OpenAPI customOpenAPI() {
		var openApi = new OpenAPI().info(getInfo());

		return openApi;
	}
	
	private Info getInfo() {
		return new Info()
				.title("41SCJ / INTEGRATIONS & DEVELOPMENT TOOLS")
				.description("Avaliação Final 41SCJ - Integration e Development Tools")
				.version("1.0.0").license(getLicense());
	}
	
	private License getLicense() {
		return new License().name("Unlicense").url("https://unlicense.org/");
	}
}
