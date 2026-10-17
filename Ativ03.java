import java.util.Scanner;

public class Ativ03 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double[][] temperaturas = new double[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {

                System.out.println("Digite a temperatura da posicao ["
                        + i + "][" + j + "]: ");

                temperaturas[i][j] = teclado.nextDouble();
            }
        }
        double maiorTemperatura = temperaturas[0][0];

        int linhaMaior = 0;
        int colunaMaior = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {

                if (temperaturas[i][j] > maiorTemperatura) {

                    maiorTemperatura = temperaturas[i][j];
                    linhaMaior = i;
                    colunaMaior = j;
                }
            }
        }

        System.out.println("\nMaior temperatura: "
                + maiorTemperatura + " graus Celsius");

        System.out.println("Posicao da maior temperatura: ["
                + linhaMaior + "][" + colunaMaior + "]");
        double somaDiagonal = 0;

        for (int i = 0; i < 4; i++) {
            somaDiagonal += temperaturas[i][i];
        }

        double mediaDiagonal = somaDiagonal / 4;

        System.out.println("Media da diagonal principal: "
                + mediaDiagonal + " graus Celsius");

        teclado.close();
    }
}
