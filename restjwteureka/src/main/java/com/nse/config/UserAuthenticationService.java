package com.nse.config;

import org.springframework.security.core.userdetails.User;

public interface UserAuthenticationService {
	public boolean isValiduser(User user);

}
