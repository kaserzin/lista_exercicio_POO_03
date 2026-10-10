package questao01;


public class Turma {

    private Aluno[] alunos;
    private int quantidadeAlunos = 0;

    public Turma(int capacidade) {
        alunos = new Aluno[capacidade];
    }

    public void adicionarAluno(Aluno aluno) {
        if (quantidadeAlunos < alunos.length) {
            alunos[quantidadeAlunos] = aluno;
            quantidadeAlunos++;
        } else {
            System.out.println("Turma cheia!");
        }
    }

    public void listarAprovados() {
        System.out.println("\n--- APROVADOS ---");

        for (int i = 0; i < quantidadeAlunos; i++) {
            if (alunos[i].estaAprovado()) {
                alunos[i].exibirDados();
            }
        }
    }

    public void listarReprovados() {
        IO.println("\n--- REPROVADOS ---");

        for (int i = 0; i < quantidadeAlunos; i++) {
            if (!alunos[i].estaAprovado()) {
                alunos[i].exibirDados();
            }
        }
    }
}
