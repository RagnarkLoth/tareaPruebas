package edades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class ProcesamientoEdades {
	
	public static void main(String[] args) { 
		
		LogicaEdades logica = new LogicaEdades();
		Random random = new Random();
		int edadJuan = 0;
		int edadMario = 0;
		int edadPedro = 0;
		
		List<String> datos = new ArrayList<String>();
		HashMap<Integer, List<String>> validaciones = new HashMap<Integer, List<String>>();
		
		//Integer[] edades = new Integer[] {17, 18, 21, 22, 11, 13, 15,12,11,16};
		for(int i = 0; i <5; i++) {
			System.out.println("-----------------------------------------");
			System.out.println("Evalucion de pruebas");
			edadJuan = random.nextInt(100);
			System.out.println("Primera edad: " + edadJuan);
			edadMario = random.nextInt(100);
			System.out.println("Segunda edad: " + edadMario);
			edadPedro = random.nextInt(100);
			System.out.println("Tercera edad: " + edadPedro);
			String[] respuesta = logica.edades(edadJuan, edadMario, edadPedro);
			
			System.out.println("----------------------------------------------");
			System.out.println("Evaluacion de los resultados");
			if(Integer.parseInt(respuesta[0]) == edadJuan) {
				if(Integer.parseInt(respuesta[1]) == edadMario) {
					if(Integer.parseInt(respuesta[2]) == edadPedro) {
						if(edadJuan == edadMario && edadMario == edadPedro) {
							System.out.println("Los tres son contemporaneos");
							 System.out.println("No hay contemporaneos");
							 datos.add(edadJuan + "");
							 datos.add(edadMario + "");
							 datos.add(edadPedro + "");
							 datos.add("true");
							 validaciones.put(i+1, datos);
							 datos = new ArrayList<String>();
						}else {
							if(edadJuan == edadMario) {
								System.out.println("Juan y Mario son contemporaneos");
								 System.out.println("No hay contemporaneos");
								 datos.add(edadJuan + "");
								 datos.add(edadMario + "");
								 datos.add(edadPedro + "");
								 datos.add("true");
								 validaciones.put(i+1, datos);
								 datos = new ArrayList<String>();
							}else {
								if(edadJuan == edadPedro) {
									 System.out.println("Juan y Pedro son contemporaneos");
									 System.out.println("No hay contemporaneos");
									 datos.add(edadJuan + "");
									 datos.add(edadMario + "");
									 datos.add(edadPedro + "");
									 datos.add("true");
									 validaciones.put(i+1, datos);
									 datos = new ArrayList<String>();
								}else {
										if(edadMario == edadPedro) {
											 System.out.println("Mario y pedro son contemporaneos");
											 System.out.println("Juan y Pedro son contemporaneos");
											 System.out.println("No hay contemporaneos");
											 datos.add(edadJuan + "");
											 datos.add(edadMario + "");
											 datos.add(edadPedro + "");
											 datos.add("true");
											 validaciones.put(i+1, datos);
											 datos = new ArrayList<String>();
										}else {
											 System.out.println("No hay contemporaneos");
											 datos.add(edadJuan + "");
											 datos.add(edadMario + "");
											 datos.add(edadPedro + "");
											 datos.add("true");
											 validaciones.put(i+1, datos);
											 datos = new ArrayList<String>();
										}
									}
							}
						}
					}else {
						System.out.println("La tercera edad no es igual a la edad entregada en la logica, error linea 34");
						 datos.add(edadJuan + "");
						 datos.add(edadMario + "");
						 datos.add(edadPedro + "");
						 datos.add("false");
						 validaciones.put(i+1, datos);
					}
				}else {
					System.out.println("La segunda edad no es igual a la edad entregada en la logica, error linea 33");
					 datos.add(edadJuan + "");
					 datos.add(edadMario + "");
					 datos.add(edadPedro + "");
					 datos.add("false");
					 validaciones.put(i+1, datos);
				}
			}else {
				System.out.println("La primera edad no es igual a la edad entregada en la logica, error linea 32");
				 datos.add(edadJuan + "");
				 datos.add(edadMario + "");
				 datos.add(edadPedro + "");
				 datos.add("false");
				 validaciones.put(i+1, datos);
			}
			
		}
		logica.validaciones(validaciones);
		
	}

}
