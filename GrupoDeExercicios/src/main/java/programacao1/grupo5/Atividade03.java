package programacao1.grupo5;

public class Atividade03 {
	
	public static int maior(int num1, int num2, int num3) {
		int maior = 0;
		
		if(num1 > num2) {
			if(num1 > num3) {
				maior = num1;
			}
			else {
				maior = num3;
			}
		}
		else if(num2 > num3) {
			maior = num2;
		}
		else {
			maior = num3;
		}
		
		return maior;
	}
	
	public static int menor(int num1, int num2, int num3) {
		int menor = 0;
		
		if(num1 > num2) {
			if(num1 > num3) {
				menor = num1;
			}
			else {
				menor = num3;
			}
		}
		else if(num2 > num3) {
			menor = num2;
		}
		else {
			menor = num3;
		}
		
		return menor;
	}

	public static void main(String[] args) {
		int num1 = Entrada.Int("Digite o primeiro numero:", "Entrada de dados");
		int num2 = Entrada.Int("Digite o segundo numero:", "Entrada de dados");
		int num3 = Entrada.Int("Digite o tereiro numero:", "Entrada de dados");
		
		int funcao = Entrada.Int("Digite 1 para saber o maior ou 2 para o menor:", "Funcao");
		
		switch(funcao) {
			case 1:
				Saida.Normal("O maior é: " + maior(num1, num2, num3), "Maior");
				break;
			case 2:
				Saida.Normal("O maior é: " + maior(num1, num2, num3), "Maior");
				break;
		}
	}

}
