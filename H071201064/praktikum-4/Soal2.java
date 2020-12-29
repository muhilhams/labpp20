//Nama:Siskanti
//Nim :H071201064
import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        int i, j, k;
        i = user.nextInt();
        j = user.nextInt();
        k = user.nextInt();
        System.out.println();
        int matrices[][] = new int[i][j];
        System.out.println("ordo matrices 3x2");
        for (int l = 0; l < i; l++) {
            for (int m = 0; m < j; m++) {
                matrices[l][m] = user.nextInt();
            }
        }
        System.out.println("\n");
        System.out.println("perkalian matrices, ordo 2x3");
        int matrices2[][] = new int[j][k];
        for (int l = 0; l < j; l++) {
            for (int m = 0; m < k; m++) {
                matrices2[l][m] = user.nextInt();

            }
        }
        //perkalian matrices
        System.out.println("\n");
        System.out.println("hasil perkalian matrices");
        for (int l = 0; l < i; l++) {
            for (int m = 0; m < k; m++) {
                int perkalian = 0;
                for (int n = 0; n < j; n++) {
                    perkalian += matrices[l][n] * matrices2[n][m];
                }
                System.out.print(perkalian + "  ");
            }
            System.out.println();
        }

    }

}
