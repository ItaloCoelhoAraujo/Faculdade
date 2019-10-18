package programacao1.grupo1;

public class Atividade10 {

	public static void main(String[] args) {
		/*
        * 10) Seja o problema de calcular o salario liquido de um funcionario, considerando que sobre o seu salario bruto
        * incide um desconto de 8,5% para a previdencia. Feito o desconto da previdencia, sobre o restant e feito um desconto
        * de 12,5% a titulo de imposto de renda. Mostrar ao final o nome do funcionario, o salario bruto e o salario lquido.
        */
		
        String nomeFuncionario;
        double salarioBruto, salarioLiquido, impostoPrevidencia, impostoDeRenda;
        
        //Recebendo o nome e o salario bruto
        nomeFuncionario = Entrada.String("Digite o nome do funcionario:", "Salario bruto");
        salarioBruto    = Entrada.Double("Digite o seu salario bruto: ", "Salario bruto");
        
        //Calculando
        impostoPrevidencia    = salarioBruto * (double) 0.085;
        impostoDeRenda        = (salarioBruto - impostoPrevidencia) * (double) 0.125;
        salarioLiquido        = salarioBruto - impostoPrevidencia - impostoDeRenda;
        
        //Saida
        String resultado = "Funcionario:   " + nomeFuncionario;
        resultado += "\nSalario Bruto:   R$ " + salarioBruto;
        resultado += "\nSalario Liquido: R$ " + salarioLiquido;
        Saida.Normal(resultado, "Salario liquido");

	}

}
