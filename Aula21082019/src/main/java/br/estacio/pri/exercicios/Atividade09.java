package br.estacio.pri.exercicios;

public class Atividade09 {

	public static void main(String[] args) {
		int a = Entrada.proximoInt("Digite um numero:", "Entrada de dados");
		int b = Entrada.proximoInt("Digite outro numero:", "Entrada de dados");
		int maior, menor;
		
		if(a > b) {
			maior = a;
			menor = b;
		}
		else{
			maior = b;
			menor = a;
		}
		
		Saida.normal("Diferenca do maior para o menor: " + (maior - menor), "Resultado");
	}

}
