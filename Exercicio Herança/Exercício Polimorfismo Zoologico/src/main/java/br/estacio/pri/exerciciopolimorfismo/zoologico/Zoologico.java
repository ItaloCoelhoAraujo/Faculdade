package br.estacio.pri.exerciciopolimorfismo.zoologico;

public class Zoologico {
    private Animal[] jaula = new Animal[10];

    public void preencherJaulas(){
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

    public void percorrerJaulas(){
        for(int i = 0; i < jaula.length; i++){
            System.out.print("Jaula " + (i + 1) +
                             "\nTipo: " + jaula[i].getClass().getName());
            jaula[i].emitirSom();
            if (jaula[i].getClass() == Cachorro.class) {
                Cachorro cachorro = (Cachorro) jaula[i];
                cachorro.correr();
            }
            if (jaula[i].getClass() == Cavalo.class){
                Cavalo cavalo = (Cavalo) jaula[i];
                cavalo.correr();
            }
        }
    }
}
