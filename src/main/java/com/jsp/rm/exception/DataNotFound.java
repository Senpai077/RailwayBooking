package com.jsp.rm.exception;

public class DataNotFound extends RuntimeException {
	@Override
	public String getMessage() {
		return "No Data found";
	}

}
