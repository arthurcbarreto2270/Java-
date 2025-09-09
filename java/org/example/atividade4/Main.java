package main.java.org.example.atividade4;

public class Main {
    public static void main(String[] args) {
    Pet pts1 = new Pet("Cachorro", 7,"Pastor alemão");
    Cliente clt = new Cliente("Arthur", 19,pts1);
    System.out.println("Nome: "+clt.getNome());
    System.out.println("Idade: "+clt.getIdade());
    System.out.println("Pet: "+clt.getPet());

    }
}