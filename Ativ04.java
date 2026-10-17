import java.util.Scanner;

public class Ativ04 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double[][] eficiencia = new double[3][5];

        double soma = 0;

    
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {

                System.out.println("Digite a eficiencia do painel ["
                        + i + "][" + j + "] (0.0 a 1.0): ");

                eficiencia[i][j] = teclado.nextDouble();

                soma += eficiencia[i][j];
            }
        }
        double media = soma / 15;

        System.out.println("\nMedia global do parque: " + media);
        System.out.println("\nPaineis abaixo da media:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {

                if (eficiencia[i][j] < media) {

                    System.out.println("Painel ["
                            + i + "][" + j + "] = "
                            + eficiencia[i][j]);
                }
            }
        }

        teclado.close();
    }
}
