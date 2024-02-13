package Ejecutables;

import Librerias.Serpentario;

public class PruebaSerpentario {
	
	public static void main(String[] args) {
		Serpentario s= new Serpentario("Guameru", 5555555);
		System.out.println(s.altaSerpiente("Mamba negra", "elapidos", "aves chicas, roedores"));
		System.out.println(s.altaSerpiente("Cascabel", "viperidos", "lagartijas, roedores"));
		System.out.println(s.altaSerpiente("Atheris hispida", "viperidos", "mamiferos pequenos"));
		System.out.println(s.altaSerpiente("Serpiente marina", "elapidos", "pescado"));
		System.out.println(s.altaSerpiente("Boa de arena de la India", "boidos", "roedores"));
		System.out.println(s.altaSerpiente("Piton real", "pitonidos", "aves chicas, roedores"));
		System.out.println(s.altaSerpiente("Serpiente Taipan", "elapidos", "aves chicas, roedores"));
		System.out.println(s.altaSerpiente("Piton de olivo", "pitonidos", "aves chicas, roedores"));
		System.out.println(s.altaSerpiente("Cobra egipcia", "elapidos", "serpientes, mamiferos pequenos"));
		System.out.println(s.altaSerpiente("Boa cubana", "boidos", "roedores"));
		System.out.println(s.altaSerpiente("Vibora aspid", "viperidos", "roedores"));
		System.out.println(s.altaSerpiente("Boa esmeralda", "boidos", "mamiferos pequenos"));
		System.out.println(s.altaSerpiente("Coralillo", "elapidos", "mamiferos pequenos"));
		System.out.println(s.altaSerpiente("Mazacuta", "boidos", "mamiferos pequenos"));
		System.out.println(s.altaSerpiente("Cobra Real", "elapidos", "serpientes"));
		System.out.println(s.altaSerpiente("Anaconda de manchas oscuras", "boidos", "mamiferos"));
		

		System.out.println("Cuantas serpientes se alimentan de mamiferos pequenos?\n    "+s.alimentacion("mamiferos pequenos"));
		System.out.println("El tipo de serpiente con mas ejemplares es:\n    "+s.ejemplares());
		System.out.println("El ejemplar 105 es: " + s.consulta(105));
		if(s.bajaSerpiente(105))
			System.out.println("baja exitosa");
		else
			System.out.println("baja fallida");
		
		System.out.println(s.toString());
		
			
		
	}
}

