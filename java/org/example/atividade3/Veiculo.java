package main.java.org.example.atividade3;

public class Veiculo {
    private String placa;
    private String cor;
    private String numPassageiros;
    private String capacidadeTanque;
    private String velociadeMax;
    private String consumoMedio;
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getNumPassageiros() {
        return numPassageiros;
    }
    public void setNumPassageiros(String numPassageiros) {
        this.numPassageiros = numPassageiros;
    }
    public String getCapacidadeTanque() {
        return capacidadeTanque;
    }
    public void setCapacidadeTanque(String capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }
    public String getVelociadeMax() {
        return velociadeMax;
    }
    public void setVelociadeMax(String velociadeMax) {
        this.velociadeMax = velociadeMax;
    }
    public String getConsumoMedio() {
        return consumoMedio;
    }
    public void setConsumoMedio(String consumoMedio) {
        this.consumoMedio = consumoMedio;
    }
    public Veiculo(String placa, String cor, String numPassageiros, String capacidadeTanque, String velociadeMax, String consumoMedio) {
        this.placa = placa;
        this.cor = cor;
        this.numPassageiros = numPassageiros;
        this.capacidadeTanque = capacidadeTanque;
        this.velociadeMax = velociadeMax;
        this.consumoMedio = consumoMedio;
    }
}
