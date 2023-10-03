public class Qst5 {
    public static void main(String[] args) {
        int num = 0; 
        int r;

        String input = System.console().readLine("Insira um número: ");
        try {
            num = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            num = -1; 
        }

        r = fibonacci(num);

        if (r == -1) {
            System.out.println("\nEntrada inválida. Insira um número maior que 0.");
        } else {
            System.out.printf("\nO número correspondente na sequência Fibonacci de %d é: %d\n", num, fibonacci(num));
        }
    }

    public static int fibonacci(int n) {
        if (n == 1) return 1;
        if (n == 2) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
