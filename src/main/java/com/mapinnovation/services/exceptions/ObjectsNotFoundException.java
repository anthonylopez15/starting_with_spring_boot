package com.mapinnovation.services.exceptions;

public class ObjectsNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public ObjectsNotFoundException(String msg) {
		super(msg);
	}
	
	public ObjectsNotFoundException(String msg, Throwable cause) {
		super(msg, cause);
	}

}
