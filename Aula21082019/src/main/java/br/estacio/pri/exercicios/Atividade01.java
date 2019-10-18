package br.estacio.pri.exercicios;

public class Atividade01 {
	static String nome;
	static String curso;
	static String matricula;
	
	public static void main(String[] args) {
		nome = Entrada.proximoString("Digite o nome:", "Entrada de dados");
		//Italo Coelho Araujo
		curso = Entrada.proximoString("Digite o curso:", "Entrada de dados");
		//Ciencia da computacao
		matricula = Entrada.proximoString("Digite o numero de matricula:", "Entrada de dados");
		//201602707481
		
		Saida.normal("Nome: " + nome +
					 "\nCurso: " + curso +
					 "\nMatricula: " + matricula, "Resultado");
	}

}
