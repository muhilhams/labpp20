import java.util.Scanner;

public class TP402 {
    public static void main(String[] args) {
        Scanner ax = new Scanner(System.in);
        int i = ax.nextInt(), j = ax.nextInt(), k = ax.nextInt();
        int[][] matriksA = new int[i][j];
        int[][] matriksB = new int[j][k];
        int[][] matriksC = new int[i][k];

        System.out.println("\nInput Matriks A:");
        for (int x = 0; x < i; x++){
            for (int y = 0; y < j; y++){
                matriksA[x][y] = ax.nextInt();
            }
        }

        System.out.println("\nInput Matriks B:");
        for (int x = 0; x < j; x++){
            for (int y = 0; y < k; y++){
                matriksB[x][y] = ax.nextInt();
            }
        }

        System.out.println();
        for (int x = 0; x < i; x++){
            for (int y = 0; y < k; y++){
                for (int z = 0; z < j; z++){
                    matriksC[x][y] = matriksC[x][y] + matriksA[x][z] * matriksB[z][y]; 
                }
            }
        }
        System.out.println("Matriks A x Matriks B:");
        for (int x = 0; x < i; x++){
            for (int y = 0; y < k; y++ ){
                System.out.print(" " + matriksC[x][y]);
            }
            System.out.println(" ");
        }
        ax.close();
    }
}
