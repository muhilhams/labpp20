import java.util.Scanner;
public class Tugaspraktikum1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan waktu perjalanan (jam) dan kecepatan (km/jam)");
        int waktu = input.nextInt();
        int kecepatan = input.nextInt();
        int jarak = waktu*kecepatan;
        float penggunaanBensin = jarak/14f;
        System.out.printf("Bensin Yang Digunakan : %.3f L", penggunaanBensin);
    }
}