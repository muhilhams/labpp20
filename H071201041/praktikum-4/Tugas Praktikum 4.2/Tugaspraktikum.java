import java.util.Scanner;
public class Tugaspraktikum{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan ukuran matriks");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int matriksA[][] = new int[a][b];
        int matriksB[][] = new int[b][c];
        int matrikshasil[][] = new int[a][c];
        System.out.printf("Masukkan nilai matriks %dX%d\n", a,b);
        for (int i = 0; i<a; i++){
            for(int j = 0; j<b; j++){
                matriksA[i][j] = input.nextInt();
            }
        }
        System.out.printf("Masukkan nilai matriks %dX%d\n", b,c);
        for (int i = 0; i<b; i++){
            for(int j = 0; j<c; j++){
                matriksB[i][j] = input.nextInt();
            }
        }
        System.out.println("Hasil perkalian matriks yaitu :");
        for (int i = 0; i<a; i++){
            for(int j = 0; j<c; j++){
                for(int k = 0; k<b; k++){
                    matrikshasil[i][j] = matrikshasil[i][j] + (matriksA[i][k]*matriksB[k][j]);
                }
            }
        }
        for (int i = 0; i<a; i++){
            for(int j = 0; j<c; j++){
                System.out.print(matrikshasil[i][j]+" ");
            }
            System.out.println();
        }
    }
}