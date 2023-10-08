package pratica2;

import java.util.Scanner;

public class ex4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o peso (em kg): ");
        double peso = scanner.nextDouble();

        System.out.print("Digite a altura (em metros): ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        String situacao;

        if (imc < 20) {
            situacao = "Abaixo do Peso";
        } else if (imc >= 20 && imc < 25) {
            situacao = "Normal";
        } else if (imc >= 25 && imc < 30) {
            situacao = "Sobrepeso";
        } else if (imc >= 30 && imc < 40) {
            situacao = "Obesidade";
        } else {
            situacao = "Obesidade Mórbida";
        }

        System.out.println("IMC: " + imc);
        System.out.println("Situação de peso: " + situacao);
    }
}