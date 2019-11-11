package br.estacio.pri.exerciciopolimorfismo.zoologico;

public class Zoologico {
    private static Animal[] jaula = new Animal[10];

    private static void preencherJaulas(){
        jaula[0] = new Cachorro("Valentina", 5);
        jaula[1] = new Cavalo("Johnny",8);
        jaula[2] = new Preguica("Cid",10);
        jaula[3] = new Cachorro("Chuchu", 8);
        jaula[4] = new Cavalo("Fred", 10);
        jaula[5] = new Preguica("Claudia", 13);
        jaula[6] = new Cachorro("Belinha", 9);
        jaula[7] = new Cavalo("Paula", 4);
        jaula[8] = new Preguica("Junior", 15);
        jaula[9] = new Cachorro("Clayton", 15);
    }

    private static void percorrerJaulas(){
        for(int i = 0; i < jaula.length; i++){
            System.out.print("Jaula " + (i + 1) + "\n");
            jaula[i].emitirSom();
            if (jaula[i] instanceof  PodeCorrer) {
                ((PodeCorrer) jaula[i]).correr();
            }
        }
    }

    public static void main(String[] args) {
        preencherJaulas();

        percorrerJaulas();
    }
}
