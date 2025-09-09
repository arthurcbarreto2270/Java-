package main.java.org.example.atividade2;
//pet1.nome = "Cachorro";
//        pet1.idade = 3;
//        pet1.porte = "Grande";
//        pet1.raca = "Pastor Alemão";
//        pet1.alimentacao = "Ração Premium";
//
//
//pet1.nome = "Gato";
//        pet1.idade = 5;
//        pet1.porte = "Pequeno";
//        pet1.raca = "Munchkin";
//        pet1.alimentacao = "Ração Gran Plus Choice";

public class Principal {
    public static void main(String[] args) {
        Pets pet1 = new Pets("Cachorro", "Pastor Alemão", 3, "Grande", "Ração Premium");


        System.out.println("\nInformações do pet 1:");
        System.out.println("Nome: " + pet1.getNome());
        System.out.println("Idade: " + pet1.getIdade() + " anos");
        System.out.println("Porte: " + pet1.getPorte());
        System.out.println("Ração: " + pet1.getAlimentacao());

        Pets pet2 = new Pets("Gato", "Munchkin", 5, "Pequeno", "Ração Gran Plus Choice");
//

        System.out.println("\nInformações do pet 2:");
        System.out.println("Nome: " + pet2.getNome());
        System.out.println("Idade: " + pet2.getIdade() + " anos");
        System.out.println("Porte: " + pet2.getPorte());
        System.out.println("Ração: " + pet2.getAlimentacao());
    }
}
