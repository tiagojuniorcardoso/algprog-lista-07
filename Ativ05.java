import java.util.Scanner;

public class Ativ05 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int[][] matriz = new int[4][4];

        // Preenchendo a matriz
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {

                System.out.println("Digite o tempo de entrega da posicao ["
                        + i + "][" + j + "] em minutos: ");

                matriz[i][j] = teclado.nextInt();
            }
        }
        System.out.println("\nMatriz completa:");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {

                System.out.print(matriz[i][j] + "\t");
            }

            System.out.println();
        }
        int somaBordas = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {

                if (i == 0 || i == 3 || j == 0 || j == 3) {

                    somaBordas += matriz[i][j];
                }
            }
        }

        System.out.println("\nSoma dos tempos das bordas: "
                + somaBordas + " minutos");

        teclado.close();
    }
}
