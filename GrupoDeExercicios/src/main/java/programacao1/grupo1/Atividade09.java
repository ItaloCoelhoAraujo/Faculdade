package programacao1.grupo1;

public class Atividade09 {

	public static void main(String[] args) {
		/*
        * 9) A revendedora de carros XYZ, paga a seus vendedores dois salarios minimos fixos,
        * mais uma comissao fixa de R$ 150,00 por carro vendido e mais 5% do valor total das vendas do vendedor.
        * 
        * Determine o salario total de um vendedor e mostre, no final, seu nome e seu salario total.
        */ 
		
        String nomeVendedor;
        int quantidadeCarrosVendidos;
        double valorCarros;
        double salarioMinimo             = (double) 998.00;
        double comissaoFixaPorCarro      = (double) 150.00;
        
        //Recebendo o nome, quantidade de carros vendidos e valor que os carros foram vendidos
        nomeVendedor = Entrada.String("Qual o nome do vendedor?", "Dados do vendedor");
        quantidadeCarrosVendidos = Entrada.Int("Quantos carros ele vendeu neste mês?", "Dados do vendedor");
        valorCarros = Entrada.Double("Qual o valor pelo qual os carros foram vendidos?", "Dados do vendedor");
        
        //Calculando o salario total
        double salarioTotal = (2 * salarioMinimo) + (comissaoFixaPorCarro * quantidadeCarrosVendidos)
        					 + ( valorCarros * quantidadeCarrosVendidos * (double) 0.05 );
        
        Saida.Normal("O vendedor " + nomeVendedor + " recebera R$ " + salarioTotal + " neste mes!", "Total de vendas");
	}

}
