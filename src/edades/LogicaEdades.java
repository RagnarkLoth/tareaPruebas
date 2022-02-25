package edades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class LogicaEdades {

	public String[] edades(int edadJuan, int edadMario, int edadPedro) {

		String[] edades = {edadJuan + "", edadMario + "", edadPedro + ""};
		
		if(edadJuan == edadMario && edadMario == edadPedro) {
			System.out.println("Los tres son contemporaneos");
		}else {
			if(edadJuan == edadMario) {
				 System.out.println("Juan y Mario son contemporaneos");
			}else {
				if(edadJuan == edadPedro) {
					 System.out.println("Juan y Pedro son contemporaneos");
				}else {
					if(edadMario == edadPedro) {
						 System.out.println("Mario y pedro son contemporaneos");
					}else {
						 System.out.println("No hay contemporaneos");
					}
				}
			}
		}
		return edades;
	}
	
	public void validaciones(HashMap<Integer, List<String>> testeos) {
		HashMap<Integer, List<String>> correctos = new HashMap<Integer, List<String>>();
		HashMap<Integer, List<String>> fallidos = new HashMap<Integer, List<String>>();
		
		System.out.println("-------------------------------------------------------------");
		System.out.println("Resultados finales");
		for(Entry<Integer, List<String>> testeo: testeos.entrySet()) {
			if(testeo.getValue().get(3).equals("true")) {
				correctos.put(testeo.getKey(), testeo.getValue());
			}else {
				fallidos.put(testeo.getKey(), testeo.getValue());
			}
		}
		
		System.out.println("Pruebas realizadas correctamente: " + correctos.size() + " y pruebas realizadas fallidas: " + fallidos.size());
		if(fallidos.size() >= 1) {
			System.out.println("Pruebas fallidas: ");
			for(Entry<Integer, List<String>> fallida: fallidos.entrySet()) {
				System.out.println("-Prueba numero " + fallida.getKey() + " testeada con la primera edad " + fallida.getValue().get(0) + " la seunda edad " + fallida.getValue().get(1) + " la tercera edad " + fallida.getValue().get(2));
			}
		}else {
			
			System.out.println("No hubieron pruebas fallidas");
		
		}
	}
	
}
