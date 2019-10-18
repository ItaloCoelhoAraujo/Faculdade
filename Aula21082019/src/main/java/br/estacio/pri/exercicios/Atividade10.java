package br.estacio.pri.exercicios;

public class Atividade10 {

	public static void main(String[] args) {
		int a = Entrada.proximoInt("Digite um numero:", "Entrada de dados");
		int b = Entrada.proximoInt("Digite outro numero:", "Entrada de dados");
		int c = Entrada.proximoInt("Digite outro numero:", "Entrada de dados");
		
		int maior, menor;
		if(a > b) {
			if(a > c) {
				maior = a;
				if(b > c)
					menor = c;
				else
					menor = b;
			}
			else {
				maior = c;
				menor = b;
			}
		}
		else if(b > c) {
			maior = b;
			if(a > c)
				menor = c;
			else
				menor = a;
		}
		else {
			maior = c;
			menor = a;
		}
		
		Saida.normal("O maior e: " + maior +
					 "\nO menor e: " + menor, "Resultado");
	}

}
