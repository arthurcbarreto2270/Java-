package org.example;

public class Main {
    public static void main(String[] args) {
    Motoboy motoboy = new Motoboy("Arthur", "11122233344", "22/03/2006", 10000, "1122233345","09/09/2025","ASB1234");
    Gerente gerente = new Gerente("Heitor", "55566788899", "22/06/2006", 20000,"6677788890","10/09/2025",Bonificacao.GERENTE);
    Diretor diretor = new Diretor("Caio MArcio", "00011122233", "31/08/2010", 30000, "1012131415","11/09/2025",Bonificacao.DIRETOR);

        System.out.println(motoboy);
        System.out.println(gerente);
        System.out.println(diretor);

        gerente.admitir(motoboy);


    }
}