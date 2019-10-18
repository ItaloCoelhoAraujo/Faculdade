package br.estacio.programacao.contacorrente;

import javax.swing.JOptionPane;

public class Conta
{
    // atributos - ESTADO
    int numeroConta;
    String nomeCliente;
    double saldo;
    String[] historico;
    int contador = 0;
   
    // métodos - COMPORTAMENTO
    void movimentar(double valor, char tipo)
    {
        if (tipo == 'C' || tipo == 'c')
        {
            creditar(valor);
        }
        else if (tipo == 'D' || tipo == 'd')
        {
        	debitar(valor);
        }
    }
   
    void creditar(double valor)
    {
        if (valor > 0)
        {
            saldo += valor;
            if (contador < 1000)
            {
                historico[contador++] = "Creditou R$ "+valor;
            }
        }
    }
   
    void debitar(double valor)
    {
        if (saldo >= valor && valor > 0)
        {
            saldo -= valor;
            if (contador < 1000)
            {
                historico[contador++] = "Debitou R$ "+valor;
            }
        }
    }
   
    void consultarSaldo()
    {
        JOptionPane.showMessageDialog(null, "O saldo e: " + saldo, "Saldo", JOptionPane.INFORMATION_MESSAGE);
    }
   
    void criarConta(int conta, String nome)
    {
        numeroConta = conta;
        nomeCliente = nome;
        saldo = 0;
        historico = new String[1000];
    }
   
    void alterarNome(String nome)
    {
        nomeCliente = nome;
    }
   
    void mostrarHistorico()
    {
        String historicoDisplay = "Nome: " + nomeCliente + "    Numero da conta: " + numeroConta + "\n\n\n";
        
    	for(int i=0; i < contador; i++)
        {
            historicoDisplay += historico[i] + "\n";
        }
        historicoDisplay += "\n\nSaldo atual: R$ " + saldo;
        
        JOptionPane.showMessageDialog(null, historicoDisplay, "Historico", JOptionPane.INFORMATION_MESSAGE);
    }

}