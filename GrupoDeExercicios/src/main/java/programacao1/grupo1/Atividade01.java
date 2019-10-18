package programacao1.grupo1;

public class Atividade01 
{
	static String resultado;
	
    public static void main( String[] args )
    {
        double R1,R2;
        
        //Recebe dois numeros reais
        R1 = Entrada.Double("Digite um numero real:", "Entrada de dados");
        
        R2 = Entrada.Double("Digite outro numero real:", "Entrada de dados");
        
        //E mostra a soma e o produto deles
        resultado = "A soma delas e: " + (R1 + R2);
        resultado += "\nO produto delas e: " + (R1 + R2);
        Saida.Normal(resultado, "Resultado");
    }
}
