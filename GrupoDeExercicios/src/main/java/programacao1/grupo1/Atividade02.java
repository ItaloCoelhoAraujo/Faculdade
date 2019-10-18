package programacao1.grupo1;

public class Atividade02 {

	public static void main(String[] args) {        
        /*
        * 2) Elaborar um programa para exibir os números ímpares de 1 a 100,
		* e ao lado de cada número as soma dos que já foram exibidos.
        */
		//Essa atividade foi repetida na atividade 02 do grupo 3
		
		int soma = 0;
		
		System.out.println("Impares | Soma dos anteriores");
        for (int i = 1; i <= 100; i++) 
        {
            if(i % 2 != 0 )
            {
                System.out.print(i);
                soma += i;
                System.out.print("	|	");
                System.out.println(soma);
            }
        }
	}

}
