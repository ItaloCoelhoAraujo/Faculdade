package programacao1.grupo1;

public class Atividade03 {

	public static void main(String[] args) {
        double TempC, TempF;
        
        // 3) Ler um valor de temperatura em Celsius
        TempC = Entrada.Double("Digite a temperatura em Celsius:", "Conversor de temperatura");
        
        // Utilize a relação: C / 5 = (F-32) / 9.
        TempF = (TempC * 9/5) + 32;
        
        // e escrever o valor correspondente em Fahrenheit.
        Saida.Normal("A temperatura corresponde em Fahrenheit é: " + TempF, "Conversor de temperatura");
	}

}
