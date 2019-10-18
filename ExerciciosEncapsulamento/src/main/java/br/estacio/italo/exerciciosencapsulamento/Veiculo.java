
package br.estacio.italo.exerciciosencapsulamento;

public class Veiculo {
	private String placa, cor;
	private int numPassageiros;
	private float capacidadeTanque, velocidadeMaxima, velocidadeAtual, consumoMedio;
	
	//Construtor
	Veiculo(String placa, String cor, float capacidadeTanque, float velocidadeMaxima, float consumoMedio){
		this.placa = placa;
		this.cor = cor;
		this.capacidadeTanque = capacidadeTanque;
		this.velocidadeMaxima = velocidadeMaxima;
		this.consumoMedio = consumoMedio;
	}
	
	//Setters e Getters
	//placa
	public void setPlaca(String placa){
		this.placa = placa;
	}
	
	public String getPlaca(){
		return this.placa;
	}
	
	//cor
	public void setCor(String cor){
		this.cor = cor;
	}
	
	public String getCor(){
		return this.cor;
	}
	
	//Numero de Passageiros
	public void setNumPassageiros(int numPassageiros){
		this.numPassageiros = numPassageiros;
	}
	
	public int getNumPassageiros(){
		return this.numPassageiros;
	}
	
	//Capacidade do Tanque
	public void setCapacidadeTanque(float capacidadeTanque){
		this.capacidadeTanque = capacidadeTanque;
	}
	
	public float getCapacidadeTanque(){
		return this.capacidadeTanque;
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
	
	//Consumo Medio
	public void setConsumoMedio(float consumoMedio){
		this.consumoMedio = consumoMedio;
	}
	
	public float getConsumoMedio(){
		return this.consumoMedio;
	}
}