package com.stefanini.aula12;

public class Loop {

	public static void main(String[] args) {
		
		// while
		int count = 101;
		
		while (count < 100) {
			System.out.println("count: " + count);
			count++;
		}
		
		// do while
		int countDois = 101;
		
		do {
			System.out.println(countDois);
			countDois++;
		} while (countDois < 100);
		
		//for normal
		for(int i = 0; i < 100; i++) {
			System.out.println(i);
		}

	}

}
