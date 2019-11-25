package br.estacio.pri.exerciciopolimorfismo.zoologico;

public class ProgramaAnimal {
    public static void main(String[] args) {
        Animal animal = new Cachorro();
        animal.emitirSom();

        animal = new Cavalo();
        animal.emitirSom();

        animal = new Preguica();
        animal.emitirSom();
    }
}
