package org.example;

public abstract class CargoConfianca extends Funcionario {
    protected Bonificacao bonificacao;

    public CargoConfianca(String nome, String cpf, String dataNascimento, double salarioBase, String rg, String dataAdmisao, Bonificacao bonificacao) {
        super(nome, cpf, dataNascimento, salarioBase, rg, dataAdmisao);
        this.bonificacao = bonificacao;
    }

    public Bonificacao getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(Bonificacao bonificacao) {
        this.bonificacao = bonificacao;
    }

    @Override
    public String toString() {
        return "CargoConfianca{" +
                "bonificacao=" + bonificacao +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", salarioBase=" + salarioBase +
                ", rg='" + rg + '\'' +
                ", dataAdmisao='" + dataAdmisao + '\'' +
                '}';
    }
}


