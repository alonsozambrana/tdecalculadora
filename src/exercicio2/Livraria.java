package exercicio2;

public class Livraria{
    private Livro[] livros;
    private int indice = 0;

    public Livraria(int quantidade){
        livros = new Livro[quantidade];
    }

    public void inserirLivro(Livro livro){
        livros[indice] = livro;
        indice++;
    }

    public void listarLivros(){
        for (int i = 0; i < indice; i++){
            livros[i].exibirDetalhes();
        }
    }


    public void listarDisponiveis(){
        for (int i = 0; i < indice; i++){
            if(livros[i].isDisponivel()){
                livros[i].exibirDetalhes();
            }
        }
    }
}
