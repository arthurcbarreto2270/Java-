package org.classes;

public class Principal {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.setnome = "Marta";
        p1.idade = 20;

        System.out.println("Nome: " + p1.nome);
        System.out.println("Idade: " + p1.idade);


        Produto pr1 = new Produto();
        pr1.nome = "Arroz";
        pr1.vlUnitario = "500g";

        System.out.println("\n\nNome do produto: " + pr1.nome);
        System.out.println("Valor unitario: " + pr1.vlUnitario);
    }
}
