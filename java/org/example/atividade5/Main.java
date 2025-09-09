package main.java.org.example.atividade5;

public class Main {
    public static void main(String[] args) {
        contaBancaria Cb1 = new contaBancaria("Caixa","Caminho de areia",1223344,"Poupança",1000.50,10000);
        Funcionario func = new Funcionario(556667788, "João kleber","Rua A", 992567865, "kleberdamassa@email.com", Cb1);
        System.out.println(func);
    }
}
