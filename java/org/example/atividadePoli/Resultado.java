package main.java.org.example.atividadePoli;

public class Resultado {
    public static void main(String[] args) {
        Soma soma = new Soma();
        Subtracao subtracao = new Subtracao();
        Multiplicacao multiplicacao = new Multiplicacao();
        Divisao divisao = new Divisao();

        System.out.println(soma.calcular(1,3));
        System.out.println(subtracao.calcular(2,4));
        System.out.println(multiplicacao.calcular(3,5));
        System.out.println(divisao.calcular(4,6));
    }
}
