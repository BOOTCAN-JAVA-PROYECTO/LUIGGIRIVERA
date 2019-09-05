package com.brayancloud.microservice.models;

public class Greeting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	private final long id;
	private final String contenido;
	
	
	public long getId() {
		return id;
	}


	public String getContenido() {
		return contenido;
	}


	public Greeting(long id,String contenido) {
		this.id=id;
		this.contenido=contenido;
	}
	
	
}
