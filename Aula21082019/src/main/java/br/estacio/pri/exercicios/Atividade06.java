package br.estacio.pri.exercicios;

public class Atividade06 {

	public static void main(String[] args) {
		String nomeP1 = Entrada.proximoString("Digite o nome da primeira pessoa:", "Entrada de dados");
		char sexoP1 = Entrada.proximoChar("Digite o sexo da primeira pessoa(M/F):", "Entrada de dados");
		double alturaP1 = Entrada.proximoDouble("Digite a altura da primeira pessoa em cm:", "Entrada de dados");
		double pesoP1 = Entrada.proximoDouble("Digite o peso da primeira pessoa em Kg:", "Entrada de dados");
		String nomeP2 = Entrada.proximoString("Digite o nome da primeira pessoa:", "Entrada de dados");
		char sexoP2 = Entrada.proximoChar("Digite o sexo da primeira pessoa(M/F):", "Entrada de dados");
		double alturaP2 = Entrada.proximoDouble("Digite a altura da primeira pessoa: em cm", "Entrada de dados");
		double pesoP2 = Entrada.proximoDouble("Digite o peso da primeira pessoa em Kg:", "Entrada de dados");

		double imc1 = pesoP1/Math.pow(alturaP1, 2);
		double imc2 = pesoP2/Math.pow(alturaP2, 2);
		
		String res;
		if (imc1 > imc2)
		{
			res = nomeP1 + ", " + sexoP1 + ", " + pesoP1 + " Kg, " + alturaP1 + " cm.";
		}
		else
		{
			res = nomeP2 + ", " + sexoP2 + ", " + pesoP2 + " Kg, " + alturaP2 + " cm.";
		}
		
		Saida.normal(res, "Maior MMC");
	}

}
