package main.java.org.example.atividade2;

public class Pets {
    private String nome;
    private String raca;
    private int idade;
    private String porte;
    private String alimentacao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public String getAlimentacao() {
        return alimentacao;
    }

    public void setAlimentacao(String alimentacao) {
        this.alimentacao = alimentacao;
    }

    public Pets(String nome, String raca, int idade, String porte, String alimentacao) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
        this.porte = porte;
        this.alimentacao = alimentacao;
    }
}
