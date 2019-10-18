package br.estacio.pri.exercicios;

public class Atividade05 {

	public static void main(String[] args) {
		double salarioBruto = 1;
		while(salarioBruto != 0) {
			salarioBruto = Entrada.proximoDouble("Digite o seu salario bruto:", "Entrada de dados");
			double totalEmprestimo = Entrada.proximoDouble("Digite o valor total do emprestimo:", "Entrada de dados");
			int qdtParcelas = Entrada.proximoInt("Digite a quantidade de parcelas desejadas:", "Entrada de dados");
			
			if(totalEmprestimo/qdtParcelas > salarioBruto*0.3) {
				Saida.normal("O emprestimo selecionado nao podera ser concedido!", "Resultado");
			}
			else{
				Saida.normal("O emprestimo selecionado podera ser concedido!", "Resultado");
			}
		}
		
		Saida.normal("Tchaauu...", "Final");
	}

}
