package br.estacio.programacao.calculadora;

public class ProgramaCalculadora 
{
	
	static double valor1;
	static double valor2;
	static double resultado;
	static String operacao;
	 
	static void menuPrincipal()
	{
		int opcao;
		String menu = "Programa Calculadora\n\n"+
					  "1-Somar\n"+
					  "2-Subtrair\n"+
					  "3-Multiplicar\n"+
					  "4-Dividir\n"+
					  "5-Potência\n"+
					  "6-Raiz Quadrada\n"+
					  "7-Finalizar\n\n";   
	        
	    opcao=1;
	    
	    while (opcao != 7)
	    {
	    	opcao = Entrada.Int(menu,
	    			"Programa Calculadora - 2013");
	        switch (opcao)
	        {
	        	case 1:  //somar
	        		operacao = "Soma";
	        		valor1 = Entrada.Double("Digite o primeiro número:", "Soma");
	        		valor2 = Entrada.Double("Digite o segundo número:", "Soma");
	        		resultado = Calculadora.somar(valor1, valor2);
	        		Saida.Normal("Resultado da Operação de " + operacao + ":\n"+ valor1 +
	        				" + "+ valor2 +" resulta em "+ resultado, "Soma");
	        		break;
	        		
	            case 2:  //subtrair
	            	operacao = "Subtracao";
	            	valor1 = Entrada.Double("Digite o primeiro número:", "Subtracao");
	        		valor2 = Entrada.Double("Digite o segundo número:", "Subtracao");
	        		resultado = Calculadora.subtrair(valor1, valor2);
	        		Saida.Normal("Resultado da Operação de " + operacao + ":\n"+ valor1 +
	        				" diminuido de "+ valor2 +" resulta em "+ resultado, "Subtracao");
	        		break;
	        		
	            case 3: //multiplicacar
	            	operacao = "Multiplicacao";
	            	valor1 = Entrada.Double("Digite o primeiro número:", "Multiplicacao");
	        		valor2 = Entrada.Double("Digite o segundo número:", "Multiplicacao");
	        		resultado = Calculadora.multiplicar(valor1, valor2);
	        		Saida.Normal("Resultado da Operação de " + operacao + ":\n"+ valor1 +
	        				" multiplicado por "+ valor2 +" resulta em "+ resultado, "Multiplicacao");
	        		break;
	        		
	            case 4: //dividir
	            	operacao = "Divisao";
	            	valor1 = Entrada.Double("Digite o primeiro número:", "Divisao");
	        		valor2 = Entrada.Double("Digite o segundo número:", "Divisao");
	        		resultado = Calculadora.dividir(valor1, valor2);
	        		Saida.Normal("Resultado da Operação de " + operacao + ":\n"+ valor1 +
	        				" dividido por "+ valor2 +" resulta em "+ resultado, "Divisao");
	        		break;
	        		
	            case 5: //potencia
	            	operacao = "Potenciacao";
	            	valor1 = Entrada.Double("Digite o valor da base:", "Potenciacao");
	            	valor2 = Entrada.Double("Digite o valor do expoente:", "Potenciacao");
	            	resultado = Calculadora.potencia(valor1, valor2);
	            	Saida.Normal("Resultado da Operação de " + operacao + ":\n"+ valor1 +
	            			" elevado a "+ valor2 +" resulta em "+ resultado, "Potenciacao");
	            	break;
	            	
	            case 6: //raiz quadrada
	            	operacao = "Raiz Quadrada";
	            	valor1 = Entrada.Double("Digite o número:", "Raiz quadrada");
	            	resultado = Calculadora.raizQuadrada(valor1);
	            	Saida.Normal("Resultado da Operação de " + operacao + ":\nA raiz quadrada de "+ valor1 +
	            			" resulta em "+ resultado, "Raiz quadrada");
	            	break;
	        }
	    }
	       
	    Saida.Normal("Tchaauu...", "Finalizando");	                    
	}

	public static void main(String[] args)
	{

	      menuPrincipal();

	}

}
