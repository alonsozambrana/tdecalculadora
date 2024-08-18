package exercicio1;

public class Professor extends Pessoa{
    public Professor(String nome, String email){
        setNome(nome);
        setEmail(email);

    }
    @Override
    public  void logar(){
        System.out.println("exercicio1.Professor Logado!");
    }
}
