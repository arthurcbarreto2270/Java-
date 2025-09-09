package main.java.org.example.atividade6;

public class Master {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("a123d677","Arthur","R$ 3.000,00", 19,Sexo.MASCULINO,Setor.MARKETING);
        System.out.println(funcionario.toString());
    }
}
