package programacao1.grupo3;

public class Atividade02 {

	public static void main(String[] args) {
		/*
		* 2) Elaborar um programa para exibir os numeros impares de 1 a 100,
		* e ao lado de cada numero as soma dos que ja foram exibidos. 
		*/
		//Essa atividade foi repetida na atividade 02 do grupo 1
		
		int soma = 0;
		
		System.out.println("Impares | Soma dos anteriores");
        for (int i = 1; i <= 100; i++) 
        {
            if( (i % 2) != 0 )
            {
                System.out.print(i);
                soma += i;
                System.out.print("	|	");
                System.out.println(soma);
            }
        }

	}

}
