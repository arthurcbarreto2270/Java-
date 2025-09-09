package main.java.org.example.atividade5;

public class contaBancaria {
    String banco;
    String agencia;
    int numeroConta;
    String tipoConta;
    double saldo;
    double limite;

    public contaBancaria(String banco, String agencia, int numeroConta, String tipoConta, double saldo, double limite) {
        this.banco = banco;
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.tipoConta = tipoConta;
        this.saldo = saldo;
        this.limite = limite;
    }

    @Override
    public String toString() {
        return "contaBancaria{" +
                "banco='" + banco + '\'' +
                ", agencia='" + agencia + '\'' +
                ", numeroConta=" + numeroConta +
                ", tipoConta='" + tipoConta + '\'' +
                ", saldo=" + saldo +
                ", limite=" + limite +
                '}';
    }
}
