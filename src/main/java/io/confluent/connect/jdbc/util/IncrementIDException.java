package io.confluent.connect.jdbc.util;
public class IncrementIDException extends Exception {
	public IncrementIDException ()  {} ;
	public IncrementIDException (String message) {
		super(message); 
	}

}
