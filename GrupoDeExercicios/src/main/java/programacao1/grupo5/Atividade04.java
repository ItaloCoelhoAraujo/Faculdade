package programacao1.grupo5;

import java.util.ArrayList;

public class Atividade04 {
	
	public static String fibonacci(int n) {
		ArrayList<Integer> fib = new ArrayList<Integer>();
		
		for(int i = 0; i < n; i++) {
			if(i < 2) {
				fib.add(i);
			}
			else {
				fib.add(fib.get(i - 1) + fib.get(i - 2));
			}
		}
		
		return fib.toString();
	}
	

	public static void main(String[] args) {
		int n = Entrada.Int("Digite o número de termos da série de Fibonacci:", "Serie de Fibonacci");
		
		Saida.Normal("Resultado: " + fibonacci(n) , "Resultado");
	}

}
