package programacao1.grupo3;

public class Atividade03 {

	public static void main(String[] args) {
		/*
		* 3) Chico tem 1,50 m de altura e cresce 2 cm por ano, enquanto Ze tem 1,10 m
		* de altura e cresce 3 cm por ano. Construa um programa que calcule e imprima
		* quantos anos serao necessarios para que Ze seja maior que Chico.
		*/
		float chico = (float) 1.50;
		float ze 	= (float) 1.10;
		int anos 	= 0;
		
		//Calculando
		while( ze <= chico )
		{
		   chico += 0.02;
		   ze 	 += 0.03;
		   ++anos;
		}
		
		//Mostrando
		String resultado = "Serao necessarios " + anos + " anos para que Ze fique maior que Chico!";
		Saida.Normal(resultado, "Resultado");
	}

}
