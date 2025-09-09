package org.example;

public class Motoboy extends Funcionario {
    private String placaMoto;

    public Motoboy(String nome, String cpf, String dataNascimento, double salarioBase, String rg, String dataAdmisao, String placaMoto) {
        super(nome, cpf, dataNascimento, salarioBase, rg, dataAdmisao);
        this.placaMoto = placaMoto;
    }

    public String getPlacaMoto() {
        return placaMoto;
    }

    public void setPlacaMoto(String placaMoto) {
        this.placaMoto = placaMoto;
    }

    @Override
    public double obterSalarioFinal() {
        return super.salarioBase;
    }
}
