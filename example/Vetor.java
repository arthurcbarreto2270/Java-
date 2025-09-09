package org.example;

import java.util.Scanner;

public class Vetor {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double[] notas = new double[2];
        double soma=0;


        for(int i = 0 ; i < 2; i++){
            System.out.println("Digite a " +(i+1)+ " nota: ");
            notas[i] = ler.nextDouble();
            soma+=notas[i];
        }

        System.out.println("\nExibindo as notas: ");
        for(double nota:notas){
            System.out.println("Nota: " +nota);
        }
        double media=(soma)/2;
        System.out.println("A média é de: "+media);


        ler.close();
    }
}
