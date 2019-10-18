package programacao1.grupo1;

public class Atividade04 {

	public static void main(String[] args) {
		int horas       = 0;
        int minutos     = 0;
        int segundos    = 0;
        
        // 4) Ler valor de tempo decorrido em horas, minutos e segundos,
        horas = Entrada.Int("Digite as horas:", "Total de horas");
        minutos = Entrada.Int("Digite os minutos:", "Total de minutos");
        segundos = Entrada.Int("Digite os segundos:", "Total de segundos");

        // Convertendo
        segundos += (horas * 3600) + (minutos * 60);
        
        // e mostrar o total em segundos.
        Saida.Normal("O total de segundos e: " + segundos, "Resultado em segundos");

	}

}
