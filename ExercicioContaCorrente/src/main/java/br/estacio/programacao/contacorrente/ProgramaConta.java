package br.estacio.programacao.contacorrente;

public class ProgramaConta
{
	static void menuPrincipal()
	{
		double valor;
		String nome;
		
        Conta conta = new Conta();
        int opcao = 1;
        String opcoes =
                "Programa de Conta Corrente\n\n" +
                "1-Depositar Valor\n" +
                "2-Sacar Valor\n" +
                "3-Consultar Saldo\n" +
                "4-Mostrar Histórico\n" +
                "5-Alterar nome\n" +
                "0-Finalizar\n\n" +
                "Digite a opção desejada:";
        
        int nconta = Entrada.Int("Digite o número da conta:");
  	    nome = Entrada.String("Digite o seu nome:");
        conta.criarConta(nconta, nome);

        while (opcao != 0)
        {
            opcao = Integer.parseInt(Entrada.String(opcoes));
            if (opcao == 0)
                continue;
       
            switch(opcao)
            {
              case 1: //depositar
            	  valor = Entrada.Double("Digite o valor a ser depositado:");
            	  conta.movimentar(valor, 'C');
                  break;
              case 2: //sacar
            	  valor = Entrada.Double("Digite o valor a ser sacado:");
                  conta.movimentar(valor, 'D');
                  break;
              case 3: //consultar saldo
                  conta.consultarSaldo();
                  break;
              case 4: //mostrar historico
                  conta.mostrarHistorico();
                  break;
              case 5: //alterar nome
            	  nome = Entrada.String("Digite o novo nome(completo):");
            	  conta.alterarNome(nome);
            	  break;
              default:
                  Saida.Erro("Opção Inválida.\nSelecione uma opção do Menu");
            }
        }
	}
	
	public static void main(String[] args)
    {
		menuPrincipal();
    }

}