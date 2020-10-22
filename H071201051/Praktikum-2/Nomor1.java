import java.util.Scanner;

public class Nomor1 {
    public static void main(String[] args) {
        Scanner bil = new Scanner(System.in);
        int a, genap = 0, ganjil = 0;
        int b, positif = 0, negatif = 0;

        try {
        
        for (int i = 1;i <= 5;i++) {
            a = bil.nextInt();
            b = a;
            if (a % 2 == 0) {
                genap = genap + 1;
            } else {
                ganjil = ganjil + 1;
            } 
            if (b > 0) {
                positif = positif + 1;
            } else if (b < 0) {
                negatif = negatif + 1;
            } 
        }
        
        System.out.print(genap + " Angka Genap\n");
        System.out.print(ganjil + " Angka Ganjil\n");
        System.out.print(positif + " Angka Positif\n");
        System.out.print(negatif + " Angka Negatif\n");

        } catch (Exception e) {
            System.out.println("Inputan Tidak Valid");

        }

    }
    
}
