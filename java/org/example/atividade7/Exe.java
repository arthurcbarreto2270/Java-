package main.java.org.example.atividade7;

public class Exe {
    public static void main(String[] args) {
        Endereco endereco1 = new Endereco("Rua rio A", "28", "apto 201", "40425090","Salvador", unidadeFederativa.BAHIA);
        Pessoa pessoa1 = new Pessoa(112233,"Arthur", 19, "71992525476", "arthur@email.com", Sexo.MASCULINO, endereco1);

        System.out.println(pessoa1.toString());
    }
}
