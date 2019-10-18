package br.estacio.programacao.contacorrente;

import javax.swing.JOptionPane;

public class Entrada
{
	public static int Int(String mensagem) {
		int entradaInt;
		String strInt = JOptionPane.showInputDialog(null, mensagem, "Entrada de dados", JOptionPane.PLAIN_MESSAGE);
		entradaInt = Integer.parseInt(strInt);
		return entradaInt;
	}
	
	public static double Double(String mensagem) {
		double entradaDouble;
		String strDouble = JOptionPane.showInputDialog(null, mensagem, "Entrada de dados", JOptionPane.PLAIN_MESSAGE);
		entradaDouble = Double.parseDouble(strDouble);
		return entradaDouble;
	}
	
	public static String String(String mensagem) {
		String entradaString = JOptionPane.showInputDialog(null, mensagem, "Entrada de dados", JOptionPane.PLAIN_MESSAGE);
		return entradaString;
	}
	
	public static char Char(String mensagem) {
		char entradaChar;
		String strChar = JOptionPane.showInputDialog(null, mensagem, "Entrada de dados", JOptionPane.PLAIN_MESSAGE);
		entradaChar = strChar.charAt(0);
		return entradaChar;
	}
}