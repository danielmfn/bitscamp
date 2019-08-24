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
						"https://danielmfn.github.io/bitscamp-frontend")
				.allowedMethods("GET", "POST", "PUT", "DELETE", "HEAD")
				.allowedHeaders("Content-Type", "Accept", "X-Requested-With", "remember-me")
				.allowCredentials(true);
	}

}
