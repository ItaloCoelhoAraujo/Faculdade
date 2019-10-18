package programacao1.grupo5;

public class Atividade01 {
	
	public static int fatoracao(int num) {
		int res = 1;
		for(int i = 1; i <= num ; i++) {
			res = res * i;
		}
		
		return res;
	}

	public static void main(String[] args) {
		int num = Entrada.Int("Digite o numero a ser fatorado:", "Fatoracao");
		
		Saida.Normal("O resultado é: " + fatoracao(num), "Resultado da fatoracao!");
	}

}
