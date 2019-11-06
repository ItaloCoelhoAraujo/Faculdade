package br.estacio.pri.exerciciopolimorfismo.zoologico;

public class Preguica extends Animal {

    public Preguica() {

    }

    public Preguica(String nome, int idade) {
        super(nome, idade);
    }

    public void emitirSom(){
        System.out.println("A preguica faz Fhiiiiiuuuuuu!");
    }

    public void subirArvore(){
        System.out.print("Preguiça comeca a sobir na arvore!");
    }
}
