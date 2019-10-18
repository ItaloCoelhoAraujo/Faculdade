package programacao1.grupo4;

import java.util.ArrayList;

public class Atividade03 {


	public static void main(String[] args) {
		/*
		* 3. Ler dois vetores de 10 elementos cada, em seguida mostrar um lista de todos os elementos do 1o.
		* que se repetem no 2o. vetor.
		*/
		
		ArrayList<Integer> vetorA = new ArrayList<Integer>();
		ArrayList<Integer> vetorB = new ArrayList<Integer>();
		ArrayList<Integer> repetidos = new ArrayList<Integer>();
		int tamanho = 10;
    	
    	// Preenche os dados
    	for (int i = 0; i < tamanho; i++) {
    		vetorA.add(Entrada.Int("Digite o " + (i+1) + "o. valor do \"Vetor A\":", "Entrada do Vetor A"));
		}
    	System.out.println("\n\n");
    	for (int i = 0; i < tamanho; i++) {
    		vetorB.add(Entrada.Int("Digit o " + (i+1) + "o. valor do \"Vetor B\": ", "Entrada do Vetor B"));
    	}
    	
    	// Guarda Itens de A que se repetem em B
		for (int item : vetorA)	{
			if(vetorB.contains(item) && !repetidos.contains(item))
				repetidos.add(item);
		}
    	
    	// Mostra resultados
		Saida.Normal("Elementos de \"A\" que se repetem em \"B\":\n" + repetidos, "Repetidos");
	}

}
