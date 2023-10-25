public class Qst5 {
    public static void main(String[] args) {
    
        System.out.println("Sequência de Fibonacci até atingir 100:");

        int num1 = 1;
        int num2 = 1;

        while (num1 <= 100) {
            System.out.print(num1 + " ");
            int temp = num1 + num2;
            num1 = num2;
            num2 = temp;
        }

        System.out.println("\n\nFim da sequência de Fibonacci.");
    }
}
