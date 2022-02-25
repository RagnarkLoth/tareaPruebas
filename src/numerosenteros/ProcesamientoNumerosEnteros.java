package numerosenteros;

import java.util.HashMap;
import java.util.Random;

public class ProcesamientoNumerosEnteros {
	
	public static void main(String[] args) {
		
		LogicaNumerosEnteros logicaNumerosEnteros = new LogicaNumerosEnteros();
		String resultadosLogica;
		String resultado;
		Integer numero;
		Random random = new Random();
		
		HashMap<Integer, Boolean> testeos = new HashMap<Integer, Boolean>();
		//Integer[] numeros = new Integer[] {200, -7};
		
		for(int i = 0; i<5; i++) {
						
			numero = random.nextInt(1000);
			System.out.println(logicaNumerosEnteros.numeroEntero(numero));
			resultadosLogica = logicaNumerosEnteros.numeroEntero(numero);
			
			System.out.println("Evaluacion de los resultados");
			if(numero > 0) {
				if(numero%2 == 0) {
					resultado = "Par positivo";
					if(resultado.equals(resultadosLogica)) {
						testeos.put(numero, true);
					}else {
						testeos.put(numero, false);
					}
				}else {
					resultado = ("Impar positivo");
					if(resultado.equals(resultadosLogica)) {
						testeos.put(numero, true);
					}else {
						testeos.put(numero, false);
					}
				}
			}else {
				if(numero%2 == 0) {
					resultado = ("Par negativo");
					if(resultado.equals(resultadosLogica)) {
						testeos.put(numero, true);
					}else {
						testeos.put(numero, false);
					}
				}else {
					resultado = ("Impar negativo");
					if(resultado.equals(resultadosLogica)) {
						testeos.put(numero, true);
					}else {
						testeos.put(numero, false);
					}
				}
			}

		}
		
		logicaNumerosEnteros.validaciones(testeos);
		
		
	}

}
