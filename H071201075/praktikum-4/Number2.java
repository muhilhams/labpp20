import java.util.Scanner;
public class Number2{
	public static void main(String[] args) {
        Scanner main = new Scanner(System.in);
        
		int i= main.nextInt();
		int j= main.nextInt();
		int k = main.nextInt();
		int[][] matriksA = new int[i][j];
		int[][] matriksB = new int[j][k];
        System.out.printf("\n Matriks A(%d,%d)\n" , i,j);
		for(int x = 0; x < i; x++){
			for(int y = 0; y < j; y++){
				matriksA[x][y] = main.nextInt();
			}
        }
        System.out.printf("\nMatriks B(%d,%d)\n" , j,k);
		for(int x = 0; x < j; x++){
			for(int y = 0; y < k; y++){
				matriksB[x][y] = main.nextInt();
			}
        }
        //perkalian matriks
        System.out.printf("\n(Matriks kali(%d,%d)\n" +i,k);
		
		for(int x = 0; x < i; x++){
			for(int y = 0; y < k; y++){
				//int hasil = 0;
				for(int z = 0; z < j; z++){
					//hasil = hasil + matriksA[x][z] * matriksB[z][y];
					System.out.printf("%d ",matriksA[x][z]*matriksB[z][y]);
                }
				//System.out.print(hasil + " ");
			}
			System.out.println();
		}
	}
}
