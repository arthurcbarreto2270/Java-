package main.java.org.example.atividade3;

public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 123456789, 59.90,90);

        // Exibindo os detalhes do livro
        System.out.println("Título: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor());
        System.out.println("ISBN: " + livro.getIsbn());
        System.out.println("Valor de Compra: R$" + livro.getVlCompra());

        // Modificando o título do livro
        livro.setTitulo("O Hobbit");
        System.out.println("Novo Título: " + livro.getTitulo());
        // Modificando o autor do livro
        livro.setAutor("J.R.R. Tolkien");
        System.out.println("Novo Autor: " + livro.getAutor());
        // Modificando o ISBN do livro
        livro.setIsbn(987654321);
        System.out.println("Novo ISBN: " + livro.getIsbn());
        // Modificando o valor de compra do livro
        livro.setVlCompra(49.90);
        System.out.println("Novo Valor de Compra: R$" + livro.getVlCompra());


        Veiculo veiculo = new Veiculo("XYZ9876", "Azul", "4", "40L", "200km/h", "15km/L");
        // Exibindo os detalhes do veículo
        System.out.println("\nPlaca: " + veiculo.getPlaca());
        System.out.println("Cor: " + veiculo.getCor());
        System.out.println("Número de Passageiros: " + veiculo.getNumPassageiros());
        System.out.println("Capacidade do Tanque: " + veiculo.getCapacidadeTanque());
        System.out.println("Velocidade Máxima: " + veiculo.getVelociadeMax());
        System.out.println("Consumo Médio: " + veiculo.getConsumoMedio());
        // Modificando os detalhes do veículo
        veiculo.setPlaca("ABC1234");
        veiculo.setCor("Vermelho");
        veiculo.setNumPassageiros("5");
        veiculo.setCapacidadeTanque("50L");
        veiculo.setVelociadeMax("180km/h");
        veiculo.setConsumoMedio("12km/L");
        System.out.println("\nPlaca: " + veiculo.getPlaca());
        System.out.println("Cor: " + veiculo.getCor());
        System.out.println("Número de Passageiros: " + veiculo.getNumPassageiros());
        System.out.println("Capacidade do Tanque: " + veiculo.getCapacidadeTanque());
        System.out.println("Velocidade Máxima: " + veiculo.getVelociadeMax());
        System.out.println("Consumo Médio: " + veiculo.getConsumoMedio());

        // Exibindo os detalhes do veículo após as modificações


        Cliente cliente = new Cliente("João Silva", 56, 123456789, " Rua A, 123", 1198765-4326);
        // Exibindo os detalhes do cliente
        System.out.println("\nNome: " + cliente.getNome());
        System.out.println("Idade: " + cliente.getIdade());
        System.out.println("CPF: " + cliente.getCpf());
        System.out.println("Endereço: " + cliente.getEndereco());
        System.out.println("Telefone: " + cliente.getTelefone());
        // Modificando os detalhes do cliente
        cliente.setNome("Maria Oliveira");
        cliente.setIdade(30);
        cliente.setCpf(987654321);
        cliente.setEndereco("Rua B, 456");
        cliente.setTelefone(1198765-4321);
        System.out.println("\nNovo Nome: " + cliente.getNome());
        System.out.println("Nova Idade: " + cliente.getIdade());
        System.out.println("Novo CPF: " + cliente.getCpf());
        System.out.println("Novo Endereço: " + cliente.getEndereco());
        System.out.println("Novo Telefone: " + cliente.getTelefone());
        // Exibindo os detalhes do cliente após as modificações



    }
}
