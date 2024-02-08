package com.jsp.rm.exception;

public class UnableToCreated extends RuntimeException{
	@Override
	public String getMessage() {
		return "failed to create user";
	}

}
