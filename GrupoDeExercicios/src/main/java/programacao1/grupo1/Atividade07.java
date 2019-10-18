package programacao1.grupo1;

public class Atividade07 {

	public static void main(String[] args) {
        int dias  = 0;
        int meses = 0;
        int anos  = 0;
        
        // 7) Ler um total de dias
        dias = Entrada.Int("Digite o total de dias:", "Total de dias");
        
        /*
        * e converter para anos, meses e dias,
        * considerando um ano com 365 dias e um mes com 30 dias.
        */
        anos  = ( dias / 365 );
        meses = ( dias % 365 ) / 30;
        dias  = ( dias % 365 ) % 30;
        
        Saida.Normal(anos + " ano(s), " + meses + " mes(es) e " + dias + " dia(s)", "Resultado");
	}

}
