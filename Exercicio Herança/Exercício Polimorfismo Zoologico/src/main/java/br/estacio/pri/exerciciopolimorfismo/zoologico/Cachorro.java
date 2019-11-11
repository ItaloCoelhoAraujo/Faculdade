package br.estacio.pri.exerciciopolimorfismo.zoologico;

public class Cachorro extends Animal implements PodeCorrer {

    public Cachorro() {

    }

    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    public void emitirSom() {
        System.out.println("Cachorro faz Au Au!");
    }

    public void correr(){
        System.out.print("Cachorro comeca a correr!\n");
    }
}
