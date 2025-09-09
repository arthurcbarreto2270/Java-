package main.java.org.example.enums;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Arthur",19,Pedido.Aberto);
        System.out.println(cliente1.toString());
    }
}
