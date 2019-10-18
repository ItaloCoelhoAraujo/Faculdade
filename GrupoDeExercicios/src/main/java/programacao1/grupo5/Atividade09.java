package programacao1.grupo5;

public class Atividade09 {
	
	public static String resultado(String texto, char caractere, int n) {
		String res = "";
		
		for(int i = 1; i <= n; i++) {
			res += texto + caractere + "\n";
		}
		
		return res;
	}

	public static void main(String[] args) {
		String texto = Entrada.String("Digite um texto:", "Entrada de dados");
		char caractere = Entrada.Char("Digite um caractere:", "Entrada de dados");
		int n = Entrada.Int("Digite um numero:", "Entrada de dados");
		
		Saida.Normal(resultado(texto,caractere,n), "Resultado");
	}

}
