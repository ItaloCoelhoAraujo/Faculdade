package br.estacio.pri.exercicios;

import javax.swing.JOptionPane;

public class Entrada
{
	public static int proximoInt(String mensagem, String titulo) {
		int entradaInt;
		String strInt = JOptionPane.showInputDialog(null, mensagem, titulo, JOptionPane.PLAIN_MESSAGE);
		entradaInt = Integer.parseInt(strInt);
		return entradaInt;
	}
	
	public static double proximoDouble(String mensagem, String titulo) {
		double entradaDouble;
		String strDouble = JOptionPane.showInputDialog(null, mensagem, titulo, JOptionPane.PLAIN_MESSAGE);
		entradaDouble = Double.parseDouble(strDouble);
		return entradaDouble;
	}
	
	public static String proximoString(String mensagem, String titulo) {
		String entradaString = JOptionPane.showInputDialog(null, mensagem, titulo, JOptionPane.PLAIN_MESSAGE);
		return entradaString;
	}
	
	public static char proximoChar(String mensagem, String titulo) {
		char entradaChar;
		String strChar = JOptionPane.showInputDialog(null, mensagem, titulo, JOptionPane.PLAIN_MESSAGE);
		entradaChar = strChar.charAt(0);
		return entradaChar;
	}
}