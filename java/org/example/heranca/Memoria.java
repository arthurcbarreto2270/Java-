package main.java.org.example.heranca;

public class Memoria extends Componente {
    private String capacArmz;


    public Memoria(String marca, String modelo, String capacArmz) {
        super(marca, modelo);
        this.capacArmz = capacArmz;
    }

    public String getCapacArmz() {
        return capacArmz;
    }

    public void setCapacArmz(String capacArmz) {
        this.capacArmz = capacArmz;
    }
}
