package main.java.org.example.atividade3;

public class Livro {
    private String titulo;
    private String autor;
    private int isbn;
    private double vlCompra;
    private int numeroPaginas;

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getIsbn() {
        return isbn;
    }
    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }
    public double getVlCompra() {
        return vlCompra;
    }
    public void setVlCompra(double vlCompra) {
        this.vlCompra = vlCompra;
    }
    public int getNumeroPaginas() {
        return numeroPaginas;
    }
    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }
    public Livro(String titulo, String autor, int isbn, double vlCompra, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.vlCompra = vlCompra;
        this.numeroPaginas = numeroPaginas;
    }

}
