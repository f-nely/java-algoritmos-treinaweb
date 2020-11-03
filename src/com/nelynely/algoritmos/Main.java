package com.nelynely.algoritmos;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		int[] numeros = new int[6];
		
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Informe um n�mero: ");
			int numero = scan.nextInt();
			numeros[i] = numero;
		}
		// **Busca liner
		System.out.println("** BUSCA LINEAR **");
		System.out.println("Digite o n�mero a ser pesquisado: ");
		int alvo = scan.nextInt();
		int posicaoResultado = -1;
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] == alvo) {
				posicaoResultado = i;
				break;
			}
		}
		if (posicaoResultado < 0) {
			System.out.println("Elemento n�o foi encontrado: ");
		} else {
			System.out.println(String.format("O n�mero %d foi encontrado na posi��o %d", alvo, posicaoResultado));
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
