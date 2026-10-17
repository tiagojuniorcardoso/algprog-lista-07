import java.util.Scanner;

public class Ativ022 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int[][] matriz = new int[5][5];

        int seguros = 0;
        int suspeitos = 0;
        int nocivos = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {

                System.out.print("Digite a flag da posicao ["
                        + i + "][" + j + "] (0, 1 ou 2): ");

                matriz[i][j] = teclado.nextInt();
                if (matriz[i][j] == 0) {
                    seguros++;
                } else if (matriz[i][j] == 1) {
                    suspeitos++;
                } else if (matriz[i][j] == 2) {
                    nocivos++;
                }
            }
        }
        System.out.println("\nQuantidade de conteudos:");
        System.out.println("Conteudos seguros: " + seguros);
        System.out.println("Conteudos suspeitos: " + suspeitos);
        System.out.println("Conteudos nocivos: " + nocivos);

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {

                if (matriz[i][j] == 2) {
                    matriz[i][j] = -1;
                }
            }
        }
        System.out.println("\nMatriz atualizada:");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {

                System.out.print(matriz[i][j] + "\t");
            }

            System.out.println();
        }

        teclado.close();
    }
}
