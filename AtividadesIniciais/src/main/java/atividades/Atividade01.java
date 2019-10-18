package atividades;

import java.util.Scanner;

public class Atividade01 {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int num1, num2;
		
		System.out.println("Digite o primeiro numero: ");
		num1 = sc.nextInt();
		System.out.println("Digite o segundo numero: ");
		num2 = sc.nextInt();
		
		if(num1 > num2) {
			System.out.println("O maior e: " + num1);
		}
		else {
			System.out.println("O maior e: " + num2);
		}
	}

}
