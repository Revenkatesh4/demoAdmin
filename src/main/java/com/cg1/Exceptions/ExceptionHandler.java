package com.cg1.Exceptions;

public class ExceptionHandler extends RuntimeException {
       String msg;
	
	 public ExceptionHandler(String msg) {
		this.msg=msg;
	}
	
	@Override
	public String getMessage() {
		return msg;
		
	}
}

