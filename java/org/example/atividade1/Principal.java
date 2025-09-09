package main.java.org.example.atividade1;

public class Principal {
    public static void main(String[] args) {
        Livro livro1 = new Livro();
        livro1.titulo = "Dom Quixote";
        livro1.nomeAutor = "Miguel de Cervantes";
        livro1.numeroPag = 863;
        livro1.preco = 49.90;

        System.out.println("Informações do livro 1:");
        System.out.println("Titulo: " + livro1.titulo);
        System.out.println("Autor: " + livro1.nomeAutor);
        System.out.println("Número de Páginas: " + livro1.numeroPag);
        System.out.println("Preço: R$ " + livro1.preco);

        Livro livro2 = new Livro();
        livro2.titulo = "O codigo da vinci";
        livro2.nomeAutor = "Dan Brown";
        livro2.numeroPag = 480;
        livro2.preco = 39.90;

        System.out.println("\nInformações do livro 2:");
        System.out.println("Titulo: " + livro2.titulo);
        System.out.println("Autor: " + livro2.nomeAutor);
        System.out.println("Número de Páginas: " + livro2.numeroPag);
        System.out.println("Preço: R$ " + livro2.preco);

    }
}
