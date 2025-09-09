package org.example;
import java.util.Scanner;
public class AlunoNotas {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = ler.nextLine();

        System.out.println("Digite sua primeira nota: ");
        Double nota1 = ler.nextDouble();

        System.out.println("Digite sua segunda nota: ");
        Double nota2 = ler.nextDouble();

        ler.close();

        Double media = (nota1 + nota2) / 2;

        if (media >= 7) {
            System.out.println(nome + " a sua média no semestre foi de: " + media + " Você foi aprovado");
        } else {
            System.out.println(nome + " a sua média no semestre foi de: " + media + " Você foi reprovado");
        }

    }
}
