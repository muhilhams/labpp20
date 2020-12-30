import java.util.Scanner;
public class Tp02{

    public static void main(String[] args) {
        Scanner rhm = new Scanner(System.in);
		int i = rhm.nextInt();
		int j = rhm.nextInt();
		int k = rhm.nextInt();
		int[][] matriksA = new int[i][j];
		int[][] matriksB = new int[j][k];

        System.out.printf("\nMatriks A (%d,%d)\n" , i,j);
		for(int a = 0; a < i; a++){
			for(int b = 0; b < j; b++){
				matriksA[a][b] = rhm.nextInt();
			}
        }
        System.out.printf("\nMatriks B (%d,%d)\n" , j,k);
		for(int b = 0; b < j; b++){
			for(int c = 0; c < k; c++){
				matriksB[b][c] = rhm.nextInt();
			}
        }
        System.out.printf("\nHasil kali (Matriks C (%d,%d))\n" ,i,k);
		for(int a = 0; a < i; a++){
			for(int b = 0; b < k; b++){
				int total = 0;
				for(int c = 0; c < j; c++){
					total = total + matriksA[a][c] * matriksB[c][b];
                }
				System.out.print(" " +total);
			}
			System.out.println();
		}
	}
}