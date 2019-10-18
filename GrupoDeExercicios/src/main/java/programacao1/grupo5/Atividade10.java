package programacao1.grupo5;

public class Atividade10 {
	
	
	 
	static void menuPrincipal()
	{
		int opcao = 0;
		double valor1;
		double valor2;
		double resultado;
		String operacao;
		
		String menu = "Programa Calculadora\n\n"+
					  "1-Somar\n"+
					  "2-Subtrair\n"+
					  "3-Multiplicar\n"+
					  "4-Dividir\n"+
					  "5-Finalizar\n";   
	    
	    while (opcao != 5)
	    {
	    	opcao = Entrada.Int(menu,
	    			"Programa Calculadora - 2013");
	        switch (opcao)
	        {
	        	case 1:  //somar
	        		operacao = "Soma";
	        		valor1 = Entrada.Double("Digite o primeiro número:", "Soma");
	        		valor2 = Entrada.Double("Digite o segundo número:", "Soma");
	        		resultado = valor1 + valor2;
	        		Saida.Normal("Resultado da Operação de " + operacao + ":\n"+ valor1 +
	        				" + "+ valor2 +" resulta em "+ resultado, "Soma");
	        		break;
	        		
	            case 2:  //subtrair
	            	operacao = "Subtracao";
	            	valor1 = Entrada.Double("Digite o primeiro número:", "Subtracao");
	        		valor2 = Entrada.Double("Digite o segundo número:", "Subtracao");
	        		resultado = valor1 - valor2;
	        		Saida.Normal("Resultado da Operação de " + operacao + ":\n"+ valor1 +
	        				" diminuido de "+ valor2 +" resulta em "+ resultado, "Subtracao");
	        		break;
	        		
	            case 3: //multiplicacar
	            	operacao = "Multiplicacao";
	            	valor1 = Entrada.Double("Digite o primeiro número:", "Multiplicacao");
	        		valor2 = Entrada.Double("Digite o segundo número:", "Multiplicacao");
	        		resultado = valor1 * valor2;
	        		Saida.Normal("Resultado da Operação de " + operacao + ":\n"+ valor1 +
	        				" multiplicado por "+ valor2 +" resulta em "+ resultado, "Multiplicacao");
	        		break;
	        		
	            case 4: //dividir
	            	operacao = "Divisao";
	            	valor1 = Entrada.Double("Digite o primeiro número:", "Divisao");
	        		valor2 = Entrada.Double("Digite o segundo número:", "Divisao");
	        		resultado = valor1 / valor2;
	        		Saida.Normal("Resultado da Operação de " + operacao + ":\n"+ valor1 +
	        				" dividido por "+ valor2 +" resulta em "+ resultado, "Divisao");
	        		break;
	        }
	    }
	    
	    Saida.Normal("Tchaauu...", "Finalizando");	                    
	}

	public static void main(String[] args) {
		menuPrincipal();
	}

}
