package com.nelynely.algoritmos;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		int[] numeros = new int[6];
		
		Scanner scan = new Scanner(System.in);
		//Escrita dos dados
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Informe um número: ");
			int numero = scan.nextInt();
			numeros[i] = numero;
		}
		//Leitura dos dados
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
		scan.close();
	}

}
