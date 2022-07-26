package com.stefanini.aula4;

public class Vetor {

	public static void main(String[] args) {
		int[] notas = new int[10];
		
		notas[0] = 1;
		notas[2] = 5;
		notas[6] = 9;
		notas[4] = 2;
		notas[1] = 4;
		notas[9] = 7;
		notas[7] = 8;
		// notas [11] = 10;

		String[] carros = new String[] {"Honda Civic", "Toyota Corolla", "Jac J3", "Tesla Model S", "Mercedes C180"};
		
		System.out.println(carros.length);
		
		for (String carro : carros) {
			System.out.println(carro);
		}
		
	
			  
		//Sem for each, com for padrão ->
		
		/* for (int i = 0; i < carros.length; i++ ){
		 * 
		 *  System.out.println(carros[i]);
		 * 
		 * }
		 * 
		 * 
		 * 
		 */

	}		
		
}
