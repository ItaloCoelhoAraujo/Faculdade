package br.estacio.pri.exerciciopolimorfismo.zoologico;

import java.util.Scanner;

public class Veterinario {
    public void examinarAnimal(Animal animal){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha o tipo de animal: 1 - Cachorro, 2 - Cavalo, 3 - Preguica.");

        int tipo = sc.nextInt();

        switch (tipo) {
            case 1:
                animal = new Cachorro();
                break;
            case 2:
                animal = new Cavalo();
                break;
            case 3:
                animal = new Preguica();
                break;
        }

        animal.emitirSom();
    }
}
