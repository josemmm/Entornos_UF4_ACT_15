package arraylists;

import java.util.ArrayList;
import java.util.Random;

public class ProgramaPersona {

	public static void main(String[] args) {
		ArrayList<Persona> lista_personas = new ArrayList();
		Random generador = new Random();
		
		int numero_elementos = generador.nextInt(21)+1;
		//System.out.println(numero_elementos);	

		for (int i=1; i<= numero_elementos; i++) {
			int generador_persona =  generador.nextInt(3);
			if (generador_persona == 0) {
				//System.out.println("Es una persona");
				Persona persona = new Persona();
				lista_personas.add(persona);
			} else if (generador_persona == 1) {
				//System.out.println("Es un obrero");
				Obrero obrero = new Obrero();
				lista_personas.add(obrero);
			} else {
				//System.out.println("Es un técnico");
				Tecnico tecnico = new Tecnico();
				lista_personas.add(tecnico);
			}		
		}
		
		System.out.println("El tamaño de la lista es " + lista_personas.size());
		for (Persona persona: lista_personas) {
			System.out.println(persona);
		}
	}

}
