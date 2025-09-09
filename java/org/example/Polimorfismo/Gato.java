package main.java.org.example.Polimorfismo;

public class Gato implements Animal{
    @Override
    public String emitirsom() {
        return "miau";
    }

    @Override
    public String comer() {
        return "Ração";
    }
}
