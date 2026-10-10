package questao01;

public class Main {

    public static void main(String[] args) {
        Turma turma = new Turma(3);

        Aluno aluno1 = new Aluno("Pedro", 101);
        aluno1.cadastrarNota(9.0);
        aluno1.cadastrarNota(8.0);
        aluno1.cadastrarNota(9.5);
        aluno1.cadastrarNota(8.5);

        Aluno aluno2 = new Aluno("Rennan", 102);
        aluno2.cadastrarNota(5.0);
        aluno2.cadastrarNota(6.0);
        aluno2.cadastrarNota(4.0);
        aluno2.cadastrarNota(5.0);

        Aluno aluno3 = new Aluno("Jonn", 103);
        aluno3.cadastrarNota(7.0);
        aluno3.cadastrarNota(8.0);
        aluno3.cadastrarNota(6.0);
        aluno3.cadastrarNota(7.0);

        turma.adicionarAluno(aluno1);
        turma.adicionarAluno(aluno2);
        turma.adicionarAluno(aluno3);

        turma.listarAprovados();
        turma.listarReprovados();
    }
}