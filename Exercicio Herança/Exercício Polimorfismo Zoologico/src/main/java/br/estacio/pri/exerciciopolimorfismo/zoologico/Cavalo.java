package br.estacio.pri.exerciciopolimorfismo.zoologico;

public class Cavalo extends Animal implements PodeCorrer {

    public Cavalo() {

    }

    public Cavalo(String nome, int idade) {
        super(nome, idade);
    }

    public void emitirSom() {
        System.out.println("Cavalo faz hiin in in hinir!");
    }

    public void correr(){
        System.out.print("Cavalo comeca a correr!\n");
    }
}
