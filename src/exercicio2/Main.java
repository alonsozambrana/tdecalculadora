package exercicio2;

public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Pai rico ", " alonso", 300, true);
        Livro livro2 = new Livro("Pai pobre ", " pedro", 290, true);


        Livraria livraria = new Livraria(5);
        livraria.inserirLivro(livro1);
        livraria.inserirLivro(livro2);


        livraria.listarLivros();
        System.out.println("-------------------------------");
        livro1.reservar();
        System.out.println("-------------------------------");
        livraria.listarDisponiveis();
        System.out.println("-------------------------------");
        livro1.devolver();
        System.out.println("-------------------------------");
        livraria.listarDisponiveis();

    }
}
