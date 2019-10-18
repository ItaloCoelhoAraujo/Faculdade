package programacao1.grupo5;

import java.util.ArrayList;

public class Atividade08 {
	
	public static int numVogais(String texto) {
		int res = 0;
		String minusculo = texto.toLowerCase();
		
		for(int i = 0; i < minusculo.length(); i++) {
			if(minusculo.charAt(i) == 'a' ||
			   minusculo.charAt(i) == 'e' ||
			   minusculo.charAt(i) == 'i' ||
		       minusculo.charAt(i) == 'o' ||
			   minusculo.charAt(i) == 'u') 
			{
					res++;
			}
		}
		
		return res;
	}
	
	public static int numEspacos(String texto) {
		int res = 0;
		
		for(int i = 0; i < texto.length(); i++) {
			if(Character.isWhitespace(texto.charAt(i))){
				res++;
			}
		}
		
		return res;
	}
	
	public static ArrayList<Character> iniciaisTexto(String texto) {
        ArrayList<Character> res = new ArrayList<Character>();
		
		String[] palavras = texto.split(" ");
        for(int i = 0; i < palavras.length; i++) {
            res.add(Character.toUpperCase(palavras[i].charAt(0)));             
        } 
		
		return res;
	}

	public static void main(String[] args) {
		String texto = Entrada.String("Digite um texto:", "Entrada de Dados");
		
		String res = "Quantidade de vogais: " + numVogais(texto);
		res += "\nQuantidade de espacos: " + numEspacos(texto);
		res += "\nIniciais do texto(em maiusculo): " + iniciaisTexto(texto);
		
		Saida.Normal(res, "Resultado");

	}

}
