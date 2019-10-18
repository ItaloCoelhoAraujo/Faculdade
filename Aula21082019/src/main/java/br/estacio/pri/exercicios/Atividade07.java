package br.estacio.pri.exercicios;

public class Atividade07 {

	public static void main(String[] args) {
		int qtdpositivos = 0, qtdnegativos = 0, numeros = 0, n, media, percentualp, percentualn;

		Saida.normal("Press 0 e <Enter> para Sair!", "Dica");
		
		do {
			n = Entrada.proximoInt("Entre com um valor:", "Entrada de dados");
			
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
			percentualp = (qtdpositivos / (qtdpositivos + qtdnegativos)) * 100;
			percentualn = (qtdnegativos / (qtdpositivos + qtdnegativos)) * 100;
			
			resultado = "Media dos valores: " + media;
			resultado += "\nQuantidade positivos: " + qtdpositivos;
			resultado += "\nQuantidade negativos: " + qtdnegativos;			
			resultado += "\nPorcentagem de valores positivos/total de valores: " + percentualp + "%";
			resultado += "\nPorcentagem de valores negativos/total de valores: " + percentualn + "%";
		}
		else {
			resultado = "Tchau...";
		}
		
		Saida.normal(resultado, "Final");
	}

}
