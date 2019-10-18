package programacao1.grupo2;

public class Atividade01 {

	public static void main(String[] args) {
		/*
        * 1) Receber um numero inteiro e mostrar a metade do numero se ele for par
        * ou mostrar o dobro do numero caso seja impar.
        */
        int a;
        
        a = Entrada.Int("Digite um numero:", "Entrada de dados...");
        
        if (a % 2 == 0)
            Saida.Normal( Double.toString(a / 2), "Resultado");
        
        else
            Saida.Normal( Double.toString(a * 2), "Resultado");

	}

}
