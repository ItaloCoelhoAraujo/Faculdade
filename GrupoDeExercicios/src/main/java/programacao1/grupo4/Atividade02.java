package programacao1.grupo4;

import java.util.ArrayList;

public class Atividade02 {

	public static void main(String[] args) {
		/*
		* 2. Ler dois vetores A e B de tamanho 10 e 15 elementos respectivamente,
		* em seguida geram um terceiro vetor C sendo a concatencao (juncao) dos vetores: A e B.
		*/
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[15];
		ArrayList<Integer> vetorC = new ArrayList<Integer>();
    	
    	
    	// Preenche os dados
    	for (int i = 0; i < vetorA.length; i++)
    	{
    		vetorA[i] = Entrada.Int("Digit o " + (i+1) + "o. valor do \"Vetor A\": ", "Entrada do Vetor A");
		}
    	
    	for (int i = 0; i < vetorB.length; i++)
    	{
    		vetorB[i] = Entrada.Int("Digit o " + (i+1) + "o. valor do \"Vetor B\": ", "Entrada do Vetor B");
		}
    	
    	//Unindo vetorA  vetorB em C e mostrando eles
    	String resultado = "Vetor A:[";
    	for(int i = 0; i < vetorA.length; i++) {
    		if(i == 0) {
    			resultado += vetorA[i] + ",";
    		}
    		else if(i < (vetorA.length) - 1) {
    			resultado += " " + vetorA[i] + ",";
    		}
    		else {
    			resultado += " " + vetorA[i] + "].";
    		}
    		vetorC.add(vetorA[i]);
    	}
    	
    	resultado += "\nVetor B:[";
    	for(int i = 0; i < vetorB.length; i++) {
    		if(i == 0) {
    			resultado += vetorB[i] + ",";
    		}
    		else if(i< (vetorB.length) - 1) {
    			resultado += " " + vetorB[i] + ",";
        	}
        	else {
        		resultado += " " + vetorB[i] + "].";
        	}
    		vetorC.add(vetorB[i]);
    	}
    	
    	resultado += "\nVetor C:" + vetorC + ".";
    	Saida.Normal(resultado, "Resultado");
	}

}
