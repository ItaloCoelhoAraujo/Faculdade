
package br.estacio.italo.exerciciosencapsulamento;

public class CarroCorrida{
	private int numeroCarro;
	private String piloto, equipe;
	private float velocidadeMaxima, velocidadeAtual;
	private boolean ligado;
	
	//Construtor
	CarroCorrida(int numeroCarro, String piloto, String equipe, float velocidadeMaxima){
		this.numeroCarro = numeroCarro;
		this.piloto = piloto;
		this.equipe = equipe;
		this.velocidadeMaxima = velocidadeMaxima;
	}
	
	//Setters e Getters
	//Numero do Carro
	public void setNumeroCarro(int numeroCarro){
		this.numeroCarro = numeroCarro;
	}
	
	public int getNumeroCarro(){
		return this.numeroCarro;
	}
	
	//Piloto
	public void setPiloto(String piloto){
		this.piloto = piloto;
	}
	
	public String getPiloto(){
		return this.piloto;
	}
	
	//Equipe
	public void setEquipe(String equipe){
		this.equipe = equipe;
	}
	
	public String getEquipe(){
		return this.equipe;
	}
	
	//Velocidade Maxima
	public void setVelocidadeMaxima(float velocidadeMaxima){
		this.velocidadeMaxima = velocidadeMaxima;
	}
	
	public float getVelocidadeMaxima(){
		return this.velocidadeMaxima;
	}
	
	//Velocidade Atual
	public void setVelocidadeAtual(float velocidadeAtual){
		this.velocidadeAtual = velocidadeAtual;
	}
	
	public float getVelocidadeAtual(){
		return this.velocidadeAtual;
	}
	
	//Metodos
	public void acelerar(float aumentoVelocidade){
            float teste = this.velocidadeAtual + aumentoVelocidade;
		if(teste <= this.velocidadeMaxima && this.ligado == true)
			this.velocidadeAtual += aumentoVelocidade;
		else if(this.velocidadeAtual + aumentoVelocidade > this.velocidadeMaxima)
			System.out.println("Erro! Limite de velocidade ultrapassado!");
		else if(this.ligado = false)
			System.out.println("Erro! O carro esta desligado! Por favor, ligue o carro antes de acelerar!");
	}
	
	public void frear(float freioPercentual){
            float teste = this.velocidadeAtual - (velocidadeAtual * freioPercentual);
		if(teste >= 0 && this.ligado == true)
			this.velocidadeAtual -= (velocidadeAtual * freioPercentual);
		else if(teste < 0 && this.ligado == true)
			this.velocidadeAtual = 0;
		else
			System.out.println("Erro! O carro esta desligado! Por favor, ligue o carro antes de frear!");
	}
	
	public void parar(){
		this.velocidadeAtual = 0;
	}
	
	public void ligar(){
		this.ligado = true;
	}
	public void desligar(){
		if(this.velocidadeAtual == 0)
			this.ligado = false;
		else
			System.out.println("Erro! O carro esta em movimento! Por favor, pare o carro antes de desligar!");
	}
}