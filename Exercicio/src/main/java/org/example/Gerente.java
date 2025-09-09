package org.example;

public class Gerente extends CargoConfianca implements Contratacao {
    public Gerente(String nome, String cpf, String dataNascimento, double salarioBase, String rg, String dataAdmisao, Bonificacao bonificacao) {
        super(nome, cpf, dataNascimento, salarioBase, rg, dataAdmisao, bonificacao);
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "bonificacao=" + bonificacao +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", salarioBase=" + salarioBase +
                ", rg='" + rg + '\'' +
                ", dataAdmisao='" + dataAdmisao + '\'' +
                '}';
    }

    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("Admitindo: " + funcionario.nome);
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("Demitindo: " + funcionario.nome);

    }

    @Override
    public double obterSalarioFinal() {
        return super.salarioBase * Bonificacao.GERENTE.getValor();
    }
}
