package programacao1.grupo5;

public class Atividade06 {
	
	public static String mesExtenso(int mes) {
		String res = "";
		
		switch(mes){
			case 1:
				res = "Janeiro";
				break;
			case 2:
				res = "Fevereiro";
				break;
			case 3:
				res = "Marco";
				break;
			case 4:
				res = "Abril";
				break;
			case 5:
				res = "Maio";
				break;
			case 6:
				res = "Junho";
				break;
			case 7:
				res = "Julho";
				break;
			case 8:
				res = "Agosto";
				break;
			case 9:
				res = "Setembro";
				break;
			case 10:
				res = "Outubro";
				break;
			case 11:
				res = "Novembro";
				break;
			case 12:
				res = "Dezembro";
				break;
		}
		
		return res;
	}

	public static void main(String[] args) {
		int mes = Entrada.Int("Digite o mes", "Mes");
		while(mes < 1 || mes > 12) {
			Saida.Erro("Erro, digite um numero de 1 a 12!", "Erro");
			mes = Entrada.Int("Digite o mes", "Mes");
		}
		
		int dia = Entrada.Int("Digite o dia:", "Dia");
		while(mes == 2 && dia > 29) {
			Saida.Erro("Erro, digite um dia válido!", "Erro");
			dia = Entrada.Int("Digite o dia:", "Dia");
		}
		while(dia > 31 || dia < 1) {
			Saida.Erro("Erro, digite um dia válido!", "Erro");
			dia = Entrada.Int("Digite o dia:", "Dia");
		}
		while(mes % 2 == 0 && dia > 30) {
			Saida.Erro("Erro, digite um dia válido!", "Erro");
			dia = Entrada.Int("Digite o dia:", "Dia");
		}
		
		int ano = Entrada.Int("Digite o ano", "Ano");
		
		Saida.Normal("A data é: " + dia + " de " + mesExtenso(mes) + " de " + ano, "Data");		
	}

}
