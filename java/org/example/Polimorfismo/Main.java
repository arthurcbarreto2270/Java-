package main.java.org.example.Polimorfismo;

public class Main {
    public static void main(String[] args) {
        Cachorro dog = new Cachorro();
        Gato cat = new Gato();
        Galo galo = new Galo();
        Pato pato = new Pato();

        System.out.println(dog.emitirsom() + " " + dog.comer());
        System.out.println(cat.emitirsom() + " " + cat.comer());
        System.out.println(galo.emitirsom() + " " + galo.comer());
        System.out.println(pato.emitirsom() + " " + pato.comer());

    }
}
