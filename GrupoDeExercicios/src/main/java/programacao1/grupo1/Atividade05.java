package programacao1.grupo1;

public class Atividade05 {

	public static void main(String[] args) {
	    int anos = 0;
	    int meses = 0;
	    int dias = 0;
	    
	    // 5) Ler um período de tempo em anos, meses e dias,
	    anos = Entrada.Int("Digite a quantidade de anos:", "Total de anos");
	    meses = Entrada.Int("Digite a quantidade de meses:", "Total de meses");
	    dias = Entrada.Int("Digite a quantidade de dias:", "Total de dias");
	    
	    // Convertendo
	    dias += ( anos * 365.25 );          //O ".25" é para o cálculo dos anos bissextos
	    for(int i = 1; i <= meses ; i++) {      
	    	if(i % 2 != 0) {                //Para meses com 31 dias
	    		dias += 31;
	    	}
	    	else{                           //Para meses com 30 dias
	    		dias += 30;
	    	}
	    }
	    
	    // e mostrar o total em dias.
	    Saida.Normal("O total de dias e: " + dias, "Resultado em dias");
	}

}
