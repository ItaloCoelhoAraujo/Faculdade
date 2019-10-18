package br.estacio.pri.exercicios;

public class Atividade03 {

	public static void main(String[] args) {
		int qtdCarrosVendidos = Entrada.proximoInt("Digite a quantidade de carros vendidos:", "Entrada de dados");
		int totalVendaCarros = 0;
		for(int i = 1; i <= qtdCarrosVendidos; i++) {
			totalVendaCarros += Entrada.proximoInt("Digite o valor do" + i + "o carro:", "Entrada de dados");
		}
				
		double salario = (998 * 2) + (150 * qtdCarrosVendidos) + (1.05 * totalVendaCarros);
		
		Saida.normal("O salario deste funcionario e: " + salario, "Resultado");
	}

}
