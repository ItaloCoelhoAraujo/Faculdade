package programacao1.grupo3;

public class Atividade05 {

	public static void main(String[] args) {
		/*
		* 5) Elaborar um programa para calcular a soma dos N primeiros termos da serie:
		* 1 - 1/2 + 1/4 - 1/6 + 1/8 - 1/10 + ...
		*/
		
		int n;
		int denominador = 2;
		float resultadoFinal = 1;
		boolean sinal = true;
		
		//Recebendo dados
		n = Entrada.Int("Digite a quantidade de termos da serie:", "Entrada de dados");
		
		//Calculando
		for (int i = 1; i < n; i++) {
			if (i != 1) {
				if (sinal) {
					resultadoFinal -= (float) 1 / (float) denominador;
				}
				else {
					resultadoFinal += (float) 1 / (float) denominador;
				}
				
				sinal = !sinal;
				denominador += 2;
			}
		}
		
		Saida.Normal("Resultado e igual a: " + resultadoFinal, "Resultado");

	}

}
