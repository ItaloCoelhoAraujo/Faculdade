package programacao1.grupo2;

public class Atividade05 {

	public static void main(String[] args) {
		/*
        * 5) Receber as notas das AV1 e AV2, calcular e mostrar a media do aluno
        * e seu resultado de aprovacao para os criterios da FIC. Caso seja necessario
        * a realizacao da prova final, receber a nota da AV3, calcular a nova media
        * e mostrar o resultado final da aprovacao.
        */
		double av1, av2, media;
        String resAprovacao;
        
        av1 = Entrada.Double("Digite a nota de AV 1:", "Notas das provas");
        av2 = Entrada.Double("Digite a nota de AV 2:", "Notas das provas");
        
        media = ( av1 + av2 ) / 2;
        
        	if ( media >= 6 )
            resAprovacao = "Aprovado!";
        
        else
        {
            double av3       = Entrada.Double("Digite a nota de AV 3:", "Nota da AV 3");
            double maiorNota = ( av1 > av2 ) ? av1 : av2;
            
            media = ( maiorNota + av3 ) / 2;            
            
            if ( media >= 6 )
                resAprovacao = "Aprovado!";
        
            else
                resAprovacao = "Reprovado...";
        }
        
        String resultado = "Sua media foi: " + media;
        resultado += "\nVoce foi " + resAprovacao;
        Saida.Normal(resultado, "Media final");

	}

}
