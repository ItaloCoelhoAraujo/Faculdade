package br.estacio.pri.exercicios;

public class Atividade02 {

	public static void main(String[] args) {
		double num = Entrada.proximoDouble("Digite um numero:", "Entrada de dados");
		
		Saida.normal("A raiz quadrada e: " + Math.sqrt(num), "Resultado");
	}

}
