import java.util.Scanner;
public class No1 {

    public static void main(String[] args) {
        Scanner an = new Scanner(System.in);
        System.out.println("Masukkan waktu yang ditempuh dalam perjalanan (jam) :");
        int a = an.nextInt();
        System.out.println("Masukkan kecepatan rata-rata dalam perjalanan (km/jam) :");
        int b = an.nextInt();
        int c = 14;

        float d = (a * b) / (float) c;

        System.out.printf("Bensin Yang Digunakan : %.3f %s", d, "L");
    }

}