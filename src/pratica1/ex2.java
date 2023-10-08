package pratica1;

import java.util.Scanner;
public class ex2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

        int anoAtual = 2023;

        int idadeAtual = anoAtual - anoNascimento;

        int idade2050 = 2050 - anoNascimento;

        System.out.println("Idade da pessoa no ano atual: " + idadeAtual);

        System.out.println("Idade da pessoa em 2050: " + idade2050);
    }
}


