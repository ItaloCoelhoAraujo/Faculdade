package programacao1.grupo3;

public class Atividade01 {

	public static void main(String[] args) {
		/*
    	* 1) Imprimir a tabela de conversao de Celsius para Fahrenheit
    	* da faixa de valores de 0 a 200 graus Celsius em 0,5 de variacao. 
    	*/
    	float f = 0;
    	
    	for( float c = 0; c <= 200; c+=0.5 ) {
    		f = (c * 9/5) + 32;
			System.out.println(c + " : " + f);
		}

	}

}
