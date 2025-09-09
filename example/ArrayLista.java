package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLista {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ArrayList<Double>notas = new ArrayList<>();
        String resposta;
        double nt;
        do{
            do{
                System.out.println("Digite uma nota: ");
                nt = ler.nextDouble();
            }while(nt < 0 || nt > 10 );
            notas.add(nt);
            System.out.println("Deseja inserir mais uma nota?");
            System.out.println("\nPressione a tecla N para sair.");
            resposta = ler.next();

        }while (!resposta.equalsIgnoreCase("n"));

        System.out.println("\nExibindo as notas: ");
        for(double nota:notas){
            System.out.println("Nota: "+nota);
        }
    }
}
