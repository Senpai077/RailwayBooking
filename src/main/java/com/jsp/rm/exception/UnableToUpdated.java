package com.jsp.rm.exception;

public class UnableToUpdated extends RuntimeException {
	@Override
	public String getMessage() {
		return "failed to update user";
	}

}
