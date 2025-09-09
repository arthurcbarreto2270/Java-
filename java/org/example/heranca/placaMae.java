package main.java.org.example.heranca;

public class placaMae extends Componente {
    private String soquete;

    public placaMae(String marca, String modelo, String soquete) {
        super(marca, modelo);
        this.soquete = soquete;
    }

    public String getSoquete() {
        return soquete;
    }

    public void setSoquete(String soquete) {
        this.soquete = soquete;
    }
}
