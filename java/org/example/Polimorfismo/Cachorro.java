package main.java.org.example.Polimorfismo;

public class Cachorro implements Animal{

    @Override
    public String emitirsom() {
        return "auau";
    }

    @Override
    public String comer() {
        return "Ração";
    }
}
