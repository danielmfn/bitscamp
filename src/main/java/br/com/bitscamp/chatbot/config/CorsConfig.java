package br.com.bitscamp.chatbot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

	@Override
	public void addCorsMappings(CorsRegistry registry) {

		registry.addMapping("/**")
				.allowedOrigins(
						"http://localhost:63342",
						"https://bitscamp.github.io")
				.allowedMethods("GET", "POST", "PUT", "DELETE", "HEAD")
				.allowedHeaders("*")
				.allowCredentials(true);
	}

}
