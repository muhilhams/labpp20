import java.util.Scanner;
public class Nomor1 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Input nilai awal (x)");
        try {
        int x = inp.nextInt();
        System.out.println("Input nilai akhir (y)");
        int y = inp.nextInt();
        int i;

        if (x > y) {
            for (i = y; i <= x;i++) {
                if (i % 2 == 0 && i > 0) {
                    System.out.println(i + " genap positif");
                } else if (i % 2 == 1 && i > 0) {
                    System.out.println(i + " ganjil positif");
                } else if (i % 2 == 0 && i < 0) {
                    System.out.println(i + " genap negatif");
                } else if (i % 2 == -1 && i < 0) {
                    System.out.println(i + " ganjil negatif");
                } else if (i == 0) {
                    System.out.println(i + " nol");
                } 
            }
        } else if (y > x) {
            for (i = x; i <= y;i++) {
                if (i % 2 == 0 && i > 0) {
                    System.out.println(i + " genap positif");
                } else if (i % 2 == 1 && i > 0) {
                    System.out.println(i + " ganjil positif");
                } else if (i % 2 == 0 && i < 0) {
                    System.out.println(i + " genap negatif");
                } else if (i % 2 == -1 && i < 0) {
                    System.out.println(i + " ganjil negatif");
                } else if (i == 0) {
                    System.out.println(i + " nol");
                } 
            } 
        }
    } catch (Exception e) {
        System.out.println("Masukkan bilangan bulat!!!");
    } inp.close();
    }
}
