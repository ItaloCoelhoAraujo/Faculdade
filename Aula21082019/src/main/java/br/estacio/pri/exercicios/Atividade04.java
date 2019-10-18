package br.estacio.pri.exercicios;

public class Atividade04 {
	
	public static double depoisImpostos(double salario) {
		double res = 0;
		
		if(salario > 500) {
			res = salario - 90;
		}
		else {
			res = salario - 60;
		}
		
		return res;
	}

	public static void main(String[] args) {
		double s1 = Entrada.proximoDouble("Digite o salario do primeiro funcionario:", "Entrada de dados");
		double s2 = Entrada.proximoDouble("Digite o salario do segundo funcionario:", "Entrada de dados");
		double s3 = Entrada.proximoDouble("Digite o salario do terceiro funcionario:", "Entrada de dados");
		
		String res = "O salario liquido do 1o funcionario e: " + depoisImpostos(s1) +
					 "\nO salario liquido do 2o funcionario e: " + depoisImpostos(s2) +
					 "\nO salario liquido do 3o funcionario e: " + depoisImpostos(s3);
		Saida.normal(res, "Resultado dos funcionarios");
		
		double resEmpresa = depoisImpostos(s1) + depoisImpostos(s2) + depoisImpostos(s3);
		Saida.normal("O salario liquido total da empresa e: " + resEmpresa, "Resultado da empresa");
	}

}
