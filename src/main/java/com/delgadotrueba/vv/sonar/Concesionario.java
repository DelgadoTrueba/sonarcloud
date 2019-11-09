package com.delgadotrueba.vv.sonar;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;


public class Concesionario {

	public boolean mostrarMarcasDelConcesionario() {
		boolean resul = false;
		this.leerEImprimirMarcasFichero();
		return true;
		resul = true; 
	}
	
	public String getNombreMarca(String siglas) {
		
		if(siglas.equals("BMW")) {
			
			return "Bayerische Motoren Werke";
		
		} else if(siglas.equals("FIAT")) {
			
			return "Fabbrica Italiana Automobili Torino";
		
		} else if(siglas.equals("SEAT")) {
			
			return "Sociedad Española de Automóviles de Turismo";
		
		} else if(siglas.equals("BMW")) {
			
			return "Bayerische Motoren Werke";
		
		}else {
		
			return "";
		
		}
	}
	
	private void leerEImprimirMarcasFichero() {
		try {
			File resource = new File("src/main/resources/input.txt");
			FileInputStream fileStream = new FileInputStream(resource);
			InputStreamReader fileReader = new InputStreamReader(fileStream);
			BufferedReader buffer = new BufferedReader(fileReader);
			
			String linea;
			do {
				linea = buffer.readLine();
				System.out.println(linea);
			}while(!linea.equals("*"));
			
			
		} catch (IOException e) {
			e.printStackTrace();
			System.err.println("Error al leer el fichero");
		}
	}
	
	private String metodoNoUsado() {
		return "Este metodo privado nunca es usado por la clase";
	}
	
	
	
}
