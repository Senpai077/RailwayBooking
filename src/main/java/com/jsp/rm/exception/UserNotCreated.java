package com.jsp.rm.exception;

public class UserNotCreated extends RuntimeException{
	@Override
	public String getMessage() {
		return "failed to create user";
	}

}
