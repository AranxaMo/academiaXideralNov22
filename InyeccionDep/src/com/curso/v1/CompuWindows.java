package com.curso.v1;

public class CompuWindows {

	String version;

	public CompuWindows(String version) {
		this.version = version;
	}

	public void encender() {
		System.out.println("Compu Windows: "+version+
				" Encendida.");
		
	}
	
}
