package main.java.org.example.atividade5;

public class Funcionario {
    private int codigoFuncionario;
    private String nome;
    private String endereco;
    private int telefone;
    private String email;
    private contaBancaria contaBanco;

    public Funcionario(int codigoFuncionario, String nome, String endereco, int telefone, String email, contaBancaria contaBanco) {
        this.codigoFuncionario = codigoFuncionario;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.contaBanco = contaBanco;
    }

    public int getCodigoFuncionario() {
        return codigoFuncionario;
    }

    public void setCodigoFuncionario(int codigoFuncionario) {
        this.codigoFuncionario = codigoFuncionario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public contaBancaria getContaBanco() {
        return contaBanco;
    }

    public void setContaBanco(contaBancaria contaBanco) {
        this.contaBanco = contaBanco;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "codigoFuncionario=" + codigoFuncionario +
                ", nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", telefone=" + telefone +
                ", email='" + email + '\'' +
                ", contaBanco=" + contaBanco +
                '}';
    }
}

