package com.nelynely.algoritmos;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		int[] numeros = new int[6];
		
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Informe um número: ");
			int numero = scan.nextInt();
			numeros[i] = numero;
		}
		// **Busca liner
		System.out.println("** BUSCA LINEAR **");
		System.out.println("Digite o número a ser pesquisado: ");
		int alvo = scan.nextInt();
		int posicaoResultado = -1;
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] == alvo) {
				posicaoResultado = i;
				break;
			}
		}
		if (posicaoResultado < 0) {
			System.out.println("Elemento não foi encontrado: ");
		} else {
			System.out.println(String.format("O número %d foi encontrado na posição %d", alvo, posicaoResultado));
		}
		// ** FIM BUSCA LINEAR **
		System.out.println("Vetor: ");
		imprimirArray(numeros);
		scan.close();
	}
	
	private static void imprimirArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
