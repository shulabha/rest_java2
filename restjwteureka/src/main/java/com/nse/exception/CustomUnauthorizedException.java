package com.nse.exception;

public class CustomUnauthorizedException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5944029161208516076L;
	private String s;

	public CustomUnauthorizedException(String s) {
		super(s);
		this.s = s;
	}
	

}
