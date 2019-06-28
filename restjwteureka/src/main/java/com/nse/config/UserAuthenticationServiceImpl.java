package com.nse.config;

public class UserAuthenticationServiceImpl implements UserAuthenticationService {

	

	public boolean isValiduser(org.springframework.security.core.userdetails.User user) {
		//final String username = getUsernameFromToken(token);
		if(user.getUsername() == "asdf") {
			return true;
		}
		return false;
		
	}

}
