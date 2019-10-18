package programacao1.grupo1;

public class Atividade08 {

	public static void main(String[] args) {
		/*
        * 8) Considerando que para um consorcio, sabe-se o numero total de prestacoes,
        * a quantidade de prestacoes pagas e o valor da prestacao.
        */
        int totalPrestacoes, totalprestacoesPagas;
        double valorPrestacao;
        
        totalPrestacoes = Entrada.Int("Digite o numero total de prestacoes:", "Prestacoes");
        totalprestacoesPagas = Entrada.Int("Quantas prestacoes ja foram pagas?", "Prestacoes");
        valorPrestacao = Entrada.Double("Qual o valor das prestacoes?", "Prestacoes");
        
        // Calcular e mostrar o valor total pago e o saldo devedor.
        double valotTotalPago = totalprestacoesPagas * valorPrestacao;
        double saldoDevedor   = ( totalPrestacoes - totalprestacoesPagas ) * valorPrestacao;
        
        String resultado = "Valor total pago: R$ " + valotTotalPago;
        resultado +=  "\nSaldo devedor:    R$ " + saldoDevedor;
        Saida.Normal(resultado, "Saldo de prestacoes");

	}

}
