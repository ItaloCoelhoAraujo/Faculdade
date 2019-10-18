package programacao1.grupo2;

public class Atividade02 {

	public static void main(String[] args) {
        double a, b, r;
        
        a = Entrada.Double("Digite um numero:", "Entrada de dados");
        b = Entrada.Double("Digite outro numero:", "Entrada de dados");
        
        if (a != b)
            r = a + (b * 2);
        
        else
            r = a - (b / 2);							//Matematicamente, isto e o mesmo que (a/2)
        
        Saida.Normal( "O resultado e: " + r , "Resultado");

	}

}
