import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 5;

        if (scanner.hasNextInt()) {
            int num = scanner.nextInt();

            if (num >= 0) {
                int r = fatorial(num);

                if (r != -1) {
                    System.out.printf("\nO fatorial de %d é: %d\n", num, r);
                } else {
                    System.out.println("\nEntrada inválida. Insira um número maior que 0.");
                }
            } else {
                System.out.println("\nEntrada inválida. Insira um número maior ou igual a 0.");
            }
        } else {
            System.out.println("\nEntrada inválida. Insira um número válido.");
        }

        scanner.close();
    }

    public static int fatorial(int n) {
        if (n == 0) return 1;
        if (n > 0) return n * fatorial(n - 1);
        return -1;
    }
}
