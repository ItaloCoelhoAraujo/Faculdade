package programacao1.grupo3;

import javax.swing.JOptionPane;

public class Saida 
{
	public static void Normal (String mensagem, String titulo)
	{
		JOptionPane.showMessageDialog(null, mensagem, titulo, JOptionPane.PLAIN_MESSAGE);
	}
	
	public static void Erro (String mensagem, String titulo)
	{
		JOptionPane.showMessageDialog(null, mensagem, titulo, JOptionPane.ERROR_MESSAGE);
	}
	
	public static void Aviso (String mensagem, String titulo)
	{
		JOptionPane.showMessageDialog(null, mensagem, titulo, JOptionPane.WARNING_MESSAGE);
	}
}