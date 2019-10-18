package br.estacio.pri.exercicios;

import javax.swing.JOptionPane;

public class Saida 
{
	public static void normal (String mensagem, String titulo)
	{
		JOptionPane.showMessageDialog(null, mensagem, titulo, JOptionPane.PLAIN_MESSAGE);
	}
	
	public static void erro (String mensagem, String titulo)
	{
		JOptionPane.showMessageDialog(null, mensagem, titulo, JOptionPane.ERROR_MESSAGE);
	}
	
	public static void aviso (String mensagem, String titulo)
	{
		JOptionPane.showMessageDialog(null, mensagem, titulo, JOptionPane.WARNING_MESSAGE);
	}
}