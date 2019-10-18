package programacao1.grupo3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class Atividade04 {

	public static void main(String[] args) throws ParseException {
		/*
		* 4) Elaborar um programa para exibir o calendario do mes solicitado,
		* sendo lido o dia da semana do primeiro dia do mes. 
		*/		
	    int mes, ano, diaDaSemana, primeiroDiaDoMes, numeroDeSemana = 1;
	    Date data;
	    
	    //Converter texto em data e data em texto
	    SimpleDateFormat sdf	 = new SimpleDateFormat("dd/MM/yyyy");
	    //Prover o calendario
	    GregorianCalendar gc	 = new GregorianCalendar();
	    
	    String mesesCalendario[] = new String[12];
		String mesesNome[]		 = {"Janeiro", "Fevereiro", "Marco", "Abri", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
		int mesesDia[]			 = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		//Errado? e pra receber apenas o "dia da semana" do "primeiro dia do mes" na questao
	    //Recebendo mes e ano
	    mes = Entrada.Int("Digite o mes:", "Entrada de dados");
	    ano = Entrada.Int("Digite o ano:", "Entrada de dados");
	    
	    //Errado? e pra ser o dia inicial do mes na questao
	    // Dia inicial do ano
        data = sdf.parse("01/01/" + ano);
        gc.setTime(data);
        diaDaSemana = gc.get(GregorianCalendar.DAY_OF_WEEK);
        
        //Nao sei se e necessario por causa da questao
        //*Alteracao feita||| Ano bissexto tem +1 dia em fevereiro
        if(ano % 4 == 0) {
        	mesesDia[1] = 29;
        	mesesNome[1] = "Ano Bissexto - Fevereiro";
        }
        
        
        //Meses 
        for(int mesAtual = 0; mesAtual < 12; mesAtual++) {
	        int diasDoMes	= 0;
	        String nomeMesAtual = "";


	        nomeMesAtual = mesesNome[mesAtual]; 
            diasDoMes	 = mesesDia[mesAtual]; 


            mesesCalendario[mesAtual] = "\n      " + nomeMesAtual + " de " + ano + "\n";
            mesesCalendario[mesAtual] += "---------------------------------------------------------------------|\n";
            mesesCalendario[mesAtual] += "      Dom      Seg      Ter      Qua      Qui      Sex      Sab      | Semanas\n";
            mesesCalendario[mesAtual] += "---------------------------------------------------------------------|\n      ";
	
	        
	        // Primeira semana comeca em
	        data = sdf.parse( "01/" + (mesAtual+1) + "/" + ano );
            gc.setTime(data);
            primeiroDiaDoMes = gc.get(GregorianCalendar.DAY_OF_WEEK);
	        for (int space = 1; space < primeiroDiaDoMes; space++) {
	        	mesesCalendario[mesAtual] += "         ";
	        }
	        
	        //Dias	        
	        for (int diaAtual = 1; diaAtual <= diasDoMes; diaAtual++)
	        {
	        	// Trata espaco do dia
	        		//Transforma o diaAtuel em String
	            String diaTratado = Integer.toString(diaAtual);
	            if (diaTratado.length() == 1)
	            	diaTratado = "  " + diaAtual + "      ";
	            else
	            	diaTratado = " " + diaAtual + "      ";
	            
	            // dia
	            mesesCalendario[mesAtual] += diaTratado;
	        	
	        	// Pula Linha no final da semana
	            data = sdf.parse( diaAtual + "/" + (mesAtual+1) + "/" + ano );
	            gc.setTime(data);
	            diaDaSemana = gc.get(GregorianCalendar.DAY_OF_WEEK);
	            if (diaDaSemana == 7) {
	            	mesesCalendario[mesAtual] += ("| " + numeroDeSemana++);
	            	mesesCalendario[mesAtual] += "\n                                                                     |";
	            	mesesCalendario[mesAtual] += "\n      ";
	            }
	        }
	        mesesCalendario[mesAtual] += "\n\n\n\n";
	    }
	    
        //Imprime mes desejado
	    System.out.println(mesesCalendario[mes-1]);

	}

}
