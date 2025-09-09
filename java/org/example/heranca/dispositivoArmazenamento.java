package main.java.org.example.heranca;

public class dispositivoArmazenamento extends Componente{
    private String tipoConexao;
    private String espacoArmz;

    public dispositivoArmazenamento(String marca, String modelo, String tipoConexao, String espacoArmz) {
        super(marca, modelo);
        this.tipoConexao = tipoConexao;
        this.espacoArmz = espacoArmz;
    }

    public String getTipoConexao() {
        return tipoConexao;
    }

    public void setTipoConexao(String tipoConexao) {
        this.tipoConexao = tipoConexao;
    }

    public String getEspacoArmz() {
        return espacoArmz;
    }

    public void setEspacoArmz(String espacoArmz) {
        this.espacoArmz = espacoArmz;
    }
}
