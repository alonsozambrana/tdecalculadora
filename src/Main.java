import exercicio1.Aluno;
import exercicio1.Pessoa;
import exercicio1.Professor;
import exercicio1.Turma;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Alonso");
        pessoa1.setEmail("alonsozambrana97@gmail.com");
        System.out.println("Nome: " + pessoa1.getNome());
        System.out.println("E-mail: " + pessoa1.getEmail());
        pessoa1.logar();

        Professor professor1 = new Professor( "Miguel", "miguel@gmail.com");
        System.out.println("exercicio1.Professor é " + professor1.getNome() + " e seu email é " + professor1.getEmail());
        System.out.println("exercicio1.Professor Logado!");

        Turma turma1 = new Turma("Estrutura de Dados", professor1, 30);

        Aluno aluno1 = new Aluno();
        aluno1.setNome("Pedro");

        Aluno aluno2 = new Aluno();
        aluno2.setNome("Joao");

        turma1.inserirAluno(aluno1);
        turma1.inserirAluno(aluno2);
        turma1.listarAlunos();

    }
}