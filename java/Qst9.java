import java.util.Scanner;

public class Qst9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double salario;

        System.out.print("Digite o salário: ");
        salario = scanner.nextDouble();

        double percentual, aumento, salarioNovo;

        if (salario <= 280) {
            percentual = 20;
        } else if (salario <= 700) {
            percentual = 15;
        } else if (salario <= 1500) {
            percentual = 10;
        } else {
            percentual = 5;
        }

        double[] resultado = calculaAumento(salario, percentual);
        percentual = resultado[0];
        aumento = resultado[1];
        salarioNovo = resultado[2];

        System.out.println("\nValor do salário: " + salario);
        System.out.println("Porcentagem de aumento: " + percentual + "%");
        System.out.println("Aumento de: " + String.format("%.2f", aumento));
        System.out.println("Novo Salário: " + String.format("%.2f", salarioNovo));
    }

    public static double[] calculaAumento(double salario, double percentual) {
        double aumento = salario * (percentual / 100);
        double novoSalario = salario + aumento;
        double[] resultado = { percentual, aumento, novoSalario };
        return resultado;
    }
}
