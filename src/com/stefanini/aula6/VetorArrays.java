package com.stefanini.aula6;

public class VetorArrays {

	public static void main(String[] args) {
		int[] notas = new int [10];
		notas[0] = 5;
		notas[1] = 9;
		
		int[][] matriz = new int[5][5];
		
		matriz[0][1] = 5;
		matriz[2][4] = 10;
		matriz[3][2] = 15;
		
		System.out.println(matriz[0][1]);
		System.out.println(matriz[2][4]);
		System.out.println(matriz[3][2]);
		
		for (int[] m : matriz) {
			for (int v : m) {
				System.out.println(v);
			}
		}
		
	String[] meses = new String[] {"Janeiro", "Fevereiro", "Março", "Abril", "Maio"};
	
	System.out.println(meses.length);
	
	for (String m : meses) {
		System.out.println(m);
	}
		
	for (int i = 0; i < notas.length; i++) {
		System.out.println(notas[i]);
	}
	
		
		
	}

}
