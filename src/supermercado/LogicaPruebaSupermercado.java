package supermercado;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class LogicaPruebaSupermercado {

	public String[] docenasPrecio(int docenas, int precio) {	
		Integer descuento = (int) ((docenas*precio)*0.15);
		Integer montoPagar = (int) ((docenas*precio) - ((docenas*precio) * 0.16));
		Integer totalBruto = docenas*precio;
		String[] resultados = {descuento + "", montoPagar + "", totalBruto + "", "true"};
		
		if(docenas > 3) {
			
			System.out.println("Monto de la compra total: " + totalBruto + " Monto de descuento: " +  descuento + " Monto a pagar: " + montoPagar  + " Unidades de obsequio: " + (docenas-3)); 
			
		}else {
			
			System.out.println("Monto de la compra total: " + (docenas*precio) + " Monto de descuento: " +  descuento + " Monto a pagar: " +  montoPagar + " Unidades de obsequio: 0"); 
			
		}
		return resultados;
	}
	
	
	public void validaciones(HashMap<Integer, List<String>> testeos) {
		HashMap<Integer, List<String>> correctos = new HashMap<Integer, List<String>>();
		HashMap<Integer, List<String>> fallidos = new HashMap<Integer, List<String>>();
		
		System.out.println("-------------------------------------------------------------");
		System.out.println("Resultados finales");
		for(Entry<Integer, List<String>> testeo: testeos.entrySet()) {
			if(testeo.getValue().get(2).equals("true")) {
				correctos.put(testeo.getKey(), testeo.getValue());
			}else {
				fallidos.put(testeo.getKey(), testeo.getValue());
			}
		}
		
		System.out.println("Pruebas realizadas correctamente: " + correctos.size() + " y pruebas realizadas fallidas: " + fallidos.size());
		if(fallidos.size() >= 1) {
			System.out.println("Pruebas fallidas: ");
			for(Entry<Integer, List<String>> fallida: fallidos.entrySet()) {
				System.out.println("-Prueba numero " + fallida.getKey() + " testeada con la docena " + fallida.getValue().get(0) + " y el precio " + fallida.getValue().get(1));
			}
		}else {
			
			System.out.println("No hubieron pruebas fallidas");
		
		}
	}
}
