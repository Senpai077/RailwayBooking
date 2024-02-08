package com.jsp.rm.exception;

public class IdNotFound extends RuntimeException {
	@Override
	public String getMessage() {
		return "cannot find data with that id";
	}

}
