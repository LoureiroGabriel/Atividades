package pratica1;

import java.util.Scanner;

public class ex7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do salário mínimo: ");
        double salarioMinimo = scanner.nextDouble();

        System.out.print("Digite o salário do funcionário: ");
        double salarioFuncionario = scanner.nextDouble();

        double quantidadeSalariosMinimos = salarioFuncionario / salarioMinimo;

        System.out.println("A quantidade de salários mínimos que o funcionário recebe é: " + quantidadeSalariosMinimos);
    }
}
