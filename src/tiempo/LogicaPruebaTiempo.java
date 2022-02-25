package tiempo;

import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class LogicaPruebaTiempo {
	
	public int totalPaga(String tiempo) {
		
		System.out.println(tiempo);
		Integer horasTotal = Integer.parseInt(tiempo.substring(0,1))*3000;
		System.out.println("Total a pagar por hora: " + horasTotal);
		Integer minutosTotal = Integer.parseInt(tiempo.substring(2,4))*50;
		System.out.println("Total a pagar por los minutos: " + minutosTotal);
		
		return horasTotal+minutosTotal;
		
	}

	public void validaciones(HashMap<Integer, List<String>> testeos) {
		HashMap<Integer, List<String>> correctos = new HashMap<Integer, List<String>>();
		HashMap<Integer, List<String>> fallidos = new HashMap<Integer, List<String>>();
		
		for(Entry<Integer, List<String>> testeo: testeos.entrySet()) {
			if(testeo.getValue().get(0).equals("true")) {
				correctos.put(testeo.getKey(), testeo.getValue());
			}else {
				fallidos.put(testeo.getKey(), testeo.getValue());
			}
		}
		
		System.out.println("Pruebas realizadas correctamente: " + correctos.size() + " y pruebas realizadas fallidas: " + fallidos.size());
		if(fallidos.size() >= 1) {
			System.out.println("Pruebas fallidas: ");
			for(Entry<Integer, List<String>> fallida: fallidos.entrySet()) {
				System.out.println("-Prueba numero " + (fallida.getKey() + 1) + " testeada con el tiempo " + fallida.getValue().get(1));
			}
		}else {
			
			System.out.println("No hubieron pruebas fallidas");
		
		}
	}

}
