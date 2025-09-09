package main.java.org.example.atividade9;

public class Output {
    public static void main(String[] args) {
        Endereco end = new Endereco("Rua rio B","28","Apto 302","40400200","Salvador");
        Endereco end2 = new Endereco("Rua rio A","27","Apto 301","40400210","Salvador");
        Engenheiro eng = new Engenheiro("Arthur","arthur@email.com",1500.0f,end, "crea-ba");
        Medico med = new Medico("Maria","maria@email.com",50000.00f,end2,"crm-ba");
        System.out.println(med);
        System.out.println(eng);
    }
}
