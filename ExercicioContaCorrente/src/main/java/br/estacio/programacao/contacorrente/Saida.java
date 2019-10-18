package br.estacio.programacao.contacorrente;

import javax.swing.JOptionPane;

public class Saida 
{
	public static void Normal (String mensagem)
	{
		JOptionPane.showMessageDialog(null, mensagem, "Saida de dados", JOptionPane.PLAIN_MESSAGE);
	}
	
	public static void Erro (String mensagem)
	{
		JOptionPane.showMessageDialog(null, mensagem, "Saida de dados", JOptionPane.ERROR_MESSAGE);
	}
	
	public static void Aviso (String mensagem)
	{
		JOptionPane.showMessageDialog(null, mensagem, "Saida de dados", JOptionPane.WARNING_MESSAGE);
	}
}