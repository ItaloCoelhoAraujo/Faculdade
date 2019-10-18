package programacao1.grupo5;

public class Atividade07 {
	
	public static String SegDi(String num) {
		String res = "";
		int digito = 0;
		if(Integer.parseInt(num) < 10) {
			digito = Integer.parseInt(num);
		}
		else {
			digito = Integer.parseInt(Character.toString(num.charAt(1)));
		}
			
		
		switch(digito) {
			case 0:
				break;
			case 1:
				res = "Um";
				break;
			case 2:
				res = "Dois";
				break;
			case 3:
				res = "Tres";
				break;
			case 4:
				res = "Quatro";
				break;
			case 5:
				res = "Cinco";
				break;
			case 6:
				res = "Seis";
				break;
			case 7:
				res = "Sete";
				break;
			case 8:
				res = "Oito";
				break;
			case 9:
				res = "Nove";
				break;
		}
		return res;
	}
	
	public static String dezAVinte(String num) {
		String res = "";
		int numero = Integer.parseInt(num);
		
		switch(numero) {
			case 10:
				res = "Dez";
				break;
			case 11:
				res = "Onze";
				break;
			case 12:
				res = "Doze";
				break;
			case 13:
				res = "Treze";
				break;
			case 14:
				res = "Quatorze";
				break;
			case 15:
				res = "Quinze";
				break;
			case 16:
				res = "Dezesseis";
				break;
			case 17:
				res = "Dezessete";
				break;
			case 18:
				res = "Dezoito";
				break;
			case 19:
				res = "Dezenove";
				break;
		}
		
		return res;
	}
	
	public static String intExtenso(int num) {
		String res = "";
		String convertido = Integer.toString(num);
		if(num > 99 || num < 0 || num == 0) {
			res = "zero";
		}
		else if(num < 10) {
			res = SegDi(convertido);
		}
		else if(num < 20) {
			res = dezAVinte(convertido);
		}
		else if(num < 30) {
			res = "Vinte e " + SegDi(convertido);
		}
		else if(num < 40) {
			res = "Trinta e " + SegDi(convertido);
		}
		else if(num < 50) {
			res = "Quarenta e " + SegDi(convertido);
		}
		else if(num < 60) {
			res = "Cinquenta e " + SegDi(convertido);
		}
		else if(num < 70) {
			res = "Sessenta e " + SegDi(convertido);
		}
		else if(num < 80) {
			res = "Setenta e " + SegDi(convertido);
		}
		else if(num < 90) {
			res = "Oitenta e " + SegDi(convertido);
		}
		else if(num < 100) {
			res = "Noventa e " + SegDi(convertido);
		}
		
		return res;
	}

	public static void main(String[] args) {
		int num = Entrada.Int("Digite um numero:", "Entrada de dados");
		
		Saida.Normal("Este numero por extenso e: " + intExtenso(num) + ".", "Resultado");
	}

}
