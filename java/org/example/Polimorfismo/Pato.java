package main.java.org.example.Polimorfismo;

public class Pato implements Animal
{
    @Override
    public String emitirsom() {
        return "quack";
    }

    @Override
    public String comer() {
        return "Minhocas";
    }
}
