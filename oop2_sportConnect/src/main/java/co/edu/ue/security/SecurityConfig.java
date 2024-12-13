package co.edu.ue.security;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity 
@Configuration
public class SecurityConfig {
	@Bean
	public InMemoryUserDetailsManager userManager() throws Exception{	
		List<UserDetails> users = List.of(
				User
				.withUsername("userWeb")				
				.password("{noop}userWeb")
				.roles("USERS")
				.build(),	
				User
				.withUsername("userOthers")
				.password("{noop}userWebO")
				.roles("OTHER")
				.build(),
				User
				.withUsername("userAdmin")
				.password("{noop}userWebA")
				//.password(passdEncoder().encode("userWebA"))
				.roles("ADMINS")
				.build()
				);
		return new InMemoryUserDetailsManager(users);
	}
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
		http.csrf(cus->cus.disable())
		.authorizeHttpRequests(aut->
			aut.requestMatchers(HttpMethod.POST,"/datos").hasAnyRole("ADMINS")
			.requestMatchers(HttpMethod.GET,"/api/categoria").authenticated()
			.requestMatchers(HttpMethod.GET,"/api").authenticated()			
			
			)
		.httpBasic(Customizer.withDefaults());
		return http.build();
	}
}
