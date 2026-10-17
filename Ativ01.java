import java.util.Scanner;

public class Ativ01 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double[][] emissoes = new double[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {

                System.out.println("Digite a emissao da filial "
                        + (i + 1) + " no trimestre "
                        + (j + 1) + ": ");

                emissoes[i][j] = teclado.nextDouble();
            }
        }
        System.out.println("\nTotal de emissoes por filial:");

        for (int i = 0; i < 4; i++) {

            double totalFilial = 0;

            for (int j = 0; j < 4; j++) {
                totalFilial += emissoes[i][j];
            }

            System.out.println("Filial " + (i + 1) + ": "
                    + totalFilial + " toneladas de CO2");
        }
        double maiorEmissao = 0;
        int trimestreMaior = 0;

        for (int j = 0; j < 4; j++) {

            double totalTrimestre = 0;

            for (int i = 0; i < 4; i++) {
                totalTrimestre += emissoes[i][j];
            }

            if (j == 0 || totalTrimestre > maiorEmissao) {
                maiorEmissao = totalTrimestre;
                trimestreMaior = j;
            }
        }

        System.out.println("\nTrimestre com maior emissao: "
                + (trimestreMaior + 1));

        System.out.println("Total de emissao nesse trimestre: "
                + maiorEmissao + " toneladas de CO2");

        
    }
}