package programacao1.grupo2;

public class Atividade04 {

	public static void main(String[] args) {
		//4) Receber tres numeros inteiros e mostrar o maior e o menor dos numeros lidos.
		
        int a, b, c, maior, menor;
        
        a = Entrada.Int("Digite um numero:", "Entrada de dados");
        b = Entrada.Int("Digite outro numero:", "Entrada de dados");
        c = Entrada.Int("Digite outro numero:", "Entrada de dados");
        
        // Definindo o maior e o menor numero
        if (a > b && a > c) {
            maior = a;
            if (b < c) {
            	menor = b;
            }
            else {
            	menor = c;
            }
        }
        else if ( b > c ) {
            maior = b;
            menor = a;
        }
        else {
        	maior = c;
        	menor = a;
        }
        
        String resultado = "O maior valor e: " + maior;
        resultado += "\nO menor valor e: " + menor;
        Saida.Normal(resultado, "Resultado");
	}

}
