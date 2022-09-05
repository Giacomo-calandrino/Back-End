package com.epicode.bookingapp.user;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfiguration {

	@Bean("user1")
	public User newUser1() {
		return new User("gcmo","Giacomo Calandrino","giacomocalandrino@email.com");
	}
	@Bean("user2")
	public User newUser2() {
		return new User("mrrsi","Mario Rossi","mariorossi@email.com");
	}
	@Bean("user3")
	public User newUser3() {
		return new User("crlvrdi","Carlo Verdi","carloverdi@email.com");
	}
}
