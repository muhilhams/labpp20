import java.util.Scanner;
public class No2 {
    public static void main(String[] args) {
        int m, n, o, i, j, k;
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan ukuran matriks (m,n,o):");
        m = scan.nextInt();
        n = scan.nextInt();
        o = scan.nextInt();

        int a[][] = new int [m][n];
        System.out.println("Masukkan elemen matriks A:");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                a[i][j] = scan.nextInt();
            }
        }
        int kali[][] = new int [m][o];
        System.out.println("Masukkan elemen matriks B:");
        int b[][] = new int [n][o];
        for (j = 0; j < n; j++) {
            for (k = 0; k < o; k++) {
                b[j][k] = scan.nextInt();
            }
        }
        for (i = 0; i < m; i++) {
            for (j = 0; j < o; j++) {
                kali[i][j] = 0;
                for (k = 0; k < n; k++) {
                    kali[i][j] = kali[i][j] + (a[i][k] * b[k][j]);
                }
            }
        }
        System.out.println("Hasil perkalian matriks A x B:");
        for (i = 0; i < m; i++) {
            for (j = 0; j < o; j++) {
                System.out.print(kali[i][j] + " ");
            }
            System.out.println();
        }
        scan.close();
    }
}
