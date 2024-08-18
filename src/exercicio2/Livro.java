package exercicio2;

public class Livro {
    private String titulo;
    private String autor;
    private int numeroPaginas;
    private boolean disponibilidade;

    public Livro(String titulo, String autor, int numeroPaginas, boolean disponibilidade) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.disponibilidade = true;

    }

    public void exibirDetalhes(){
        System.out.println("Título: " + titulo + " Autor: " + autor + " Páginas: " + numeroPaginas);
        System.out.println("Disponibilidade: " + (disponibilidade ? "Sim" : "Não"));
    }

    public void reservar(){
        if(disponibilidade){
            disponibilidade = false;
            System.out.println("o livro " + titulo + " foi reservado com sucesso");
        }else{
            System.out.println("o livro " + titulo + " esta disponivel" );
        }
    }

    public void devolver(){
        disponibilidade = true;
        System.out.println("o livro " + titulo + " foi devolvido com sucesso");
    }

    public boolean isDisponivel() {
        return disponibilidade;
    }
}
