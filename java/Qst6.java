public class Qst6 {
    public static void main(String[] args) {
        System.out.println("CALCULADORA DE FATORIAIS.\n");

        int x = 10; 

        while (x < 0) {
            System.out.println("Número inválido. Tente novamente.");
            System.out.print("Digite um número positivo: ");
        }

        for (int i = 1; i <= x; i++) {
            int fat = 1;
            for (int j = i; j >= 2; j--) {
                fat *= j;
            }
            System.out.printf("%d! = %d%n", i, fat);
        }
    }
}
