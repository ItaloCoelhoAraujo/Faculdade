package br.estacio.pri.exercicios;

public class Atividade08 {

	public static void main(String[] args) {
		int n = 1, maior = 0, menor = 1000000000, total = 0, count = 0;
		
		Saida.normal("Digite 0 e <Enter> para finalizar!", "Dica");		
		while(n != 0) {
			n = Entrada.proximoInt("Digite um numero:", "Entrada de dados");
			
			if(n > maior)
				maior = n;
			if(n < menor && n != 0)
				menor = n;
			if(n != 0)
				count++;

			total += n;
		}
		
		int media = total / count;
		
		Saida.normal("O maior e: " + maior +
					 "\nO menor e: " + menor +
					 "\nA media dos numeros e: " + media,"Resultado");
	}

}
