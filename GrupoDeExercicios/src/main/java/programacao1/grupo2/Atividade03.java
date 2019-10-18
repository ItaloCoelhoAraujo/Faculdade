package programacao1.grupo2;

public class Atividade03 {

	public static void main(String[] args) {
        //3) Receber dois numeros quaisquer e mostrar a diferenca do maior pelo menor.
       
        double a, b, r;
        
        a = Entrada.Double("Digite um numero:", "Entrada de dados");
        b = Entrada.Double("Digite outro numero:", "Entrada de dados");
        
        if (a > b)
            r = a - b;
        
        else
            r = b - a;
        
        Saida.Normal( "A diferenca do maior pelo menor e: " + r , "Resultado");

	}

}
