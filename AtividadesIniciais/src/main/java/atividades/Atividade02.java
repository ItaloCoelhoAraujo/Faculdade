package atividades;

import java.util.Scanner;

public class Atividade02 {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int N1 = sc.nextInt();
		System.out.println("Digite outro numero: ");
		int N2 = sc.nextInt();
		
		float media = (N1+N2)/2;
		
		if(media >= 6) {
			System.out.println("Aprovado!!");
		}
		else {
			System.out.println("Reprovado!!");
		}
	}

}
