package programacao1.grupo4;

import java.util.Arrays;

public class Atividade05 {

	public static void main(String[] args) {
		/*
		* 5. Ler 2 strings e mostrar o tamanho de cada string, o primeiro e o ultimo caractere das strings lidas
		* e mostrar as strings em ordem aleatoria. 
		*/
//		String nome1, nome2;
		String[] vetorNome1, vetorNome2;
		String nome1;
		String nome2;
		
		//Recebe as Strings
		nome1 = Entrada.String("Digite a primeira palavra:", "Entrada de dados");
		nome2 = Entrada.String("Digite a segunda palavra:", "Entrada de dados");		
		
		//Mostra a primeira e a ultima letra das Strings
		String resultado1 = "1a. letra da 1a. palavra:     " + nome1.charAt(0);
		resultado1 += "Ultima letra da 1a. palavra: " + nome1.charAt(nome1.length()-1) + "\n";
		Saida.Normal(resultado1, "1a Palavra");
		
		String resultado2 = "1a. letra da 2a. palavra:     " + nome2.charAt(0);
		resultado2 += "Ultima letra da 2a. palavra: " + nome2.charAt(nome2.length()-1) + "\n";
		Saida.Normal(resultado2, "2a Palavra");
		
		
		vetorNome1 = new String[nome1.length()];
		vetorNome2 = new String[nome2.length()];
		
		for (int i = 0; i < nome1.length(); i++) {
			vetorNome1[i] = "" + nome1.charAt(i);
		}
		for (int i = 0; i < nome2.length(); i++) {
			vetorNome2[i] = "" + nome2.charAt(i);
		}
		
		//Colocando em ordem alfabetica
		Arrays.sort(vetorNome1);
		Arrays.sort(vetorNome2);
		
		nome1 = "";
		nome2 = "";
		
		for (int i = 0; i < vetorNome1.length; i++) {
			nome1 += "" + vetorNome1[i];
		}
		for (int i = 0; i < vetorNome2.length; i++) {
			nome2 += "" + vetorNome2[i];
		}

		
		String resultadoFinal = "1a. palavra em ordem albetica: " + nome1;
		resultadoFinal += "2a. palavra em ordem albetica:  " + nome2;
		Saida.Normal(resultadoFinal, "Resultado final");

	}

}
