package questao01;


public class Aluno {

    private String nome;
    private int matricula;
    private double[] notas = new double[4];
    private int quantidadeNotas = 0;

    public Aluno(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public void cadastrarNota(double nota) {
        if (quantidadeNotas < 4 && nota >= 0 && nota <= 10) {
            notas[quantidadeNotas] = nota;
            quantidadeNotas++;
        } else {
            IO.println("Nota inválida ou limite de notas atingido!");
        }
    }

    public double calcularMedia() {
        if (quantidadeNotas == 0) {
            return 0;
        }

        double soma = 0;

        for (int i = 0; i < quantidadeNotas; i++) {
            soma += notas[i];
        }

        return soma / quantidadeNotas;
    }

    public boolean estaAprovado() {
        return quantidadeNotas > 0 && calcularMedia() >= 7.0;
    }

    public void exibirDados() {
        System.out.printf(
                "Nome: %s | Matrícula: %d | Média: %.2f%n",
                nome, matricula, calcularMedia()
        );
    }
}

