import java.util.Arrays;
import java.util.Scanner;

void main() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite a quantidade de números: ");
    int n = scanner.nextInt();

    if (n < 0) {
        IO.println("Digite um valor positivo.");
    } else {
        int[] fibonacci = new int[n];

        if (n > 0) {
            fibonacci[0] = 0;
        }

        if (n > 1) {
            fibonacci[1] = 1;
        }

        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        IO.println(Arrays.toString(fibonacci));
    }

    scanner.close();
}
