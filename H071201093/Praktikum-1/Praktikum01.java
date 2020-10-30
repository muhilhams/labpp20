import java.util.Scanner;

class Praktikum{

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        // menggunakan efesiensi 14 Km/L.
        double jam, kecepatan;
        jam = x.nextDouble();
        kecepatan = x.nextDouble();
        double hasil= jam * kecepatan / 14;

        System.out.printf("%s%.3f%s", "Bensin yang digunakan  : ", hasil, " L");
    }
}