package main.java.org.example.atividade8;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        pessoaFisica fisica = new pessoaFisica("João Silva", "1234-5678", "123.456.789-00", "15-12.345.678",
                "01/01/1990");

        pessoaJuridica juridica = new pessoaJuridica("Empresa XYZ", "9876-5432", "12.345.678/0001-99",
                "123.456.789.000");
        System.out.println(fisica);
        System.out.println(juridica);
    }
}