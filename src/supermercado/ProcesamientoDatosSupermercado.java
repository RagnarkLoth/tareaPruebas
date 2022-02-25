package supermercado;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class ProcesamientoDatosSupermercado {

	public static void main(String[] args) {
		
		//Integer[][] docenasPrecios = new Integer[][] {{12,10000}, {40,20000}, {30, 30000}};
		
		Random random = new Random();
		LogicaPruebaSupermercado logicaPrueba = new LogicaPruebaSupermercado();
		int precio = 0;
		int docenas = 0;
		String[] resultado;
		HashMap<Integer, List<String>> testeos = new HashMap<Integer, List<String>>();
		List<String> datos = new ArrayList<String>();

		
		for(int i = 0; i<5; i++) {
			System.out.println("-----------------------------------------");
			System.out.println("Evalucion de pruebas");
			precio = random.nextInt(20000);
			System.out.println("Precio: " + precio);
			docenas = random.nextInt(100000);
			System.out.println("Docenas: " + docenas);
			resultado = logicaPrueba.docenasPrecio(docenas, precio);
			
			System.out.println("----------------------------------------------");
			System.out.println("Evaluacion de los resultados");
			Integer descuento = (int) ((docenas*precio)*0.15);
			Integer montoPagar = (int) ((docenas*precio) - ((docenas*precio) * 0.15));
			Integer montoBruto = (docenas*precio);
			if(docenas > 3) {
				if(Integer.parseInt(resultado[0]) == descuento) {
					if(Integer.parseInt(resultado[1]) == montoPagar) {
						if(Integer.parseInt(resultado[2]) == montoBruto) {
							if(resultado[3].equals("true")) {
								System.out.println("Monto de la compra total: " + montoBruto  + " Monto de descuento: " +  descuento + " Monto a pagar: " +  montoPagar + " Unidades de obsequio: " + (docenas-3)); 
								datos.add(docenas+"");
								datos.add(precio + "");
								datos.add("true");
								testeos.put((i+1), datos);
								datos = new ArrayList<String>();
							}else {
								System.out.println("Hubo un fallo en la validacion de resultados de la linea 22");
								datos.add(docenas+"");
								datos.add(precio + "");
								datos.add("false");
								testeos.put((i+1), datos);
								datos = new ArrayList<String>();
							}
						}else {
							System.out.println("Hubo un fallo en la validacion de resultados de la linea 40 en la validacion del monto bruto");
							datos.add(docenas+"");
							datos.add(precio + "");
							datos.add("false");
							testeos.put((i+1), datos);
							datos = new ArrayList<String>();
						}
					}else {
						System.out.println("Hubo un fallo en la validacion de resultados de la linea 39 en la validacion del monto a pagar");
						datos.add(docenas+"");
						datos.add(precio + "");
						datos.add("false");
						testeos.put((i+1), datos);
						datos = new ArrayList<String>();
					}
				}else {
					System.out.println("Hubo un fallo en la validacion de resultados de la linea 38 en la validacion de los descuentos");
					datos.add(docenas+"");
					datos.add(precio + "");
					datos.add("false");
					testeos.put((i+1), datos);
					datos = new ArrayList<String>();
				}
			}else {
				if(Integer.parseInt(resultado[0]) == descuento) {
					if(Integer.parseInt(resultado[1]) == montoPagar) {
						if(Integer.parseInt(resultado[2]) == montoBruto) {
							if(resultado[3].equals("true")) {
								System.out.println("Monto de la compra total: " + (docenas*precio) + " Monto de descuento: " + descuento + " Monto a pagar: " +  montoPagar + " Unidades de obsequio: 0"); 
								datos.add(docenas+"");
								datos.add(precio + "");
								datos.add("true");
								testeos.put((i+1), datos);
								datos = new ArrayList<String>();
							}else {
								System.out.println("Hubo un fallo en la validacion de resultados de la linea 84");
								datos.add(docenas+"");
								datos.add(precio + "");
								datos.add("false");
								testeos.put((i+1), datos);
								datos = new ArrayList<String>();
							}
						}else {
							System.out.println("Hubo un fallo en la validacion de resultados de la linea 83 en la validacion del monto bruto");
							datos.add(docenas+"");
							datos.add(precio + "");
							datos.add("false");
							testeos.put((i+1), datos);
							datos = new ArrayList<String>();
						}
					}else {
						System.out.println("Hubo un fallo en la validacion de resultados de la linea 82 en la validacion del monto a pagar");
						datos.add(docenas+"");
						datos.add(precio + "");
						datos.add("false");
						testeos.put((i+1), datos);
						datos = new ArrayList<String>();
					}
				}else {
					System.out.println("Hubo un fallo en la validacion de resultados de la linea 81 en la validacion de los descuentos");
					datos.add(docenas+"");
					datos.add(precio + "");
					datos.add("false");
					testeos.put((i+1), datos);
					datos = new ArrayList<String>();
				}
			}
		}
		
		logicaPrueba.validaciones(testeos);
		
	}
	
}
