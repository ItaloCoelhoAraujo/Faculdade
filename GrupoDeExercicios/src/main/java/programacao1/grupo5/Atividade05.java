package programacao1.grupo5;

public class Atividade05 {
	
	public static String converteParaPP(double metros) {
		String res;
		int pes, polegadas;
		
		pes = (int) ((metros * 39.3701) / 12);
		polegadas = (int) ((metros * 39.3701) % 12);
		res = "" + pes + "'" + polegadas + "''";
		
		return res;
	}

	public static void main(String[] args) {
		double metros = Entrada.Double("Digite o tamanho a ser convertido em metros:", "Conversor");
		
		Saida.Normal("O resultado e: " + converteParaPP(metros), "Resultado");
	}

}
