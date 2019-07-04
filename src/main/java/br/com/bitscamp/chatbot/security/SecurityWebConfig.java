package br.com.bitscamp.chatbot.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.servlet.PathRequest;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class SecurityWebConfig extends WebSecurityConfigurerAdapter{

    @Autowired
	private UsuarioUserDetailService usuarioDetailsService;

	@Override
	protected void configure(HttpSecurity http) throws Exception{
		http
//						.csrf().disable()
						.authorizeRequests()
							.requestMatchers(PathRequest.toStaticResources().atCommonLocations()).permitAll()
							.antMatchers(HttpMethod.GET, "/").hasRole("ADMIN")
//							.antMatchers(HttpMethod.GET, "/cadastrarEvento").hasRole("ADMIN")
//							.antMatchers(HttpMethod.POST, "/cadastrarEvento").hasRole("ADMIN")
							.anyRequest().authenticated()
						.and()
						.formLogin()
							.loginPage("/login").permitAll()
						.and().logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout"));
	}

	@Override
	protected void configure(AuthenticationManagerBuilder builder) throws Exception{
		builder
		.userDetailsService(usuarioDetailsService)
		.passwordEncoder(new BCryptPasswordEncoder());
	}


}