package org.example;

import java.util.Scanner;

public class MediaAluno {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String nome;
        Double nota2;
        Double nota1;

        System.out.println("Digite seu nome: ");
        nome = ler.nextLine();
        do {
            System.out.println("Digite sua primeira nota: ");
            nota1 = ler.nextDouble();

            System.out.println("Digite sua segunda nota: ");
            nota2 = ler.nextDouble();
        } while (nota1 < 0 || nota1 > 10 || nota2 < 0 || nota2 > 10);

        Double media = (nota1 + nota2) / 2;

        if (media >= 7) {
            System.out.println(nome + " a sua média no semestre foi de: " + media + " Você foi aprovado");
        } else if (media >= 5 && media < 7) {
            System.out.println(nome + " a sua média no semestre foi de: " + media + " Você vai passar pela verificação suplementar");
        } else {
            System.out.println(nome + " a sua média no semestre foi de: " + media + " Você foi reprovado");
        }
        ler.close();

    }
}
