package com.stefanini.aula9_10_11_15_16_17;

import com.stefanini.aula9_10_11_15_16_17.entidades.BMW;
import com.stefanini.aula9_10_11_15_16_17.entidades.Tesla;

public class Principal {
	
	static int valor = 10;
	static void print() {
		System.out.println(valor);
	}
	public static void main(String[] args) {
		
		valor = 10;
		print();
		
		 /*Carro bmw = new Carro(); 
		 bmw.setMarca("BMW"); 
		 bmw.setModelo("M3");
		 bmw.setQuilometrosPorLitro(7.5); bmw.setTaxaAceleracao(50);
		 bmw.setVelocidadeMaxima(280);
		  
		 Carro mercedes = new Carro("Mercedes", "C120");*/
		

		BMW bmwDois = new BMW();
		Tesla tesla = new Tesla();
		tesla.isDirigeSozinho();
		bmwDois.piscarAlerta();

		BMW bmwTres = null;
		// bmwTres.acelerar();

		try {
			bmwDois.setVelocidadeMaxima(10);
		} catch (NegocioException e) {
			System.out.println(e);
		} finally {
			System.out.println("Passou");
		}

		Carro teslaDois = new Tesla();
		((Tesla) teslaDois).setDirigeSozinho(true);
		System.out.println(((Tesla) teslaDois).isDirigeSozinho());
		teslaDois.piscarAlerta();

		Carro[] carros = new Carro[] { bmwDois, tesla, teslaDois };

		for (Carro carro : carros) {
			if(Constantes.MARCA_FAMOSA.equals(carro.getMarca())) {
				System.out.println("Carro de marca famosa");
			}
			if (carro instanceof Tesla) {
				System.out.println(((Tesla) carro).isDirigeSozinho());
			}
		}
		
		Calcular.soma(0, 0);
		
		
		
		
		bmwDois.calcularTaxaAceleracao(100.50, 10);
		tesla.calcularTaxaAceleracao(100.50, 10);

		/*
		 * System.out.println(bmwDois.calcularTaxaAceleracao(100.5, 10.5));
		 * 
		 * System.out.println(mercedes.getMarca());
		 * System.out.println(mercedes.getModelo());
		 * 
		 * System.out.println(bmw.getMarca()); System.out.println(bmw.getModelo());
		 * System.out.println(bmw.getQuilometrosPorLitro());
		 * System.out.println(bmw.getTaxaAceleracao());
		 * System.out.println(bmw.getVelocidadeMaxima());
		 * 
		 * bmw.acelerar(); bmw.frear();
		 * 
		 * System.out.println(bmw.calcularTaxaAceleracao(bmw.getVelocidadeMaxima(), 0,
		 * 10, 0));
		 * System.out.println(bmw.calcularTaxaAceleracao(bmw.getVelocidadeMaxima(), 5));
		 * System.out.println(bmw.calcularTaxaAceleracao(100, 5));
		 */

	}

}
