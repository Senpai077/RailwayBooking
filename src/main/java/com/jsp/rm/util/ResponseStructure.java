package com.jsp.rm.util;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResponseStructure<T> {
	 int statusCode;
	 String Message;
	 T data;

}
