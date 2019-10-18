package programacao1.grupo4;

public class Atividade04 {


	public static void main(String[] args) {
		/*
		* 4. Ler um vetor de 8 numeros inteiros e calcular a soma dos elementos do vetor
		* multiplicado pela sua posicao. 
		*/
		
		int[] vetor = new int[8];
		int soma	= 0;    	
    	
    	// Preenche os dados
    	for (int i = 0; i < vetor.length; i++) {
    		vetor[i] = Entrada.Int("Digite o " + (i+1) + "o. valor do \"Vetor A\":", "Entrada de dados");
		}    	
    	
    	// Soma
    	for (int i = 0; i < vetor.length; i++) {
			soma += ( vetor[i] * (i+1) );
    	}
    	
    	// Mostra resultado
    	Saida.Normal("O valor da soma e: " + soma, "Resultado");
	}    

}
