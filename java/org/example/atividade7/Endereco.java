package main.java.org.example.atividade7;

public class Endereco {
    private String logradouro;
    private String numero;
    private String complemento;
    private String cep;
    private String cidade;
    private unidadeFederativa uf;

    public Endereco(String logradouro, String numero, String complemento, String cep, String cidade, unidadeFederativa uf) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
        this.cidade = cidade;
        this.uf = uf;
    }

    @Override
    public String toString() {
        return "\nEndereco: " +
                "\nlogradouro= " + logradouro  +
                "\nnumero= " + numero  +
                "\ncomplemento= " + complemento +
                "\ncep= " + cep +
                "\ncidade= " + cidade +
                "\nuf=" + uf;
    }
}
