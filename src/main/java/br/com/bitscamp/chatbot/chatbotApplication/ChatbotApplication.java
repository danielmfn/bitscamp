package br.com.bitscamp.chatbot.chatbotApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "br.com.bitscamp.chatbot.model")
@ComponentScan(basePackages = "br.com.bitscamp.chatbot.controller")
@ComponentScan(basePackages = "br.com.bitscamp.chatbot.config")
@EnableJpaRepositories(basePackages = "br.com.bitscamp.chatbot.repository")
public class ChatbotApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChatbotApplication.class, args);
	}

}
