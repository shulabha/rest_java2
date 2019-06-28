package com.nse.config;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nse.exception.CustomUnauthorizedException;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@RestController
@RequestMapping("/auth")
public class JWTToken {
	private static final Logger LOGGER = LoggerFactory.getLogger(JWTToken.class);
	
	@Value("${jwt.secret}")
	private String secret;
	
	@Value("${jwt.expirationTime}")
	private String expirationTime;

	@Autowired
	UserAuthenticationService authenticationService;

	@SuppressWarnings("deprecation")
	@PostMapping
	public String getToken(@RequestBody User user) {
		LOGGER.info("Auth service");
		String token = null;
		if (authenticationService.isValiduser(user)) {
			LOGGER.info("Valid user Generating Token");
			token = Jwts.builder().setSubject(user.getUsername())
					.setExpiration(new Date(System.currentTimeMillis() + expirationTime))
					.signWith(SignatureAlgorithm.HS512,secret.getBytes()).compact();
			LOGGER.info("Generated Token " + token);
			return "Auth " + token;
		} else {
			LOGGER.error("Invalid User");
			throw new CustomUnauthorizedException("Not a valid User");
		}
	}

}
