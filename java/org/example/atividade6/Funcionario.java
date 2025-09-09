package main.java.org.example.atividade6;

public class Funcionario {
    private String id;
    private String nome;
    private String salario;
    private int idade;
    private Sexo sexo;
    private Setor sector;

    public Funcionario(String id, String nome, String salario, int idade, Sexo sexo, Setor sector) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
        this.idade = idade;
        this.sexo = sexo;
        this.sector = sector;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", salario='" + salario + '\'' +
                ", idade=" + idade +
                ", sexo=" + sexo +
                ", sector=" + sector +
                '}';
    }
}


