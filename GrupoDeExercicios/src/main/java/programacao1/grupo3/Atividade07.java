package programacao1.grupo3;

public class Atividade07 {

	public static void main(String[] args) {
		/*
		* 7) Escreva um programa que leia um conjunto de valores inteiros e positivos e
		* encontre o maior valor, encontre o menor valor e calcule a media dos numeros lidos. 
		*/
		
		int n;
		float qtd = 0, total = 0, media, maior = 0, menor = 0;

		Saida.Normal("Press 0 e <Enter> para Sair!", "Dica");
		
		do {
			n = Entrada.Int("Digite um valor inteiro e positivo:", "Entrada de dados");
			
			// Verifica valores invalidos
			if (n < 0) {
				Saida.Erro("Invalido! Digite um numero positivo...", "Erro!");
				continue;
			}			
			
			if(n != 0) {
				total += n;
				qtd++;
				
				// Maior
				if ( n > maior )
		           maior = n;
				
				// Menor
				if ( n < menor)
					menor = n;
			}
		} while(n != 0);	
		
		// Media
		media = total / qtd;		
		
		String resultado;
		if (total != 0)
		{
			resultado = "Media: " + media;
			resultado += "Maior: " + maior;
			resultado += "Menor: " + menor;
		}
		else
			resultado = "Tchau...";
		
		Saida.Normal(resultado, "Final");

	}

}
