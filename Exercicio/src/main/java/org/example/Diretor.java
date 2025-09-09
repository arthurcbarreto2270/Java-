package org.example;

public class Diretor extends CargoConfianca{
    private final double PREMIO = 1.1;

    public Diretor(String nome, String cpf, String dataNascimento, double salarioBase, String rg, String dataAdmisao, Bonificacao bonificacao) {
        super(nome, cpf, dataNascimento, salarioBase, rg, dataAdmisao, bonificacao);
    }

    @Override
    public String toString() {
        return "Diretor{" +
                "PREMIO=" + PREMIO +
                ", bonificacao=" + bonificacao +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", salarioBase=" + salarioBase +
                ", rg='" + rg + '\'' +
                ", dataAdmisao='" + dataAdmisao + '\'' +
                '}';
    }

    @Override
    public double obterSalarioFinal() {
        return PREMIO*(salarioBase + (salarioBase*Bonificacao.DIRETOR.getValor()));
    }
}
