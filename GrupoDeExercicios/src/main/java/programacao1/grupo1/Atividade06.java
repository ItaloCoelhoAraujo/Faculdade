package programacao1.grupo1;

public class Atividade06 {

	public static void main(String[] args) {
        int horas    = 0;
        int minutos  = 0;
        int segundos = 0;
        
        // 6) Ler um valor total de segundos
        segundos = Entrada.Int("Digite o valor total em segundos:", "Total de segundos");
        
        // e transformar em horas, minutos e segundos.
        horas     = ( segundos / 60 ) / 60;
        minutos   = ( segundos / 60 ) % 60;
        segundos  = segundos % 60;
        
        // Mostrando o resultado:
        Saida.Normal(horas + " Horas: " + minutos + " Minutos: " + segundos +" Segundos", "Resultado");
	}

}
