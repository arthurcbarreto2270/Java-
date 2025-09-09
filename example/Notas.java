package org.example;

import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double[] notas = new double[2];

        for (int i = 0; i < 2; i++) {
            do {
                System.out.println("Digite a " + (i + 1) + " nota: ");
                notas[i] = ler.nextDouble();
            } while (notas[i] < 0 || notas[i] > 10);

        }
    }
}
