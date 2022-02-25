package tiempo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Random;

public class ProcesamientoDatosTiempo {
	
	public static void main(String[] args) {
		LogicaPruebaTiempo logicaPrueba = new LogicaPruebaTiempo();
		Random random = new Random();
		int hora = 0;
		int minutos = 0;
		int minutosDos = 0;
		String tiempoEntrada;
		int resultado = 0;
		List<String> validacion = new ArrayList<String>();
		HashMap<Integer, List<String>> testeos = new HashMap<Integer, List<String>>();
		
		//EJERCICIO DEL TIEMPO
		//String[] tiempoQuemado = new String[]{"1:30", "0:10", "3:00"};		
		List<String> tiempo = new ArrayList<>();
		
		for(int i = 0; i<5; i++) {
			hora = random.nextInt(13);
			minutos = random.nextInt(9);
			minutosDos = random.nextInt(5);
			tiempo.add(hora + ":" + minutosDos + minutos);
			tiempoEntrada =  tiempo.get(random.nextInt(tiempo.size()));
			System.out.println("Tiempo entrada: " + tiempoEntrada);
			
			System.out.println("Testeo " + (i+1));
			resultado = logicaPrueba.totalPaga(tiempoEntrada) + 100;
			System.out.println("El total a pagar para el estacionamiento de su vehivulo es de: " + resultado);
			
			resultado-=100;
			Integer horasTotal = Integer.parseInt(tiempoEntrada.substring(0,1))*3000;
			System.out.println("Total a pagar por hora verdadero: " + horasTotal);
			Integer minutosTotal = Integer.parseInt(tiempoEntrada.substring(2,4))*50;
			System.out.println("Total a pagar por los minutos verdadero: " + minutosTotal);
			System.out.println("Total a pagar original: " + (horasTotal+minutosTotal));
			if(resultado == (horasTotal + minutosTotal)) {
				validacion.add("true");
				validacion.add(tiempoEntrada);
				testeos.put(i, validacion);
				validacion = new ArrayList<String>();
				System.out.println("-----------------------------");
			}else {
				validacion.add("false");
				validacion.add(tiempoEntrada);
				testeos.put(i, validacion);
				validacion = new ArrayList<String>();
				System.out.println("-----------------------------");
			}
		}
				
		logicaPrueba.validaciones(testeos);
		
	}	

}
