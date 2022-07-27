package com.stefanini.aula13;

public class For {

	public static void main(String[] args) {
		// for normal
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		// for apenas com a condição
		int i = 0;
		
		for(; i < 10;) {
			System.out.println(i);
			i++;
		}
		
		// for com loop infinito
		for(;;) {
			System.out.println("Loop Infinito");
		}

	}

}
