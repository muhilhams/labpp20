import java.util.Scanner;
public class Tugaspraktikum3 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan secara berurutan: tinggi menara(m), sudut belakang kapal, sudut depan kapal");
        int tinggi = input.nextInt();
        int sudutBelakang = input.nextInt();    int sudutDepan = input.nextInt();
        double jarakBelakang = tinggi*(Math.tan(Math.toRadians(sudutBelakang)));    
        double jarakDepan = tinggi*(Math.tan(Math.toRadians(sudutDepan)));
        double panjangKapal = jarakBelakang-jarakDepan;
        System.out.printf("%.1f m", panjangKapal);

    }
}
