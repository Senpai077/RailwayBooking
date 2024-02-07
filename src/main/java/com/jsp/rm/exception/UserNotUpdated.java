package com.jsp.rm.exception;

public class UserNotUpdated extends RuntimeException {
	@Override
	public String getMessage() {
		return "failed to update user";
	}

}
