package br.estacio.pri.exerciciopolimorfismo.zoologico;

public class Animal {
	private String nome;
	private int idade;

	//Constructor
	public Animal() {

	}

	public Animal(String nome, int idade) {
		this.setNome(nome);
		this.setIdade(idade);
	}

	//Getters e Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	//Metodos
	public void emitirSom(){
		System.out.print("O animal faz um som!");
	}
}
