package pratica2;

import java.util.Scanner;

public class ex9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Tabela dos 7 planetas do sistema solar:");
        System.out.println("1 - Mercúrio");
        System.out.println("2 - Vênus");
        System.out.println("3 - Terra");
        System.out.println("4 - Marte");
        System.out.println("5 - Júpiter");
        System.out.println("6 - Saturno");
        System.out.println("7 - Urano");
        System.out.print("Escolha o planeta (1-7): ");
        int escolhaPlaneta = scanner.nextInt();

        double g;  // Aceleração devido à gravidade
        double h0 = 0;  // Altura inicial

        // Definir a aceleração baseado no planeta escolhido
        switch (escolhaPlaneta) {
            case 1:
                g = 3.7;  // m/s^2 (Aceleração devido à gravidade em Mercúrio)
                break;
            case 2:
                g = 8.87;  // m/s^2 (Aceleração devido à gravidade em Vênus)
                break;
            case 3:
                g = 9.81;  // m/s^2 (Aceleração devido à gravidade na Terra)
                break;
            case 4:
                g = 3.71;  // m/s^2 (Aceleração devido à gravidade em Marte)
                break;
            case 5:
                g = 24.79;  // m/s^2 (Aceleração devido à gravidade em Júpiter)
                break;
            case 6:
                g = 10.44;  // m/s^2 (Aceleração devido à gravidade em Saturno)
                break;
            case 7:
                g = 8.69;  // m/s^2 (Aceleração devido à gravidade em Urano)
                break;
            default:
                System.out.println("Planeta não reconhecido.");
                return;
        }

        System.out.print("Digite a velocidade inicial (v0) em m/s: ");
        double v0 = scanner.nextDouble();

        System.out.print("Digite o instante de tempo (t) em segundos: ");
        double t = scanner.nextDouble();

        double vt = v0 - g * t;
        double ht = v0 * t - 0.5 * g * t * t;

        System.out.println("Velocidade : " + vt + " m/s");
        System.out.println("Altura:  " + ht + " metros");
    }
}

