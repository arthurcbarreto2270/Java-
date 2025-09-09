package main.java.org.example.Polimorfismo;

public class Galo implements Animal{
    @Override
    public String emitirsom() {
        return "cocoricó";
    }

    @Override
    public String comer() {
        return "Milho";
    }
}
