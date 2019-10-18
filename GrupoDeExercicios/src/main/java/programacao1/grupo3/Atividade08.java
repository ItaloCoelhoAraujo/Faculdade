package programacao1.grupo3;

public class Atividade08 {

	public static void main(String[] args) {
		/*
		*	8) Escrever um programa que leia uma quantidade desconhecida de numeros
		*	e conte quantos deles estao nos seguintes intervalos: [0:25], [26:50], [51:75] e [76:100].
		*	A entrada de dados deve terminar quando for lido um numero negativo. 
		*/
		
		int n, g1 = 0, g2 = 0, g3 = 0, g4 = 0;

		Saida.Normal("Digite um numero NEGATIVO e <Enter> para Sair!", "Dica");
		
		do {
			n = Entrada.Int("Digite um valor inteiro positivo:", "Entrada de dados");
			
			if(n >= 0 && n <= 25) {
				g1++;
			}
			else if(n >= 26 && n <= 50) { 
				g2++;
			}
			else if(n >= 51 && n <= 75) { 
				g3++;
			}
			else if(n >= 76 && n <= 100) { 
				g4++;
			}
			else if(n > 100) {
				Saida.Erro("Numero invalido... ", "Erro!");
			}
			
		} while(n >= 0);

		String resultado = "Quantidade de valores digitados no intervalo de \"0\" a \"25\"]:   " + g1;
		resultado += "\nQuantidade de valores digitados no intervalo de \"26\" a \"50\"]:  " + g2;
		resultado += "\nQuantidade de valores digitados no intervalo de \"51\" a \"75\"]:  " + g3;
		resultado += "\nQuantidade de valores digitados no intervalo de \"76\" a \"100\"]: " + g4;
		Saida.Normal(resultado, "Resultado");

	}

}
