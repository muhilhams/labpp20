import java.util.Scanner;
public class Nomor2 {
    public static void main(String[] args) {
        Scanner ang = new Scanner(System.in);
        try {
        System.out.println("Masukkan nilai x :");
        int x = ang.nextInt();
        System.out.println("Masukkan nilai y (nilai akhir) :");
        int y = ang.nextInt();
        int i;
        int j;

        if (y > x) {
            if (y > 0) {
                for (i = 1, j = 1; i <= y; i++, j++) {
                    if (j % x == 0) {
                        System.out.println(i + " ");
                    } else {
                        System.out.print(i + " ");
                    }
                }
            }
        } else {
            System.out.println("Nilai y harus lebih besar dari nilai x");
        }
        
        } catch (Exception e) {
            System.out.println("Input bilangan bulat!!!");
        } ang.close();
    }
}
