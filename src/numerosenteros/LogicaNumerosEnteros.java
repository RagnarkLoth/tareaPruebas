package numerosenteros;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class LogicaNumerosEnteros {
	
	public String numeroEntero(Integer numero) {
		
		String resultado;
		if(numero > 0) {
			if(numero%2 == 0) {
				resultado = "Par positivo";
			}else {
				resultado = ("Impar positivo");
			}
		}else {
			if(numero%2 == 0) {
				resultado = ("Par negativo");
			}else {
				resultado = ("Impar negativo");
			}
		}
		return resultado;				
	}
	
	public void validaciones(HashMap<Integer, Boolean> testeos) {
		List<Integer> correctos = new ArrayList<Integer>();
		List<Integer> fallidos = new ArrayList<Integer>();
		
		
		for(Entry<Integer, Boolean> testeo: testeos.entrySet()) {
			if(testeo.getValue().equals(true)) {
				correctos.add(testeo.getKey());
			}else {
				fallidos.add(testeo.getKey());
			}
		}
		
		System.out.println("Pruebas realizadas correctamente: " + correctos.size() + " y pruebas realizadas fallidas: " + fallidos.size());
		if(fallidos.size() >= 1) {
			System.out.println("Pruebas fallidas: ");
			for(int i = 0; i < fallidos.size(); i++) {
				System.out.println("-Prueba numero " + (i+1) + " testeada con el numero " + fallidos.get(i));
			}
		}else {
			
			System.out.println("No hubieron pruebas fallidas");
		
		}
	}

}
