package aula19_Arrays;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		/*
		 * Criar um vetor A com 10 elementos inteiros. Implementar um programa que
		 * defina e escreva a soma de todos os elementos armazenados neste vetor
		 */
		Scanner ler = new Scanner(System.in);
		int[] vetorA = new int[10];

		int soma = 0;
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com o valor da posicao = " + i);
			vetorA[i] = ler.nextInt();
			soma += vetorA[i];
		}
		System.out.print("VetorA = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		System.out.println("A soma = " + soma);
	}

}
