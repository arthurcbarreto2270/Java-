package main.java.org.example.atividade7;

public class Pessoa {
    private int id;
    private  String nome;
    private  int idade;
    private String telefone;
    private String email;
    private Sexo sexo;
    private Endereco endereco;

    public Pessoa(int id, String nome, int idade, String telefone, String email, Sexo sexo, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
        this.email = email;
        this.sexo = sexo;
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Pessoa: " +
                "\nid= " + id +
                "\nnome= " + nome +
                "\nidade= " + idade +
                "\ntelefone= " + telefone +
                "\nemail= " + email +
                "\nsexo= " + sexo +
                "\nendereco= " + endereco;
    }
}
