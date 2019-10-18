package programacao1.grupo3;

public class Atividade06 {

	public static void main(String[] args) {
		/*
		* 6) Escrever um programa que leia um numero nao determinado de valores
		* e calcule a media aritmetica dos valores lidos, a quantidade de valores positivos,
		* a quantidade de valores negativos e o percentual de valores negativos e positivos.
		* Mostre os resultados.
		*/
		double qtdpositivos = 0, qtdnegativos = 0, numeros = 0, n, media, percentualp, percentualn;

		Saida.Normal("Press 0 e <Enter> para Sair!", "Dica");
		
		do {
			n = Entrada.Double("Entre com um valor:", "Entrada de dados");
			
			if( n > 0 ) {
				qtdpositivos++;
			}
			
			if( n < 0 ) {
				qtdnegativos++;
			}
			
			numeros += n;
		}
		while(n != 0);
		
		String resultado;
		if (numeros != 0) {
			media = numeros / (qtdpositivos + qtdnegativos);
			percentualp = qtdpositivos / (qtdpositivos + qtdnegativos);
			percentualn = qtdnegativos / (qtdpositivos + qtdnegativos);
			
			resultado = "Media dos valores: " + media;
			resultado += "\nQuantidade positivos: " + qtdpositivos;
			resultado += "\nQuantidade negativos: " + qtdnegativos;			
			resultado += "\nPorcentagem de valores positivos/total de valores: " + percentualp;
			resultado += "\nPorcentagem de valores negativos/total de valores: " + percentualn;
		}
		else {
			resultado = "Tchau...";
		}
		
		Saida.Normal(resultado, "Final");
	}

}
