package org.example;

public abstract class Funcionario implements SalarioFinal {
    protected String nome;
    protected String cpf;
    protected String dataNascimento;
    protected double salarioBase;
    protected String rg;
    protected String dataAdmisao;

    public Funcionario(String nome, String cpf, String dataNascimento, double salarioBase, String rg, String dataAdmisao) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.salarioBase = salarioBase;
        this.rg = rg;
        this.dataAdmisao = dataAdmisao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getDataAdmisao() {
        return dataAdmisao;
    }

    public void setDataAdmisao(String dataAdmisao) {
        this.dataAdmisao = dataAdmisao;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", salarioBase=" + salarioBase +
                ", rg='" + rg + '\'' +
                ", dataAdmisao='" + dataAdmisao + '\'' +
                '}';
    }
}
