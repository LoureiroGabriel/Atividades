package pratica1;

import java.util.Scanner;

public class ex4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário do funcionário: ");
        double salario = scanner.nextDouble();

        double aumento = salario * 0.25;
        double novoSalario = salario + aumento;

        System.out.println("O novo salário do funcionário com o aumento de 25% é: R$" + novoSalario);
    }
}