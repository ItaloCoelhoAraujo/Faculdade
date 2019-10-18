package br.estacio.programacao.pessoas;

public class ProgramaPessoa
{
	
	static Pessoa P1;
	static Pessoa P2;
	
	public static void main(String[] args) {
		/* 
		*	Pegar nome, sexo, idade, peso e altura de duas pessoas e mostrar os dados da que tem
		*	o maior IMC. 
		*/
		
		P1 = new Pessoa();
		P2 = new Pessoa();
		
		//Pegando os dados das pessoas		
		P1.nome = Entrada.String("Digite o nome da pessoa 1:");
		P1.sexo = Entrada.Char("Digite o sexo da pessoa 1 (M/F):");
		P1.idade = Entrada.Int("Digite a idade da pessoa 1:");
		P1.peso = Entrada.Double("Digite o peso da pessoa 1 em Kg:");
		P1.altura = Entrada.Double("Digite a altura da pessoa 1 em cm:");
		P2.nome = Entrada.String("Digite o nome da pessoa 2:");
		P2.sexo = Entrada.Char("Digite o sexo da pessoa 2 (M/F):");
		P2.idade = Entrada.Int("Digite a idade da pessoa 2:");
		P2.peso = Entrada.Double("Digite o peso da pessoa 2 em Kg:");
		P2.altura = Entrada.Double("Digite a altura da pessoa 2 em cm:");
		
		//Calculando		
		float imc1, imc2;
		
		imc1 = (float)(P1.peso/Math.pow(P1.altura, 2));
		imc2 = (float)(P2.peso/Math.pow(P2.altura, 2));
		
		//Mostrando o resultado		
		String resultado;
		
		if (imc1 > imc2)
		{
			resultado = P1.nome + ", " + P1.sexo + ", " + P1.idade + " anos, " + P1.peso + " Kg, " + P1.altura + " cm.";
		}
		else
		{
			resultado = P2.nome + ", " + P2.sexo + ", " + P2.idade + " anos, " + P2.peso + " Kg, " + P2.altura + " cm.";
		}
		
		Saida.Normal(resultado, "Maior MMC");
	}

}
