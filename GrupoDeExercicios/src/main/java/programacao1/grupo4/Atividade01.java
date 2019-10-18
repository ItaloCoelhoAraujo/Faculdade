package programacao1.grupo4;

import java.util.ArrayList;

public class Atividade01 {


	public static void main(String[] args) {
		/*
		* 1. Declarar um vetor de 20 nÃºmeros inteiros,
		* em seguida ler os elementos do vetor,
		* e ao final mostrar somente os nÃºmero positivos,
		* e mostrar ainda a quantidade de positivos,
		* a quantidade de negativos e a quantidade de nulos (0). 
		*/
		
    	int[] vetor = new int[20];
    	ArrayList<Integer> positivos = new ArrayList<Integer>();
    	ArrayList<Integer> negativos = new ArrayList<Integer>();
    	ArrayList<Integer> nulos	 = new ArrayList<Integer>();
    	
    	
    	// Preenche as posicoes no vetor
    	for (int i = 0; i < vetor.length; i++) {
    		vetor[i] = Entrada.Int("Digit o " + (i+1) + "o. valor:", "Entrada do vetor["+ vetor.length +"]");
		}    	
    	
    	// Separa positivos e negativos
    	for (int item : vetor)
    	{
			if(item > 0)
				positivos.add(item);
			else if(item < 0)
				negativos.add(item);
			else
				nulos.add(item);
		}
    	
    	
    	// Mostrando os resultados
    	String resultado = "Valores positivos: " + positivos;
    	resultado += "\nQuantidade de positivos: " + positivos.size();
    	resultado += "\nQuantidade de negativos: " + negativos.size();
    	resultado += "\nQuantidade de nulos: " + nulos.size();
    	Saida.Normal(resultado, "Resultado");
	}

}
