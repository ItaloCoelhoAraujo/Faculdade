package programacao1.grupo5;

public class Atividade02 {
	
	public static String inversor(String palavra) {
		String inverso = "";
		
		for (int i = palavra.length() - 1; i >= 0; i--) {
			inverso += palavra.charAt(i);
		}
		
		return inverso;
	}

	public static void main(String[] args) {
		String palavra = Entrada.String("Digite uma palavra:", "Inversor");
		
		Saida.Normal("A palavra invertida e: " + inversor(palavra), "Resultado da invercao");
	}

}
