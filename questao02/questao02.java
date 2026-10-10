import java.util.Arrays;
import java.util.Scanner;

void main() {
    Scanner scanner = new Scanner(System.in);

    int[] numeros = new int[6];
    int quantidade = 0;

    while (quantidade < 6) {
        IO.print("Digite o " + (quantidade + 1) + "º número (1 a 60): ");
        int numero = scanner.nextInt();

        if (numero < 1 || numero > 60) {
            IO.println("Número inválido! Digite de 1 a 60.");
            continue;
        }

        boolean duplicado = false;

        for (int i = 0; i < quantidade; i++) {
            if (numeros[i] == numero) {
                duplicado = true;
                break;
            }
        }

        if (duplicado) {
            IO.println("Número já informado! Digite outro.");
        } else {
            numeros[quantidade] = numero;
            quantidade++;
        }
    }

    Arrays.sort(numeros);

    IO.println("\nNúmeros em ordem crescente:");
    IO.println(Arrays.toString(numeros));

    scanner.close();
}
